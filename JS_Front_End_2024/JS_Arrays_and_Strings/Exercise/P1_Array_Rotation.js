function solve(array, n){
    for(let i = 0; i < n; i++){
        let element = array.splice(0,1);
        array.push(element);
    }
    console.log(array.join(' '));
}
solve([2, 4, 15, 31], 5);