window.addEventListener("load", solve);

function solve(){
    const addButton = document.getElementById('add-btn');
    addButton.addEventListener('click', addInfo);

    function addInfo(){
        const type = document.getElementById('expense').value;
        const amount = document.getElementById('amount').value;
        const date = document.getElementById('date').value;

        if(type === '' || amount === '' || date === ''){
            return;
        } else{
            clear();

            const li = document.createElement('li');
            li.classList.add('expense-item');

            const article = document.createElement('article');

            const pType = document.createElement('p');
            pType.appendChild(document.createTextNode(`Type: ${type}`));
            article.appendChild(pType);
            
            const pAmount = document.createElement('p');
            pAmount.appendChild(document.createTextNode(`Amount: ${amount}$`));
            article.appendChild(pAmount);

            const pDate = document.createElement('p');
            pDate.appendChild(document.createTextNode(`Date: ${date}`));
            article.appendChild(pDate);

            const div = document.createElement('div');
            div.classList.add('buttons');

            const editButton = document.createElement('button');
            editButton.classList.add('btn', 'edit');
            editButton.appendChild(document.createTextNode('edit'));
            div.appendChild(editButton);

            const okButton = document.createElement('button');
            okButton.classList.add('btn','ok');
            okButton.appendChild(document.createTextNode('ok'));
            div.appendChild(okButton);

            li.appendChild(article);
            li.appendChild(div);

            document.getElementById('preview-list').appendChild(li);

            addButton.disabled = true;

            editButton.addEventListener('click', editInfo);
            function editInfo(){
                addButton.disabled = false;

                document.getElementById('expense').value = type;
                document.getElementById('amount').value = amount;
                document.getElementById('date').value = date;

                document.getElementById('preview-list').removeChild(li);
            }

            okButton.addEventListener('click', saveInfo);
            function saveInfo(){
                addButton.disabled = false;

                li.removeChild(div);

                document.getElementById('expenses-list').appendChild(li);
            }

            const deleteButton = document.querySelector('#expenses button');
            deleteButton.addEventListener('click', deleteInfo);
            function deleteInfo(){
                location.reload();
            }
        }
    }

    function clear(){
        document.getElementById('expense').value = '';
        document.getElementById('amount').value = '';
        document.getElementById('date').value = '';
    }
}