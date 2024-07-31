function attachEventsListeners() {
    const button = document.getElementById('convert');

    button.addEventListener('click', convert);

    function convert(){
        const inputOption = document.getElementById('inputUnits').value;
        const outputOption = document.getElementById('outputUnits').value;
        const inputDistance = document.getElementById('inputDistance').value;
        const outputDistance = document.getElementById('outputDistance');

        let numInMeters = convertToMeters(inputOption,Number(inputDistance));

        let result = convertToOption(outputOption, numInMeters);
        outputDistance.value = result;
    }

    function convertToMeters(option, distance){
        let res = Number(distance);
        switch(option){
            case 'km': res *= 1000; break;
            case 'cm': res *= 0.01; break;
            case 'mm': res *= 0.001; break;
            case 'mi': res *= 1609.34; break;
            case 'yrd': res *= 0.9144; break;
            case 'ft': res *= 0.3048; break;
            case 'in': res *= 0.0254; break;
        }
        return res;    
    }

    function convertToOption(option, num){
        let res = num;
        switch(option){
            case 'km': res /= 1000; break;
            case 'cm': res /= 0.01; break;
            case 'mm': res /= 0.001; break;
            case 'mi': res /= 1609.34; break;
            case 'yrd': res /= 0.9144; break;
            case 'ft': res /= 0.3048; break;
            case 'in': res /= 0.0254; break;
        }
        return res;  
    }
}