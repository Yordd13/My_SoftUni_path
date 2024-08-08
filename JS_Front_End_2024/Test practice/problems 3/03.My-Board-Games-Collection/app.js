const url = 'http://localhost:3030/jsonstore/games/';
const gameList = document.getElementById('games-list');

const loadButton = document.getElementById('load-games');
const editButton = document.getElementById('edit-game');
const addButton = document.getElementById('add-game');

loadButton.addEventListener('click', loadGames);
addButton.addEventListener('click', addGame);

function loadGames(){
    gameList.innerHTML = '';
    fetch(url).then(res => res.json())
    .then(data => {
        for(let entry in data){
            gameList.appendChild(loadGame(data[entry].name, data[entry].players, data[entry].type));
        }

        addDeleteAndChangeButtonEvents();

        editButton.disabled = true;
    });
}
function addGame(){
    const name = document.getElementById('g-name').value;
    const type = document.getElementById('type').value;
    const players = document.getElementById('players').value;

    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            name: name,
            type: type,
            players: players
        })
    })
    .then(data => {
        clear();
        loadGames();
    })
}

function clear(){
    document.getElementById('g-name').value = '';
    document.getElementById('type').value = '';
    document.getElementById('players').value = '';
}

function loadGame(name, players, type){
    const divWrap = document.createElement('div');
    divWrap.classList.add('board-game');

    const divData = document.createElement('div');
    divData.classList.add('content');

    const pName = document.createElement('p');
    pName.textContent = name;
    divData.appendChild(pName);

    const pPlayers = document.createElement('p');
    pPlayers.textContent = players;
    divData.appendChild(pPlayers);

    const pType = document.createElement('p');
    pType.textContent = type;
    divData.appendChild(pType);

    divWrap.appendChild(divData);

    divWrap.innerHTML += `<div class="buttons-container">
                <button class="change-btn">Change</button>
                <button class="delete-btn">Delete</button>
              </div>`;

    return divWrap;
}
function addDeleteAndChangeButtonEvents(){
    document.querySelectorAll('button.change-btn').forEach(button => {
        button.addEventListener('click', changeGame);
    });

    document.querySelectorAll('button.delete-btn').forEach(button => {
        button.addEventListener('click', deleteGame);
    });
}

function changeGame(event){
    let div = event.target.closest('.board-game');
    let name =div.querySelector('p:nth-of-type(1)').textContent;
    let players =div.querySelector('p:nth-of-type(2)').textContent;
    let type =div.querySelector('p:nth-of-type(3)').textContent;

    document.getElementById('g-name').value = name;
    document.getElementById('type').value = type;
    document.getElementById('players').value = players;

    div.remove();

    editButton.disabled = false;
    addButton.disabled = true;

    editButton.addEventListener('click', editInfo);

    function editInfo(){
        fetch(url).then(res => res.json())
        .then(data => {
        let id = '';
        for(let entry in data){
            if(data[entry].name === name){
                id = data[entry]._id;
            }
        }

        fetch(`${url}${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name: document.getElementById('g-name').value,
                type: document.getElementById('type').value,
                players: document.getElementById('players').value
            })
        })
        .then(data => {
            clear();
            loadGame();
            editButton.disabled = true;
            addButton.disabled = false;
        })
    })
    }
}

function deleteGame(event){
    let div = event.target.closest('.board-game');
    let name =div.querySelector('p:nth-of-type(1)').textContent;

    fetch(url).then(res => res.json())
    .then(data => {
        let id = '';
        for(let entry in data){
            if(data[entry].name === name){
                id = data[entry]._id;
            }
        }

        fetch(`${url}${id}`, {
            method: 'DELETE',
        })
        .then(data=>{
            loadGames();
        })
    })
}