window.addEventListener("load", solve);

function solve(){
    const addButton = document.getElementById('add-btn');
    addButton.addEventListener('click', addInfo);

    function addInfo(){
        const place = document.getElementById('place').value;
        const action = document.getElementById('action').value;
        const person = document.getElementById('person').value;

        clear();

        if(place === '' || action === '' || person === ''){
            return;
        } else {
            const tasksList = document.getElementById('task-list');
            
            const li = document.createElement('li');
            li.classList.add('clean-task');
            const article = document.createElement('article');

            const pPlace = document.createElement('p');
            pPlace.appendChild(document.createTextNode(`Place:${place}`));
            article.appendChild(pPlace);

            const pAction = document.createElement('p');
            pAction.appendChild(document.createTextNode(`Action:${action}`));
            article.appendChild(pAction);

            const pPerson = document.createElement('p');
            pPerson.appendChild(document.createTextNode(`Person:${person}`));
            article.appendChild(pPerson);

            li.appendChild(article);

            const div = document.createElement('div');
            div.classList.add('buttons');

            const editButton = document.createElement('button');
            editButton.appendChild(document.createTextNode('Edit'));
            editButton.classList.add('edit');
            div.appendChild(editButton);

            const doneButton = document.createElement('button');
            doneButton.appendChild(document.createTextNode('Done'));
            doneButton.classList.add('done');
            div.appendChild(doneButton);

            li.appendChild(div);
            tasksList.appendChild(li);

            editButton.addEventListener('click', editInfo);
            function editInfo(){
                document.getElementById('place').value = place;
                document.getElementById('action').value = action;
                document.getElementById('person').value = person;

                tasksList.removeChild(li);
            }

            doneButton.addEventListener('click', saveInfo);
            function saveInfo(){
                tasksList.removeChild(li);

                const doneTasks = document.getElementById('done-list');
                
                li.removeChild(div);
                const deleteButton = document.createElement('button');
                deleteButton.appendChild(document.createTextNode('Delete'));
                deleteButton.classList.add('delete');
                li.appendChild(deleteButton);

                doneTasks.appendChild(li);

                deleteButton.addEventListener('click', deleteInfo);
                function deleteInfo(){
                    doneTasks.removeChild(li);
                }
            }
        }
    }

    function clear(){
        document.getElementById('place').value = '';
        document.getElementById('action').value = '';
        document.getElementById('person').value = '';
    }
}