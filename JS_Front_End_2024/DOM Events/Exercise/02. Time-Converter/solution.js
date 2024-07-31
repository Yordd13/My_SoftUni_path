function attachEventsListeners() {
    const input = document.querySelectorAll('div input:nth-of-type(1)');
    const buttons = document.querySelectorAll('div input:nth-of-type(2)');

    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener('click', () => convert(i));
    }

    function convert(i){
        let newTime = Number(input[i].value);
        let newDays = 0;
        if(i === 0) newDays = newTime;
        else if(i === 1) newDays = newTime / 24;
        else if(i === 2) newDays = newTime / (24 * 60);
        else newDays = newTime / (3600 * 24);

        changeTime(newDays);
    }

    function changeTime(days){
        input[0].value = days;
        input[1].value = days * 24;
        input[2].value = input[1].value * 60;
        input[3].value = input[2].value * 60;
    }
}