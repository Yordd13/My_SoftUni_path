function solve() {

    let url = 'http://localhost:3030/jsonstore/bus/schedule/depot';
    let currentStop = '';
    
    const info = document.querySelector('.info');

    const departButton = document.getElementById('depart');
    departButton.addEventListener('click', depart);

    function depart() {

            document.querySelector('.info').innerHTML = '';
            fetch(url).then(res => res.json())
            .then(result => {
                currentStop = result.name;

                info.textContent = `Next stop ${currentStop}`;
                
                document.getElementById('depart').disabled = true;
                document.getElementById('arrive').disabled = false;
            });
    }

    const arriveButton = document.getElementById('arrive');
    arriveButton.addEventListener('click', arrive);

    async function arrive() {

        document.querySelector('.info').innerHTML = '';

        fetch(url).then(res => res.json())
        .then(result => {
            currentStop = result.name;
            const nextStop = result.next;

            info.textContent = `Arriving at ${currentStop}`;
            url = `http://localhost:3030/jsonstore/bus/schedule/${nextStop}`;
            
            document.getElementById('depart').disabled = false;
            document.getElementById('arrive').disabled = true;
        });
    }

    return {
        depart,
        arrive
    };
}

let result = solve();