function solve(array){
    let username = array[0];
    const lookingForThis = username.split('').reverse().join('');

    for(let i = 1; i < array.length; i++){
        if(array[i] === lookingForThis){
            console.log(`User ${username} logged in.`);
        } else if(i >= 4){
            console.log(`User ${username} blocked!`);
            return;
        } else{
            console.log('Incorrect password. Try again.');
        }
    }
}
solve(['momo','omom']);