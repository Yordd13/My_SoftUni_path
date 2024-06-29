function solve(input){
    const constraint = /(#[A-Za-z]+)/gm;
    let words = input.match(constraint);

    for (let word of words) {
        word = word.replace("#", "");
        console.log(word);
    }
}
solve('The symbol # is known #variously in English-speaking #regions as the #number sign');