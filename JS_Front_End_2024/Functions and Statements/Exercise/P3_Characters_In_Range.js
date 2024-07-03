function solve(ch1,ch2){
    let result = '';
    if(ch1.charCodeAt(0) < ch2.charCodeAt(0)){
        for(let i = ch1.charCodeAt(0) + 1; i < ch2.charCodeAt(0); i++){
            result += String.fromCharCode(i) + ' ';
        }
    } else{
        for(let i = ch2.charCodeAt(0) + 1; i < ch1.charCodeAt(0); i++){
            result += String.fromCharCode(i) + ' ';
        }
    }

    console.log(result);
}
solve('C','#');