function solve(year){
    if((year % 100 === 0 && year % 400 !== 0) || year % 4 !== 0){
        console.log("no");
    }
    else{
        console.log("yes");
    }
}

solve(2016);