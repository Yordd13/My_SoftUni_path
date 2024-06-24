function solve(day,age){
    let result;
    if(age >= 0 && age <= 18){
        switch(day){
            case 'Weekday': result = 12; break;
            case 'Weekend': result = 15; break;
            case 'Holiday': result = 5; break;
        }
    }
    else if(age > 18 && age <= 64){
        switch(day){
            case 'Weekday': result = 18; break;
            case 'Weekend': result = 20; break;
            case 'Holiday': result = 12; break;
        }
    }
    else if(age > 64 && age <= 122){
        switch(day){
            case 'Weekday': result = 12; break;
            case 'Weekend': result = 15; break;
            case 'Holiday': result = 10; break;
        }
    }
    else{
        console.log("Error!");
        return;
    }

    console.log(`${result}$`);
}

solve('Weekday',42);