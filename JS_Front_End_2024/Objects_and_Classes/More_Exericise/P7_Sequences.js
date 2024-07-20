function solve(input){
    let output = [];
    for(let i = 0; i < input.length; i++){
        let arr = JSON.parse(input[i]);
        arr.sort((a,b) => b-a);

        let arrString = JSON.stringify(arr);
        let isUnique = output.every(storedArr => JSON.stringify(storedArr) !== arrString);

        if(isUnique){
            output.push(arr);
        }
    }


    output.sort((a,b) => a.length - b.length)
    for(let arr of output){
        console.log(`[${arr.join(', ')}]`);
    }
}

solve(["[-3, -2, -1, 0, 1, 2, 3, 4]",
    "[10, 1, -17, 0, 2, 13]",
    "[4, -3, 3, -2, 2, -1, 1, 0]",
    "[10, 1, -17, 0, 2, 11]"]);
