function extractText() {
    const listText = document.getElementById('items');
    const result =  document.getElementById('result');

    const textResult = listText.textContent.split('\n').map(row => row.trim()).join('\n').trim();

    result.textContent = textResult;
}