function solve(input){
    let trackWords = input[0].split(' ');
    let tracker = {};
    for(let word of trackWords){
        tracker[word] = 0;
    }

    for(let i = 1; i < input.length; i++){
        if(tracker.hasOwnProperty(input[i])){
            tracker[input[i]]++;
        }
    }

    let entries = Object.entries(tracker);
    entries.sort((a,b) => b[1] - a[1]);

    for(let [word,count] of entries){
        console.log(`${word} - ${count}`)
    }
}

solve([
    'is the', 
    'first', 'sentence', 'Here', 'is', 'another', 'the', 'And', 'finally', 'the', 'the', 'sentence']);