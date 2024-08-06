function getInfo() {
    document.getElementById('stopName').textContent = '';
    const busID = document.getElementById('stopId').value;
    document.getElementById('buses').innerHTML = '';

    const url = `http://localhost:3030/jsonstore/bus/businfo/${busID}`;

    fetch(url).then(res => res.json())
    .then(result => {
        const name = result.name;
        document.getElementById('stopName').appendChild(document.createTextNode(name));

        const busesUL = document.getElementById('buses');

        const busesArriving = result.buses;
        const buses = Object.entries(busesArriving);
        for(let [id, time] of buses){
            const li = document.createElement('li');
            li.appendChild(document.createTextNode(`Bus ${id} arrives in ${time} minutes`));

            busesUL.appendChild(li);
        }
    }).catch(() => {
        const stopNameElement = document.getElementById('stopName');
        stopNameElement.textContent = '';  
        stopNameElement.appendChild(document.createTextNode('Error'));
    });
}