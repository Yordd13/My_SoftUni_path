function solve(stock, order){
    let products = {};

    for(let i = 0; i < stock.length; i+=2){
        let name = stock[i];
        let quantity = stock[i + 1];

        products[name] = quantity;
    }

    for(let i = 0; i < order.length; i+=2){
        let name = order[i];
        let quantity = order[i + 1];

        if(products.hasOwnProperty(name)){
            products[name] = parseInt(quantity) + parseInt(products[name]);
        }
        else{
            products[name] = quantity;
        }
    }

    for(let key in products){
        console.log(`${key} -> ${products[key]}`);
    }
}

solve([
    'Salt', '2', 'Fanta', '4', 'Apple', '14', 'Water', '4', 'Juice', '5'
    ],
    [
    'Sugar', '44', 'Oil', '12', 'Apple', '7', 'Tomatoes', '7', 'Bananas', '30'
    ]);