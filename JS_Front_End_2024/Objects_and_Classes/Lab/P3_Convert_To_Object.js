function convertToObject(jsonString){
    let person = JSON.parse(jsonString);

    let entries = Object.entries(person);

    for(let [key,value] of entries){
        console.log(`${key}: ${value}`);
    }
}

convertToObject('{"name": "George", "age": 40, "town": "Sofia"}');