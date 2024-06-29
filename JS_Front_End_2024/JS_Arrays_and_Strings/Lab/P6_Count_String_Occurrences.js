function solve(text, searchedWord){
    let counter = 0;
    let words = text.split(' ');
    for(let word of words){
        if(word === searchedWord){
            counter++;
        }
    }
    console.log(counter);
}
solve('softuni is great place for learning new programming languages','softuni');