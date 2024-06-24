function solve(fruit, weight, money){
    weight /= 1000;
    money *= weight;
    console.log(`I need $${money.toFixed(2)} to buy ${weight.toFixed(2)} kilograms ${fruit}.`)
}
solve('apple', 1563, 2.35);