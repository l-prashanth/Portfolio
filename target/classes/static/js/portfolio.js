const resumeLink= "https://drive.google.com/file/d/1uoQLBfODh-XOiqjTX5qjBm5rQcv--Yy6/view?usp=sharing";
const az204Link= "https://drive.google.com/file/d/1JWIKRft6Yyv0EPUhkTlFUJ_OupRJrKpu/view";
const az900Link= "https://drive.google.com/file/d/1EOMyp4cib9yqmo7f4ncT4Mn8UUZ1xbkV/view";
const restApiLink= "https://drive.google.com/file/d/1i7THctG_AkDnrNwpQYoJd3vhNc1nBVrw/view";
const outstandingLink= "https://drive.google.com/file/d/1s3-Gioo06hsZUk78JwduLMqeKjQh1yqA/view";
const onTheSpotLink= "https://drive.google.com/file/d/188Vm7qwJYd795Wky9bsMr0GPTj2OCf7Y/view";
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
    let az900Button = document.getElementById('az900Id');
    let restApiButton = document.getElementById('restApiId');
    let outstandingButton = document.getElementById('outstandingId');
    let onTheSpotButton = document.getElementById('onTheSpotId');
    resumeFunc(resumeButton)
    az204Func(az204Button)
    az900Func(az900Button)
    restApiFunc(restApiButton)
    outstandingFunc(outstandingButton)
    onTheSPotFunc(onTheSpotButton)
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
function az900Func(az900Button){
    az900Button.addEventListener("click", function() {
        window.open(az900Link,newTab);
    });
}
function restApiFunc(restApiButton){
    restApiButton.addEventListener("click", function() {
        window.open(restApiLink,newTab);
    });
}
function outstandingFunc(outstandingFunc){
    outstandingFunc.addEventListener("click", function() {
        window.open(outstandingLink,newTab);
    });
}
function onTheSPotFunc(onTheSpotButton){
    onTheSpotButton.addEventListener("click", function() {
        window.open(onTheSpotLink,newTab);
    });
}
function cycleTitle() {
    const titleElement = document.getElementById("title");
    const titleTextElement = titleElement.querySelector(".title-text");

    currentIndex = (currentIndex + 1) % titles.length;
    titleTextElement.textContent = titles[currentIndex];
}
setInterval(cycleTitle, 2500);
