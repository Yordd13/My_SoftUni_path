function solve(n, array){
    let output = [];
    for(let i = 0; i < n; i++){
        output.push(array[i]);
    }
    let reverseOutput = [];
    for(let i = output.length - 1; i >= 0; i--){
        reverseOutput.push(output[i]);
    }

    console.log(reverseOutput.join(' '))
}
solve(2, [66, 43, 75, 89, 47]);