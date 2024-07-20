function solve(input){
    let counter = {};
    input = input.split(' ');
    for(let word of input){
        word = word.toString().toLowerCase();
        if(counter.hasOwnProperty(word)){
            counter[word]++;
        }
        else{
            counter[word] = 1;
        }
    }

    let output = '';
    for(let key in counter){
        if(counter[key] % 2 === 0){
            delete counter[key];
        }
    }

    for(let word of input){
        word = word.toLowerCase();
        if(counter.hasOwnProperty(word)){
            output += word + ' ';
            delete counter[word];
        }
    }
    console.log(output);
}

solve('Cake IS SWEET is Soft CAKE sweet Food');