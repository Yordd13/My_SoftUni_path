function solve(input){
    let table = {};

    for(let line of input){
        let [town,latitude,longitude] = line.split(' | ');
        table.town = town;
        table.latitude = parseFloat(latitude).toFixed(2);
        table.longitude = parseFloat(longitude).toFixed(2);
        console.log(table);
    }
}

solve(['Sofia | 42.696552 | 23.32601',
    'Beijing | 39.913818 | 116.363625']
    );