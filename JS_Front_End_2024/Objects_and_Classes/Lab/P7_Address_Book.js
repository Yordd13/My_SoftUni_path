function solve(input){
    let addressBook = {};
    for(let line of input){
        let tokens = line.split(':');
        let name = tokens[0];
        let address = tokens[1];
        addressBook[name] = address;
    }
    let entries = Object.entries(addressBook);
    entries.sort((a,b) => {
        keyA = a[0];
        keyB = b[0];
        return keyA.localeCompare(keyB);
    });
    for(let info of entries){
        console.log(`${info[0]} -> ${info[1]}`);
    }
}

solve(['Bob:Huxley Rd',
    'John:Milwaukee Crossing',
    'Peter:Fordem Ave',
    'Bob:Redwing Ave',
    'George:Mesta Crossing',
    'Ted:Gateway Way',
    'Bill:Gateway Way',
    'John:Grover Rd',
    'Peter:Huxley Rd',
    'Jeff:Gateway Way',
    'Jeff:Huxley Rd']);