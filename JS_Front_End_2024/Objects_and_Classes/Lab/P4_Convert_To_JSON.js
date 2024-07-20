function covertToJSON(firstName,lastName,hairColor){
    let person = {name: firstName, lastName: lastName, hairColor: hairColor};

    console.log(JSON.stringify(person));
}

covertToJSON('Peter', 'Smith', 'Blond');