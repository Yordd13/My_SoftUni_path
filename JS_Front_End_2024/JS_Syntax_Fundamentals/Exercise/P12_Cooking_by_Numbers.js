function solve(num, opertaion1, opertaion2, opertaion3,opertaion4,opertaion5){
    let array = [opertaion1,opertaion2,opertaion3,opertaion4,opertaion5];
    for(let i = 0; i < 5; i++){
        let command = array[i];
        switch(command){
            case "chop": num /= 2; break;
            case "dice": num = Math.sqrt(num); break;
            case "spice": num += 1; break;
            case "bake": num *= 3; break;
            case "fillet": num -= num * 0.20; break;
        }
        console.log(num);
    }
}
solve('9', 'dice', 'spice', 'chop', 'bake', 'fillet');