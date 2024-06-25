function solve(startingYield){
    let days = 0;
    let extractedSpice = 0; 
    while(startingYield >= 100){

        extractedSpice += startingYield - 26;
        days += 1;
        startingYield -= 10;

    }

    if(days !== 0){
        extractedSpice -= 26;
    }

    console.log(days);
    console.log(extractedSpice);
}

solve(450);