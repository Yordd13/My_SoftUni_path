function loadingBar(percent){
    function getBar(percent){
        let bar = '[';
        for(let i = 0; i < 100; i+=10){
            if(i < percent){
                bar += '%';
            } else bar += '.';
        }
        bar += ']';
        return bar;
    }

    let bar = getBar(percent);
    if(percent == 100){
        console.log('100% Complete!');
        console.log(bar);
    } else{
        console.log(`${percent}% ${bar}`);
        console.log('Still loading...');
    }
}

loadingBar(30);