let clickedLight = true;
let clickedDark = false;

let bodyElement = document.body;
let mainContentElement = document.getElementById("mainContent");
let setupElement = document.getElementById("setup");
let variant1Element = document.getElementById("theme1");
let variant2Element = document.getElementById("theme2");
let variant3Element = document.getElementById("theme3");

let backButtonElement = document.getElementById("back-button");

let textElement = document.getElementById("text1");
let secondaryTextElement = document.getElementById("secondary-text");
let text0Element = document.getElementById("text0");
let text2Element = document.getElementById("text2");
let text3Element = document.getElementById("text3");

function toggleDarkMode() {
    if (clickedDark === false) {
        bodyElement.classList.toggle("dark");
        mainContentElement.classList.toggle("dark");
        setupElement.classList.toggle("dark");
        variant1Element.classList.toggle("dark");
        variant2Element.classList.toggle("dark");
        variant3Element.classList.toggle("dark");
        secondaryTextElement.classList.toggle("dark");
        backButtonElement.classList.toggle("dark");
        textElement.classList.toggle("dark");
        text0Element.classList.toggle("dark");
        text2Element.classList.toggle("dark");
        text3Element.classList.toggle("dark");
        clickedDark = true;
        clickedLight = false;
    }
}
function toggleLightMode() {
    if (clickedLight === false) {
        bodyElement.classList.toggle("dark");
        mainContentElement.classList.toggle("dark");
        setupElement.classList.toggle("dark");
        variant1Element.classList.toggle("dark");
        variant2Element.classList.toggle("dark");
        variant3Element.classList.toggle("dark");
        secondaryTextElement.classList.toggle("dark");
        backButtonElement.classList.toggle("dark");
        textElement.classList.toggle("dark");
        text0Element.classList.toggle("dark");
        text2Element.classList.toggle("dark");
        text3Element.classList.toggle("dark");
        clickedLight = true;
        clickedDark = false;
    }
}