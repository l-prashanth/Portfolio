const resumeLink= "https://drive.google.com/file/d/1uoQLBfODh-XOiqjTX5qjBm5rQcv--Yy6/view?usp=sharing";
const az204Link= "https://drive.google.com/file/d/1JWIKRft6Yyv0EPUhkTlFUJ_OupRJrKpu/view";
const newTab = "_blank";
const titles = ["Java / Spring Boot Developer", "DevOps Engineer"];
let currentIndex = 0;
function scrollToPage(button) {
    const pageId = button.getAttribute('data-page-id');
    const page = document.getElementById(pageId);
    page.scrollIntoView({behavior: 'smooth'});
    const buttons = document.querySelectorAll('.navigation button');
    buttons.forEach(button => button.classList.remove('active'));
    button.classList.add('active');
}

document.addEventListener("DOMContentLoaded", function() {
    let resumeButton = document.getElementById('resumeButton');
    let az204Button = document.getElementById('az204Id');
    resumeFunc(resumeButton)
    az204Func(az204Button)
    cycleTitle()
});
function resumeFunc(resumeButton){
    resumeButton.addEventListener("click", function() {
        window.open(resumeLink,newTab);
    });
}
function az204Func(az204Button){
    az204Button.addEventListener("click", function() {
        window.open(az204Link,newTab);
    });
}
function cycleTitle() {
    const titleElement = document.getElementById("title");
    const titleTextElement = titleElement.querySelector(".title-text");

    currentIndex = (currentIndex + 1) % titles.length;
    titleTextElement.textContent = titles[currentIndex];
}
setInterval(cycleTitle, 2500);
