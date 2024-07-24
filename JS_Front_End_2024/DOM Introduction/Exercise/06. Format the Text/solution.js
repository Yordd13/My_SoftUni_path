function solve() {
    const input = document.getElementById("input").value;
    const sentences = input.split('.').filter(sentence => sentence.trim().length > 0);

    const output = document.getElementById("output");
    output.innerHTML = "";

    let paragraphContent = "";
    for (let i = 0; i < sentences.length; i++) {
        paragraphContent += sentences[i].trim() + '. ';
        if ((i + 1) % 3 === 0 || i === sentences.length - 1) {
            const paragraph = `<p>${paragraphContent.trim()}</p>`;
            output.innerHTML += paragraph;
            paragraphContent = "";
        }
    }
}