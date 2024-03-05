document.addEventListener("DOMContentLoaded", function() {
    const sections = document.querySelectorAll(".content section");

    sections.forEach(section => {
        section.addEventListener("mouseenter", function() {
            section.classList.add("highlighted");
        });

        section.addEventListener("mouseleave", function() {
            section.classList.remove("highlighted");
        });
    });
});