function solve(input){
    let output = input.split(/(?=[A-Z])/);

    console.log(output.join(', '));
}
solve('ThisIsSoAnnoyingToDo');