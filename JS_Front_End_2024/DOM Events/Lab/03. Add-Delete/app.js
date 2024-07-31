function addItem() {
    const text = document.getElementById('newItemText').value;
    const items = document.getElementById('items');

    if(text === '') return;

    let li = document.createElement('li');
    let a = document.createElement('a');
    a.href = '#';
    a.appendChild(document.createTextNode('[Delete]'));
    li.append(document.createTextNode(text));
    li.appendChild(a);

    a.addEventListener('click', clickDelete)
    function clickDelete(){
        li.remove();
    }

    items.append(li);
    document.getElementById('newItemText').value = '';
}