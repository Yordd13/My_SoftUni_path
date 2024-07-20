function solve(input){
    let employees = {};
    for(let name of input){
        let personalNumber = name.length;
        employees[name] = personalNumber;
    }

    for(let key in employees){
        console.log(`Name: ${key} -- Personal Number: ${employees[key]}`);
    }
}

solve([
    'Silas Butler',
    'Adnaan Buckley',
    'Juan Peterson',
    'Brendan Villarreal'
    ]);