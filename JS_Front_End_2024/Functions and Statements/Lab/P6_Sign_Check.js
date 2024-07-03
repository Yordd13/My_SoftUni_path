function signCheck(num1,num2,num3){
    function isNegative(num){
        if(num > 0){
            return false;
        }
        
        return true;
    }

    let countNegative = 0;
    if(isNegative(num1)) countNegative++;
    if(isNegative(num2)) countNegative++;
    if(isNegative(num3)) countNegative++;

    if(countNegative % 2 == 0){
        console.log('Positive');
    }
    else console.log('Negative');
}

signCheck(-5,-12,15);