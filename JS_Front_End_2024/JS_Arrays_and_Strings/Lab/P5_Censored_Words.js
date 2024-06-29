function solve(text, word){
    let censored = text.replaceAll(word,repeat(word));
    console.log(censored);
    function repeat(word){
        let result = "";
        for(let i = 0; i < word.length; i++){
            result += "*";
        }
        return result;
    }
}
solve('Find hidden hidden the hidden word', 'hidden');