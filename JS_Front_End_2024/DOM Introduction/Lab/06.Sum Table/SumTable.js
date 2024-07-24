function sumTable() {
    const data = document.querySelectorAll('tbody tr:not(:last-child) td:nth-child(2)');

    const result = document.getElementById('sum');

    let sum = 0;

    for (const cell of data) {
        sum += parseFloat(cell.textContent);
    }

    result.textContent = sum.toFixed(2);
}