function solve(num){
    let sum = 0;
    while(num !== 0){
        let digit = num %10;

        sum += digit;

        num /= 10;
        num = Math.floor(num);
    }
    console.log(sum);
}

solve(543);
