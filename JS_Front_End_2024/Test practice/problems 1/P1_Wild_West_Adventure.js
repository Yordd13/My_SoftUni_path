function solve(input){
    let n = Number(input[0]);
    let heroes = [];

    for(let i = 1; i < 1 + n; i++){
        let [heroName, HP, bullets] = input[i].split(' ');
        let hero = {name: heroName, HP: HP, bullets: Number(bullets)};
        heroes.push(hero);
    }

    for(let i = 1 + n; i < input.length - 1; i++){
        let tokens = input[i].split(' - ');
        let command = tokens[0];
        let characterName = tokens[1];
        let character = heroes.find(hero => hero.name === characterName);

        switch(command){
            case 'FireShot':
                let target = tokens[2];

                if(character.bullets > 0){
                    character.bullets -= 1;
                    console.log(`${characterName} has successfully hit ${target} and now has ${character.bullets} bullets!`);
                } else {
                    console.log(`${characterName} doesn't have enough bullets to shoot at ${target}!`)
                }
                break;
            case 'TakeHit':
                let damage = Number(tokens[2]);
                let attacker = tokens[3];
                
                character.HP -= damage;

                if(character.HP > 0){
                    console.log(`${characterName} took a hit for ${damage} HP from ${attacker} and now has ${character.HP} HP!`);
                } else {
                    console.log(`${characterName} was gunned down by ${attacker}!`);
                    heroes = heroes.filter(hero => hero.name !== characterName);
                }
                break;
            case 'Reload':
                let bullets = Number(character.bullets);
                if(bullets < 6){
                    let reloaded = 6 - bullets;
                    character.bullets = 6;
                    console.log(`${characterName} reloaded ${reloaded} bullets!`);
                } else {
                    console.log(`${characterName}'s pistol is fully loaded!`);
                }
                break;
            case 'PatchUp':
                let amount = Number(tokens[2]);
                if(character.HP < 100){
                    character.HP+= amount;
                    if(character.HP > 100){
                        amount = amount - (character.HP - 100);
                        character.HP = 100;
                    }
                    console.log(`${characterName} patched up and recovered ${amount} HP!`);
                } else {
                    console.log(`${characterName} is in full health!`);
                }
                break;
            }
    }

    for(let hero of heroes){
        console.log(`${hero.name}\n HP: ${hero.HP}\n Bullets: ${hero.bullets}`);
    }
}

solve((["2",
"Gus 100 4",
"Walt 100 5",
"FireShot - Gus - Bandit",
"TakeHit - Walt - 100 - Bandit",
"Reload - Gus",
"Ride Off Into Sunset"])
);