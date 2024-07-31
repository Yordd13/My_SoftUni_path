function addItem() {
    const text = document.getElementById('newItemText').value;
    const value = document.getElementById('newItemValue').value;

    if(text !== '' && value !== ''){
        const select = document.getElementById('menu');
        let option = document.createElement('option');
        option.appendChild(document.createTextNode(text));
        option.value = value; 
        
        select.appendChild(option);
    }

    document.getElementById('newItemText').value = '';
    document.getElementById('newItemValue').value = '';
}