function solve(num){
    let sum = 0;
    let check = true;
    let lastDigit = num % 10;
    while(num !== 0){
        let digit = num %10;

        if(check === true){
            if(digit !== lastDigit){
                check = false;
            }
            else lastDigit = digit;
        }

        sum += digit;

        num = Math.floor(num /10);
    }

    console.log(check);
    console.log(sum);
}

solve(2222222);