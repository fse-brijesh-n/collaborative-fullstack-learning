
// document.getElementById("submit").addEventListener("click",function()
// {
// document.querySelector(".khushi").style.backgroundColor="blue";
//
let isBlue = false;

document.getElementById("submit").addEventListener("click", function () {
    let box = document.querySelector(".khushi");

    if (!isBlue) {
        box.style.backgroundColor = "blue";
        isBlue = true;
    } else {
        box.style.backgroundColor = ""; // 🔥 CSS wala color wapas
        isBlue = false;
    }
});
