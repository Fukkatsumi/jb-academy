document.addEventListener("keydown", function(event) {
    let key = event.key.toUpperCase();
    let audio = new Audio("../keys/"+ key +".mp3");

    console.log(`The '${key}' key is pressed`);
    audio.play();
});