function solve(x1,y1,x2,y2){
    //formula -> Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

    let isValid = Number.isInteger(Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)));
    console.log(`{${x1}, ${ y1}} to {0, 0} is ${isValid ? 'valid' : 'invalid'}`);

    isValid = Number.isInteger(Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2)));
    console.log(`{${x2}, ${y2}} to {0, 0} is ${isValid ? 'valid' : 'invalid'}`);

    isValid = Number.isInteger(Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)));
    console.log(`{${x1}, ${y1}} to {${x2}, ${y2}} is ${isValid ? 'valid' : 'invalid'}`);
}

solve(2,1,1,1);