function solve(input){
    let catalog = [];

    for(let line of input){
        let[name, price] = line.split(' : ');
        let product = {name: name, price: price};
        catalog.push(product);
    }

    catalog.sort((a,b) => a['name'].localeCompare(b['name']));

    let last = catalog[0].name[0];
    console.log(last);
    for(let key of catalog){
        if(last !== key['name'][0]){
            console.log(key['name'][0]);
            last = key['name'][0];
        }

        console.log(`  ${key['name']}: ${key['price']}`);
    }
}

solve([
    'Omlet : 5.4',
    'Shirt : 15',
    'Cake : 59'
    ]);