function order(product, times){
    let price = 0;
    switch(product){
        case 'coffee': price = 1.50; break;
        case 'water': price = 1.00; break;
        case 'coke': price = 1.40; break;
        case 'snacks': price = 2.00; break;
    }
    let output = price * times;
    console.log(output.toFixed(2));
}

order("water",5)