function solve(lostFightsCount, helmetPrice, swordPrice, shieldPrice, armorPrice){
    let countShieldBroken = 0;
    let result = 0;
    for(let i = 1; i <= lostFightsCount; i++){
        let isHelmetBroken = false;
        let isSwordBroken = false;
        if(i % 2 == 0){
            result += helmetPrice;
            isHelmetBroken = true;
        }
        if(i % 3 == 0){
            result += swordPrice;
            isSwordBroken = true;
        }
        if(isHelmetBroken && isSwordBroken){
            result += shieldPrice;
            countShieldBroken += 1;
        }
        if(countShieldBroken === 2){
            result += armorPrice;
            countShieldBroken = 0;
        }
    }
    console.log(`Gladiator expenses: ${result.toFixed(2)} aureus`);
}
solve(23,12.50,21.50,40,200);