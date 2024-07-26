function solve(input){
    let n = Number(input[0]);
    let baristas = [];

    for(let i = 1; i < 1 + n; i++){
        let barista = {name: '', shift: '', coffeeTypes: []};

        let tokens = input[i].split(' ');
        let baristaName = tokens[0];
        let baristaShift = tokens[1];
        let coffeeSkills = tokens[2].split(',');

        barista.name = baristaName;
        barista.shift = baristaShift;
        barista.coffeeTypes = coffeeSkills;

        baristas.push(barista);
    }

    for(let i = 1 + n; i < input.length - 1; i++){
        let tokens = input[i].split(' / ');
        let command = tokens[0];
        let name = tokens[1];
        let barista = baristas.find(person => person.name === name);

        switch(command){
            case 'Prepare':
                if(barista.shift === tokens[2] && barista.coffeeTypes.includes(tokens[3])){
                    console.log(`${barista.name} has prepared a ${tokens[3]} for you!`);
                } else{
                    console.log(`${barista.name} is not available to prepare a ${tokens[3]}.`);
                }
                break;
            case 'Change Shift':
                barista.shift = tokens[2];
                console.log(`${barista.name} has updated his shift to: ${tokens[2]}`);
                break;    
            case 'Learn':
                if(barista.coffeeTypes.includes(tokens[2])){
                    console.log(`${barista.name} knows how to make ${tokens[2]}.`)
                } else {
                    barista.coffeeTypes.push(tokens[2]);
                    console.log(`${barista.name} has learned a new coffee type: ${tokens[2]}.`);
                }
                break;
        }
    }

    for(let barista of baristas){
        console.log(`Barista: ${barista.name}, Shift: ${barista.shift}, Drinks: ${barista.coffeeTypes.join(', ')}`)
    }
}

solve(['4',
'Alice day Espresso,Cappuccino',
'Bob night Latte,Mocha',
'Carol day Americano,Mocha',
'David night Espresso',
'Prepare / Alice / day / Espresso',
'Change Shift / Bob / day',
'Learn / Carol / Latte',
'Prepare / Bob / night / Latte',
'Learn / David / Cappuccino',
'Prepare / Carol / day / Cappuccino',
'Change Shift / Alice / night',
 'Learn / Bob / Mocha',
'Prepare / David / night / Espresso',
'Closed']
    );
