function solve(num1, num2){
    function factorial(num){
        let result = 1;
        for(let i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    let division = factorial(num1) / factorial(num2);

    console.log(division.toFixed(2));
}

solve(6,2);