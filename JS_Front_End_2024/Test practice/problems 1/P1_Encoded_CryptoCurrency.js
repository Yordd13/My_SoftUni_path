function solve(input){
    let message = input[0];

    for(let i = 0; i < input.length - 1; i++){
        let tokens = input[i].split('?');
        let command = tokens[0];

        switch(command){
            case 'TakeEven':
                message = getEven(message);
                console.log(message);
                break;
            case 'ChangeAll':
                let substring = tokens[1];
                let replacement = tokens[2];
                while(message.includes(substring)){
                    message = message.replace(substring,replacement);
                }
                console.log(message);
                break;
            case 'Reverse':
                if(message.includes(tokens[1])){
                    message = message.replace(tokens[1],'');
                    message += reverse(tokens[1]);
                    console.log(message);
                } else {
                    console.log('error');
                }
                break;
        }
    }


    function getEven(text){
        let result = '';
        for(let i = 0; i < text.length; i += 2){
            result += text[i];
        }
        return result;
    }
    function reverse(word){
        let result = '';
        for(let i = word.length - 1; i >= 0; i--){
            result += word[i];
        }
        return result;
    }

    console.log(`The cryptocurrency is: ${message}`);
}

solve((["PZDfA2PkAsakhnefZ7aZ", 
"TakeEven",
"TakeEven",
"TakeEven",
"ChangeAll?Z?X",
"ChangeAll?A?R",
"Reverse?PRX",
"Buy"])
);