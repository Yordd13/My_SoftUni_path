function addItem() {
    const text = document.getElementById('newItemText').value;
    const items = document.getElementById('items');

    let li = document.createElement('li');

    li.append(document.createTextNode(text));

    items.append(li);
    document.getElementById('newItemText').value = '';
}