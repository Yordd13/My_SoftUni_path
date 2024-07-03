function solve(num){
    if(num < 0){
        console.log("It's not so perfect.")
        return;
    }
    function aliquotSum(n)
    {
        let sum = 0;
        for (let i = 1; i < n; i++) 
            if (n % i == 0) 
                sum += i;
                   
        return sum; 
    }
    if(aliquotSum(num) == num){
        console.log('We have a perfect number!');
    }
    else{
        console.log("It's not so perfect.")
    }
}
solve(12923129)