function solve(text) {
    let result = text.toUpperCase()
      .match(/\w+/g)
      .join(', ');
    
    console.log(result);
}

solve('Functions in JS can be nested, i.e. hold other functions');