function solve(array){
    const priceBitcoin = 11949.16;
    const priceGold = 67.51;
    let money = 0;
    let bitcoinsBought = 0;
    let firstBitcoinBoughtDay = 0;

    for(let i = 1; i <= array.length; i++){
        let dailyMoney = priceGold * array[i-1];
        if(i % 3 == 0){
            dailyMoney *= 0.70;
        }
        money += dailyMoney;

        if(money >= priceBitcoin){
            if(firstBitcoinBoughtDay == 0){
                firstBitcoinBoughtDay = i;
            }
            let amountBought = Math.floor(money / priceBitcoin);
            money -= amountBought * priceBitcoin;
            bitcoinsBought += amountBought;
        }
    }
    console.log(`Bought bitcoins: ${bitcoinsBought}`);
    if(bitcoinsBought > 0){
        console.log(`Day of the first purchased bitcoin: ${firstBitcoinBoughtDay}`);
    }
    console.log(`Left money: ${money.toFixed(2)} lv.`);
}
solve([3124.15, 504.212, 2511.124]);