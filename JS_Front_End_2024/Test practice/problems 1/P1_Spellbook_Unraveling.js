function solve(input){
    
    let word = input[0];
    for(let i = 1; i < input.length - 1; i++){
        if(input[i] === 'RemoveEven'){
            word = removeEven(word);
            print(word);
        } else {
            let tokens = input[i].split('!');
            let command = tokens[0];
            switch(command){
                case 'TakePart':
                    let startIndex = Number(tokens[1]);
                    let endIndex = Number(tokens[2]);
                    word = word.substring(startIndex,endIndex); 
                    print(word);
                    break;
                case 'Reverse':
                    if(word.includes(tokens[1])){
                        word = word.replace(tokens[1],'');
                        word += reverse(tokens[1]);
                        print(word);
                    } else {
                        print('Error');
                    }
                    break;
            }
        }
    }
    print(`The concealed spell is: ${word}`);


    function removeEven(word){
        let result = '';
        for(let i = 0; i < word.length; i+=2){
            result += word[i];
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
    function print(word){
        console.log(word);
    }
}

solve((["asAsl2adkda2mdaczsa", 
"RemoveEven",
"TakePart!1!9",
"Reverse!maz",
"End"])
);