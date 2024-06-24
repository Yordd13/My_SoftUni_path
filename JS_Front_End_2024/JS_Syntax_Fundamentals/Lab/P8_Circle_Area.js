function solve(num){
    let result;
    let inputType = typeof num;
    if(inputType === 'number'){
        result = Math.pow(num,2) * Math.PI;
        console.log(result.toFixed(2));
    }
    else{
        console.log(`We can not calculate the circle area, because we receive a ${inputType}.`);
    }
}
solve(5);