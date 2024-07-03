function checkPassword(password){
    let isValid = true;

    if(password.length < 6 || password.length > 10){
        console.log('Password must be between 6 and 10 characters');
        isValid = false;
    }
    
    let sumDigits = 0;
    let consistsOfLettersAndDigits = true;
        for(let i = 0; i < password.length; i++){
           let symbol = password[i].charCodeAt(0);
           if((symbol < 65 || symbol > 90) && (symbol < 97 || symbol > 122) && (symbol < 48 || symbol > 57)){
            consistsOfLettersAndDigits = false;
           }

           if(symbol >= 48 && symbol <= 57){
            sumDigits++;
           }
        }

    if(!consistsOfLettersAndDigits){
        console.log('Password must consist only of letters and digits');
        isValid = false;
    }
    if(sumDigits < 2){
        console.log('Password must have at least 2 digits');
        isValid = false;
    }

    if(isValid){
        console.log('Password is valid');
    }
}

checkPassword('logIn');