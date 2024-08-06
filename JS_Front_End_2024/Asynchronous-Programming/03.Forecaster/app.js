function attachEvents() {
    const getWeather = document.getElementById('submit');
    getWeather.addEventListener('click', forecast);

    function forecast(){
        const url = 'http://localhost:3030/jsonstore/forecaster/locations';
        const location = document.getElementById('location').value;
        document.getElementById('forecast').style.display = 'block';

        fetch(url).then(res => res.json())
        .then(result => {
           let forecastLocation = result.find(loc => loc.name === location);
           document.getElementById('upcoming').innerHTML = '<div class="label">Three-day forecast</div>';
           document.getElementById('current').innerHTML = '<div class="label">Current conditions</div>';

           const code = forecastLocation.code;
           
           const urlToday = `http://localhost:3030/jsonstore/forecaster/today/${code}`;

           fetch(urlToday).then(r => r.json())
           .then(today => {
                currentForecast(today);
           });

           const urlUpcoming = `http://localhost:3030/jsonstore/forecaster/upcoming/${code}`;
           fetch(urlUpcoming).then(r => r.json())
           .then(coming => {
                upcomingForecast(coming.forecast);
           }); 

        }).catch(() => {
            document.getElementById('current').textContent = 'Error';
       });;
    }
    function currentForecast(day){
        let condition = day.forecast.condition;
        let high = day.forecast.high;
        let low = day.forecast.low;
        let name = day.name;

        const current = document.getElementById('current');
        
        let div = document.createElement('div');
        div.classList.add('forecasts');

        let spanSymbol = document.createElement('span');
        spanSymbol.classList.add('condition','symbol');
        spanSymbol.appendChild(document.createTextNode(`${getSymbol(condition)}`));
        div.appendChild(spanSymbol);

        let spanCondition = document.createElement('span');
        spanCondition.classList.add('condition');
        let spanData1 = document.createElement('span');
        spanData1.classList.add('forecast-data');

        spanData1.textContent = `${name}`;
        spanCondition.appendChild(spanData1);

        let spanData2 = document.createElement('span');
        spanData2.classList.add('forecast-data');
        spanData2.textContent = `${low}°/${high}°`
        spanCondition.appendChild(spanData2);

        let spanData3 = document.createElement('span');
        spanData3.classList.add('forecast-data');
        spanData3.textContent = `${condition}`;
        spanCondition.appendChild(spanData3);

        div.appendChild(spanCondition);
        
        current.appendChild(div);
    }
    function upcomingForecast(data){
        let entries = Object.entries(data);

        const divForecast = document.createElement('div');
        divForecast.classList.add('forecast-info');

        for(let entry of entries){
            const spanUpcoming = document.createElement('span');
            spanUpcoming.classList.add('upcoming');

            const spanSymbol = document.createElement('span');
            spanSymbol.classList.add('symbol');
            spanSymbol.textContent = `${getSymbol(entry[1].condition)}`;
            spanUpcoming.appendChild(spanSymbol);

            const spanData1 = document.createElement('span');
            spanData1.classList.add('forecast-data');
            spanData1.textContent = `${entry[1].low}°/${entry[1].high}°`;
            spanUpcoming.appendChild(spanData1);

            const spanData2 = document.createElement('span');
            spanData2.classList.add('forecast-data');
            spanData2.textContent = `${entry[1].condition}`;
            spanUpcoming.appendChild(spanData2);

            divForecast.appendChild(spanUpcoming);
        }

        document.getElementById('upcoming').appendChild(divForecast);
    }
    function getSymbol(weather){
        switch(weather){
            case 'Sunny': return '☀';
            case 'Partly sunny': return '⛅';
            case 'Overcast': return '☁';
            case 'Rain': return '☂';
        }
    }
}

attachEvents();