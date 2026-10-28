// Plain vanilla JS - no build step needed, so any developer can open this folder,
// serve it statically (see docs/12-frontend.md) and immediately see it work end to end
// against the API Gateway + all 4 business services.

const state = {
  token: localStorage.getItem("demo_jwt") || null,
  username: localStorage.getItem("demo_username") || null,
};

const gatewayUrlInput = document.getElementById("gatewayUrl");
const sessionStatus = document.getElementById("sessionStatus");

function gatewayUrl() {
  return gatewayUrlInput.value.replace(/\/$/, "");
}

function refreshSessionBadge() {
  if (state.token) {
    sessionStatus.textContent = `Logged in as ${state.username}`;
    sessionStatus.className = "status-pill status-pill--auth";
  } else {
    sessionStatus.textContent = "Not logged in";
    sessionStatus.className = "status-pill status-pill--anon";
  }
}

function setToken(token, username) {
  state.token = token;
  state.username = username;
  localStorage.setItem("demo_jwt", token);
  localStorage.setItem("demo_username", username);
  refreshSessionBadge();
}

/**
 * Thin fetch wrapper: attaches the JWT (if present) as
 * "Authorization: Bearer <token>" on every request except the public
 * register/login endpoints, and pretty-prints the JSON result into the
 * given <pre> output box. Mirrors exactly what docs/10-authentication-and-tokens.md
 * describes as the client-side contract every service enforces.
 */
async function callApi(path, options, outputEl) {
  const headers = options.headers || {};
  if (state.token && !path.startsWith("/auth/api/auth/register") && !path.startsWith("/auth/api/auth/login")) {
    headers["Authorization"] = `Bearer ${state.token}`;
  }

  try {
    const response = await fetch(`${gatewayUrl()}${path}`, { ...options, headers });
    const contentType = response.headers.get("content-type") || "";
    const body = contentType.includes("application/json") ? await response.json() : await response.text();

    if (outputEl) {
      outputEl.textContent = `HTTP ${response.status}\n${JSON.stringify(body, null, 2)}`;
    }
    return { ok: response.ok, status: response.status, body };
  } catch (err) {
    if (outputEl) {
      outputEl.textContent = `Network error calling ${path}: ${err.message}\n\n` +
        "Tip: is the API Gateway running and reachable at the URL above? " +
        "See docs/09-troubleshooting.md.";
    }
    return { ok: false, status: 0, body: null };
  }
}

// ---------- Tabs ----------
document.querySelectorAll(".tab-button").forEach((btn) => {
  btn.addEventListener("click", () => {
    document.querySelectorAll(".tab-button").forEach((b) => b.classList.remove("active"));
    document.querySelectorAll(".tab-panel").forEach((p) => p.classList.remove("active"));
    btn.classList.add("active");
    document.getElementById(`tab-${btn.dataset.tab}`).classList.add("active");
  });
});

// ---------- Auth ----------
const authOutput = document.getElementById("authOutput");

document.getElementById("registerForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const form = new FormData(e.target);
  await callApi(
    "/auth/api/auth/register",
    {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username: form.get("username"), password: form.get("password") }),
    },
    authOutput
  );
});

document.getElementById("loginForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const form = new FormData(e.target);
  const result = await callApi(
    "/auth/api/auth/login",
    {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username: form.get("username"), password: form.get("password") }),
    },
    authOutput
  );
  if (result.ok && result.body && result.body.data && result.body.data.token) {
    setToken(result.body.data.token, result.body.data.username);
  }
});

// ---------- Batch jobs ----------
const batchOutput = document.getElementById("batchOutput");

document.getElementById("triggerJobForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const form = new FormData(e.target);
  const jobName = encodeURIComponent(form.get("jobName"));
  await callApi(`/batch/api/batch/jobs/${jobName}/trigger`, { method: "POST" }, batchOutput);
});

document.getElementById("refreshJobs").addEventListener("click", async () => {
  const filter = document.getElementById("jobNameFilter").value.trim();
  const query = filter ? `?jobName=${encodeURIComponent(filter)}` : "";
  await callApi(`/batch/api/batch/jobs${query}`, { method: "GET" }, batchOutput);
});

// ---------- Documents ----------
const documentsOutput = document.getElementById("documentsOutput");
const documentsList = document.getElementById("documentsList");

document.getElementById("uploadDocForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const fileInput = e.target.querySelector('input[name="file"]');
  if (!fileInput.files.length) return;

  const formData = new FormData();
  formData.append("file", fileInput.files[0]);

  await callApi("/documents/api/documents", { method: "POST", body: formData }, documentsOutput);
  await loadDocuments();
});

async function loadDocuments() {
  const result = await callApi("/documents/api/documents", { method: "GET" }, documentsOutput);
  documentsList.innerHTML = "";
  if (result.ok && result.body && Array.isArray(result.body.data)) {
    result.body.data.forEach((doc) => {
      const row = document.createElement("div");
      row.className = "list-item";
      row.innerHTML = `<span>#${doc.id} - ${doc.fileName} (${doc.size} bytes)</span>`;
      const link = document.createElement("a");
      link.href = "#";
      link.textContent = "Download";
      link.addEventListener("click", async (evt) => {
        evt.preventDefault();
        await downloadDocument(doc.id, doc.fileName);
      });
      row.appendChild(link);
      documentsList.appendChild(row);
    });
  }
}

async function downloadDocument(id, fileName) {
  const headers = state.token ? { Authorization: `Bearer ${state.token}` } : {};
  const response = await fetch(`${gatewayUrl()}/documents/api/documents/${id}`, { headers });
  if (!response.ok) {
    documentsOutput.textContent = `HTTP ${response.status} while downloading document #${id}`;
    return;
  }
  const blob = await response.blob();
  const url = URL.createObjectURL(blob);
  const a = document.createElement("a");
  a.href = url;
  a.download = fileName || `document-${id}`;
  document.body.appendChild(a);
  a.click();
  a.remove();
  URL.revokeObjectURL(url);
}

document.getElementById("refreshDocs").addEventListener("click", loadDocuments);

// ---------- Logs ----------
const logsOutput = document.getElementById("logsOutput");

document.getElementById("postLogForm").addEventListener("submit", async (e) => {
  e.preventDefault();
  const form = new FormData(e.target);
  await callApi(
    "/logs/api/logs",
    {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({
        sourceService: form.get("sourceService"),
        level: form.get("level"),
        message: form.get("message"),
      }),
    },
    logsOutput
  );
});

document.getElementById("refreshLogs").addEventListener("click", async () => {
  const filter = document.getElementById("sourceServiceFilter").value.trim();
  const query = filter ? `?sourceService=${encodeURIComponent(filter)}` : "";
  await callApi(`/logs/api/logs${query}`, { method: "GET" }, logsOutput);
});

refreshSessionBadge();
