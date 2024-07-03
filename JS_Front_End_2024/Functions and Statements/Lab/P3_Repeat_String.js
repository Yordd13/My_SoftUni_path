function repeat(string, times){
    let output = '';
    for(let i = 0; i < times; i++){
        output += string;
    }
    return output;
}

console.log(repeat("abc",3));