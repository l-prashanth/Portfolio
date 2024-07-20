function scrollToPage(button) {
    const pageId = button.getAttribute('data-page-id');
    const page = document.getElementById(pageId);
    page.scrollIntoView({behavior: 'smooth'});

    const buttons = document.querySelectorAll('.navigation button');
    buttons.forEach(button => button.classList.remove('active'));

    button.classList.add('active');
}
document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("resumeButton").addEventListener("click", function() {
        window.open("https://drive.google.com/file/d/1uoQLBfODh-XOiqjTX5qjBm5rQcv--Yy6/view?usp=sharing", "_blank");
    });
});
document.addEventListener("DOMContentLoaded", function() {
    const titles = ["Java / Spring Boot Developer", "DevOps Engineer"];
    let currentIndex = 0;

    function cycleTitle() {
        const titleElement = document.getElementById("title");
        const titleTextElement = titleElement.querySelector(".title-text");

        currentIndex = (currentIndex + 1) % titles.length;
        titleTextElement.textContent = titles[currentIndex];
    }

    setInterval(cycleTitle, 2500);

    document.getElementById("resumeButton").addEventListener("click", function() {
        window.open("https://drive.google.com/file/d/1uoQLBfODh-XOiqjTX5qjBm5rQcv--Yy6/view?usp=sharing", "_blank");
    });
});

