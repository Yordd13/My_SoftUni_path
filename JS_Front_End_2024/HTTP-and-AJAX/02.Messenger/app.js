function attachEvents() {
    const submitButton = document.getElementById('submit');
    const refreshButton = document.getElementById('refresh');

    const url = 'http://localhost:3030/jsonstore/messenger';

    submitButton.addEventListener('click', sendMsg);
    refreshButton.addEventListener('click', showMsg);

    function sendMsg(){
        const name = document.querySelector('#controls input[name="author"]').value;
        const message = document.querySelector('#controls input[name="content"]').value;

        fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                author: name,
                content: message,
            })
        });
        document.querySelector('#controls input[name="author"]').value = '';
        document.querySelector('#controls input[name="content"]').value = '';
    }

    function showMsg(){
        const textArea = document.getElementById('messages');
        textArea.innerHTML = '';
        fetch(url).then(res => res.json())
        .then(data => {
            const messages = Object.values(data).map(msg => `${msg.author}: ${msg.content}`);
            
            textArea.textContent = messages.join('\n');
        });
    }
}

attachEvents();