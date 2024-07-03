function solve(arr){
    function isPalindrome(num){
        let digits = num.split('');
        for(let i = 0; i < digits.length / 2; i++){
            if(digits[i] != digits[digits.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    for(let i = 0; i < arr.length; i++){
        if(isPalindrome(arr[i].toString())){
            console.log(true);
        } else console.log(false)
    }
}

solve([32,2,323,1010]);