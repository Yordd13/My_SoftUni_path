function solve(array){
    array = array.sort((a,b) => a - b);

    let sortedArr = [];
    let index = 0;
    while(array.length > 0){
        if(index % 2 === 0){
            sortedArr.push(array[0]);
            array.splice(0,1);
        } else{
            sortedArr.push(array[array.length - 1]);
            array.splice(array.length - 1,1);
        }

        index++;
    }
    return sortedArr;
}
console.log(solve([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));