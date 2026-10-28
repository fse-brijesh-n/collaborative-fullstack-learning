const API_URL = "https://jsonplaceholder.typicode.com/users";
const form = document.querySelector("#searchForm");
const input = document.querySelector("#searchInput");
const status = document.querySelector("#status");
const results = document.querySelector("#results");

async function loadUsers(searchTerm) {
  status.textContent = "Loading...";
  status.className = "";
  results.replaceChildren();

  try {
    const response = await fetch(API_URL);
    if (!response.ok) throw new Error(`Request failed: ${response.status}`);

    const users = await response.json();
    const matches = users.filter((user) =>
      user.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    if (matches.length === 0) {
      status.textContent = "No users found.";
      return;
    }

    matches.forEach((user) => {
      const article = document.createElement("article");
      const name = document.createElement("strong");
      const email = document.createElement("span");
      const company = document.createElement("span");
      name.textContent = user.name;
      email.textContent = user.email;
      company.textContent = user.company.name;
      article.className = "user";
      article.append(name, document.createElement("br"), email,
        document.createElement("br"), company);
      results.appendChild(article);
    });
    status.textContent = `${matches.length} user(s) found.`;
  } catch (error) {
    status.textContent = error.message;
    status.className = "error";
  }
}

form.addEventListener("submit", (event) => {
  event.preventDefault();
  loadUsers(input.value.trim());
});
