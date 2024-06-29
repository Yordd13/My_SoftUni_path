function solve(words, text){
    let wordsArr = words.split(', ');
    let textWordsArr = text.split(' ');

    for (let i = 0; i < textWordsArr.length; i++) {
        if(textWordsArr[i].includes('*')){
            for(let j = 0; j < wordsArr.length; j++){
                if(textWordsArr[i].length === wordsArr[j].length){
                    textWordsArr[i] = wordsArr[j];
                    wordsArr.splice(j,1);
                    break;
                }
            }
        }
    }

    console.log(textWordsArr.join(' '));
}
solve('great, learning',
'softuni is ***** place for ******** new programming languages');