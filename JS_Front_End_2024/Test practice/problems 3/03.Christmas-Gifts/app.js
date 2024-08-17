const url = 'http://localhost:3030/jsonstore/gifts/';
const loadButton = document.getElementById('load-presents');
const addButton = document.getElementById('add-present');
const editButton = document.getElementById('edit-present');
const list = document.getElementById('gift-list');

addButton.addEventListener('click', addPresent);
loadButton.addEventListener('click', loadPresents);

function loadPresents() {
    list.innerHTML = '';
    fetch(url).then(res => res.json())
        .then(data => {
            for (let entry in data) {
                let name = data[entry].for;
                let gift = data[entry].gift;
                let price = data[entry].price;

                list.appendChild(createGiftSock(gift, name, price));
            }

            addDeleteAndChangeButtonEvents();

            editButton.disabled = true;
        });
}

function addPresent(){
    const gift = document.getElementById('gift').value;
    const name = document.getElementById('for').value;
    const price = document.getElementById('price').value;

    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            gift: gift,
            for: name,
            price: price
        })
    }).then(data => {
        clear();
        loadPresents();
    })
}

function clear(){
    document.getElementById('gift').value = '';
    document.getElementById('for').value = '';
    document.getElementById('price').value = '';
}

function createGiftSock(gift, name, price){
    const div = document.createElement('div');
    div.classList.add('gift-sock');

    const divContent = document.createElement('div');
    divContent.classList.add('content');

    const pGift = document.createElement('p');
    pGift.textContent += gift;
    divContent.appendChild(pGift);

    const pName = document.createElement('p');
    pName.textContent += name;
    divContent.appendChild(pName);

    const pPrice = document.createElement('p');
    pPrice.textContent += price;
    divContent.appendChild(pPrice);

    div.appendChild(divContent);
    div.innerHTML += `<div class="buttons-container">
                <button class="change-btn">Change</button>
                <button class="delete-btn">Delete</button>
              </div>`;
    return div;
}

function addDeleteAndChangeButtonEvents(){
    document.querySelectorAll('button.change-btn').forEach(button => {
        button.addEventListener('click', changePresent);
    });

    document.querySelectorAll('button.delete-btn').forEach(button => {
        button.addEventListener('click', deletePresent);
    });
}

function changePresent(event) {
    let div = event.target.closest('.gift-sock');
    let gift = div.querySelector('p:nth-of-type(1)').textContent;
    let name = div.querySelector('p:nth-of-type(2)').textContent;
    let price = div.querySelector('p:nth-of-type(3)').textContent;

    document.getElementById('gift').value = gift;
    document.getElementById('for').value = name;
    document.getElementById('price').value = price;

    div.remove();

    editButton.disabled = false;
    addButton.disabled = true;

    editButton.addEventListener('click', editInfo);

    function editInfo(){
        fetch(url)
        .then(res => res.json())
        .then(data => {
            let id = '';
            for (let entry in data) {
                if (data[entry].for === name) {
                    id = data[entry]._id;
                    break;
                }
            }

            fetch(`${url}${id}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    gift: document.getElementById('gift').value,
                    for: document.getElementById('for').value,
                    price: document.getElementById('price').value
                })
            })
            .then(data => {
                clear();
                loadPresents();
                editButton.disabled = true;
                addButton.disabled = false;
            })
        })
    }
}

function deletePresent(event) {
    let div = event.target.closest('.gift-sock');
    let name = div.querySelector('p:nth-of-type(2)').textContent;

    fetch(url)
        .then(res => res.json())
        .then(data => {
            let id = '';
            for (let entry in data) {
                if (data[entry].for === name) {
                    id = data[entry]._id;
                    break;
                }
            }

            fetch(`${url}${id}`, {
                method: 'DELETE',
            })
                .then(() => {
                    loadPresents();
                })
        })
}
