function extract(content) {
    const data = document.getElementById(content);
    const matches = data.textContent.matchAll(/\(([a-zA-Z ]+)\)/g);
    const text = Array.from(matches).map(match => match[1]).join('; ');
    return text;
}