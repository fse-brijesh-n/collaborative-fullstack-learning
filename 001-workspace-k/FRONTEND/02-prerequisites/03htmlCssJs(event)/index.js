const form = document.querySelector("#itemForm");
const input = document.querySelector("#itemInput");
const list = document.querySelector("#itemList");
const message = document.querySelector("#message");

form.addEventListener("submit", (event) => {
  event.preventDefault();
  const text = input.value.trim();
  if (!text) return;

  const item = document.createElement("li");
  const label = document.createElement("span");
  const removeButton = document.createElement("button");
  label.textContent = text;
  removeButton.textContent = "Remove";
  removeButton.type = "button";
  item.append(label, removeButton);
  list.appendChild(item);
  input.value = "";
  input.focus();
});

// Event delegation handles clicks from every current and future list item.
list.addEventListener("click", (event) => {
  const item = event.target.closest("li");
  if (!item) return;

  if (event.target.tagName === "BUTTON") {
    item.remove();
    message.textContent = "Item removed.";
    return;
  }

  item.classList.toggle("selected");
  message.textContent = item.classList.contains("selected")
    ? "Item marked as purchased."
    : "Item marked as unpurchased.";
});

input.addEventListener("input", () => {
  message.textContent = `${input.value.length} characters typed`;
});
