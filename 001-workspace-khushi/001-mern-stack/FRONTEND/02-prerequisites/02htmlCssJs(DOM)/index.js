const taskForm = document.querySelector("#taskForm");
const taskInput = document.querySelector("#taskInput");
const taskList = document.querySelector("#taskList");
const taskCount = document.querySelector("#taskCount");

function updateCount() {
  const count = taskList.children.length;
  taskCount.textContent = `${count} task${count === 1 ? "" : "s"}`;
}

function createTask(text) {
  const item = document.createElement("li");
  const label = document.createElement("span");
  const deleteButton = document.createElement("button");

  label.textContent = text;
  deleteButton.textContent = "Delete";
  deleteButton.className = "delete";
  label.addEventListener("click", () => item.classList.toggle("done"));
  deleteButton.addEventListener("click", () => {
    item.remove();
    updateCount();
  });

  item.append(label, deleteButton);
  taskList.appendChild(item);
  updateCount();
}

taskForm.addEventListener("submit", (event) => {
  event.preventDefault();
  const text = taskInput.value.trim();
  if (!text) return;
  createTask(text);
  taskInput.value = "";
  taskInput.focus();
});
