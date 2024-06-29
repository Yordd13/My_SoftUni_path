function solve(array, n){
    let outputArr = [];
    for(let i = 0; i < array.length; i++){
        if(i % n === 0){
            outputArr.push(array[i]);
        }
    }
    return outputArr;
}
console.log(solve(['5', '20', '31', '4', '20'], 2));