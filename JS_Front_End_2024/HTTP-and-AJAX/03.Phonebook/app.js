function attachEvents() {
    const loadButton = document.getElementById('btnLoad');
    const createButton = document.getElementById('btnCreate');
    const urlPhones = 'http://localhost:3030/jsonstore/phonebook';

    loadButton.addEventListener('click', loadPhonebook);
    createButton.addEventListener('click', createPhone);

    function loadPhonebook() {
        const phonebook = document.getElementById('phonebook');
        phonebook.innerHTML = '';

        fetch(urlPhones)
            .then(res => res.json())
            .then(data => {
                for (let key in data) {
                    let li = document.createElement('li');
                    li.textContent = `${data[key].person}: ${data[key].phone}`;

                    let buttonDelete = document.createElement('button');
                    buttonDelete.textContent = 'Delete';
                    li.appendChild(buttonDelete);

                    phonebook.appendChild(li);

                    buttonDelete.addEventListener('click', () => deletePhone(data[key]._id, li));
                }
            })
    }

    function deletePhone(id, listItem) {
        let url = `http://localhost:3030/jsonstore/phonebook/${id}`;
        fetch(url, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(res => {
            if (res.ok) {
                listItem.remove();
            } else {
                console.error('Failed to delete phonebook entry');
            }
        })
    }

    function createPhone() {
        const person = document.getElementById('person').value;
        const phone = document.getElementById('phone').value;

        fetch(urlPhones, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                person: person,
                phone: phone
            })
        })
        .then(res => res.json())
        .then(data => {
            document.getElementById('person').value = '';
            document.getElementById('phone').value = '';
            loadPhonebook();
        })
    }
}

attachEvents();
