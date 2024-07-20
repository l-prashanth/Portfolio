function scrollToPage(button) {
    const pageId = button.getAttribute('data-page-id');
    const page = document.getElementById(pageId);
    page.scrollIntoView({behavior: 'smooth'});

    const buttons = document.querySelectorAll('.navigation button');
    buttons.forEach(button => button.classList.remove('active'));

    button.classList.add('active');
}