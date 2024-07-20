function solve(input){
    let register = [];

    for(let line of input){
        let [name, level, items] = line.split(' / ');

        let hero = {
            name: name,
            level: level,
            items: items
        };

        register.push(hero);
    }

    register.sort((a,b) => {
        levelA =  a['level']; 
        levelB =  b['level'];
        return levelA - levelB;
    });

    for(let hero of register){
        console.log(`Hero: ${hero['name']}`);
        console.log(`level => ${hero['level']}`)
        console.log(`items => ${hero['items']}`);
    }
}

solve([
    'Batman / 2 / Banana, Gun',
    'Superman / 18 / Sword',
    'Poppy / 28 / Sentinel, Antara'
    ]);