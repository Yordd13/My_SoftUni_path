function deleteByEmail() {
    const email = document.querySelector('label input').value;
    const emailsData = document.querySelectorAll('tr td:nth-child(2)');

    for(let data of emailsData){
        if(data.textContent === email){
            let row = data.parentNode;
            row.parentNode.removeChild(row);
            document.getElementById('result').textContent = 'Deleted.';
            return;
        }
    }

    document.getElementById('result').textContent = 'Not found.';
}