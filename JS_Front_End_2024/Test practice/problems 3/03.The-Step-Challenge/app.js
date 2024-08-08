const loadButton = document.getElementById('load-records');
const urlRecords = 'http://localhost:3030/jsonstore/records/';
const listRecords = document.getElementById('list');
const editButton = document.getElementById('edit-record');
const addButton = document.getElementById('add-record');

loadButton.addEventListener('click', loadRecords);
addButton.addEventListener('click', addRecord);


function loadRecords(){
    listRecords.innerHTML = '';
    fetch(urlRecords).then(res => res.json())
    .then(data =>{
        for(let record of Object.entries(data)){
            listRecords.appendChild(createRecord(record[1].name, record[1].steps, record[1].calories));
        }
        addChangeDeleteListeners();
    })

    editButton.disabled = true;

}

function addRecord(){
    const name = document.getElementById('p-name').value;
    const steps = document.getElementById('steps').value;
    const calories = document.getElementById('calories').value;

    fetch(urlRecords, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            name: name,
            steps: steps,
            calories: calories
        })
    })
    .then(data => {
        clear();
        loadRecords();
    })
}

function createRecord(name, speps, calories){
    const li = document.createElement('li');
    li.classList.add('record');

    const divRecords = document.createElement('div');
    divRecords.classList.add('info');

    const pName = document.createElement('p');
    pName.textContent = name;
    divRecords.appendChild(pName);

    const pSteps = document.createElement('p');
    pSteps.textContent = speps;
    divRecords.appendChild(pSteps);

    const pCalories = document.createElement('p');
    pCalories.textContent = calories;
    divRecords.appendChild(pCalories);

    li.appendChild(divRecords);

    const divWrapper = document.createElement('div');
    divWrapper.classList.add('btn-wrapper');

    const changeButton = document.createElement('button');
    changeButton.textContent = 'Change';
    changeButton.classList.add('change-btn');
    divWrapper.appendChild(changeButton);

    const deleteButton = document.createElement('button');
    deleteButton.classList.add('delete-btn');
    deleteButton.textContent = 'Delete';
    divWrapper.appendChild(deleteButton);
    li.appendChild(divWrapper);

    return li;
}

function clear(){
    document.getElementById('p-name').value = '';
    document.getElementById('steps').value = '';
    document.getElementById('calories').value = '';
}

function addChangeDeleteListeners(){
    document.querySelectorAll('button.change-btn').forEach(button => {
        button.addEventListener('click', changeRecord);
    });

    document.querySelectorAll('button.delete-btn').forEach(button => {
        button.addEventListener('click', deleteRecord);
    });
}

function changeRecord(event){
    const recordLi = event.target.closest('li');
    const name = recordLi.querySelector('p:nth-of-type(1)').textContent;
    const steps = recordLi.querySelector('p:nth-of-type(2)').textContent;
    const calories = recordLi.querySelector('p:nth-of-type(3)').textContent;

    document.getElementById('p-name').value = name;
    document.getElementById('steps').value = steps;
    document.getElementById('calories').value = calories;


    editButton.disabled = false;
    addButton.disabled = true;

    recordLi.remove();

    editButton.addEventListener('click', editInfo);
    function editInfo(){
        fetch(urlRecords).then(res => res.json())
        .then(data => {
            let recordId = '';
            for(let record in data){
                if(data[record].name === name){
                    recordId = data[record]._id;
                    break;
                }
            }
            fetch(`${urlRecords}${recordId}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json' // Specify the content type
                  },
                body: JSON.stringify({
                    name: document.getElementById('p-name').value,
                    steps: document.getElementById('steps').value,
                    calories: document.getElementById('calories').value
                })
            })
            .then(data => {
                clear();
                loadRecords();
                editButton.disabled = true;
                addButton.disabled = false;
            })
        });
    }
}
function deleteRecord(event){
    const recordLi = event.target.closest('li');
    const name = recordLi.querySelector('p:nth-of-type(1)').textContent;

        fetch(urlRecords).then(res => res.json())
        .then(data => {
            let recordId = '';
            for(let record in data){
                if(data[record].name === name){
                    recordId = data[record]._id;
                    break;
                }
            }
            fetch(`${urlRecords}${recordId}`, {
                method: 'DELETE',
            })
            .then(data => {
                loadRecords();
            })
        });
}