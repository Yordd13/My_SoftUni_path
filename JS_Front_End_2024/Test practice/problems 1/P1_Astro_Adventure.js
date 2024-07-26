function solve(input){
    let n = Number(input[0]);

    let astronauts = [];

    for(let i = 1; i < 1 + n; i++){
        let [name, oxygenLevel, energy] = input[i].split(' ');
        oxygenLevel = Number(oxygenLevel);
        energy = Number(energy);

        let astronaut = {name: name, oxygen: oxygenLevel, energy: energy};
        astronauts.push(astronaut);
    }

    for(let i = 1 + n; i < input.length - 1; i++){
        let [command, name, amount] = input[i].split(' - ');

        let astronaut = astronauts.find(person => person.name === name);

        switch(command){
            case 'Explore':
                if(astronaut.energy - amount > 0){
                    astronaut.energy -= amount;
                    console.log(`${astronaut.name} has successfully explored a new area and now has ${astronaut.energy} energy!`);
                } else{
                    console.log(`${astronaut.name} does not have enough energy to explore!`);
                }
                break;
            case 'Refuel':
                astronaut.energy += Number(amount);
                if(astronaut.energy > 200){
                    amount = amount - (astronaut.energy - 200);
                    astronaut.energy = 200;
                }
                console.log(`${astronaut.name} refueled their energy by ${amount}!`);
                break;
            case 'Breathe':
                astronaut.oxygen += Number(amount);
                if(astronaut.oxygen > 100){
                    amount = amount - (astronaut.oxygen - 100);
                    astronaut.oxygen = 100;
                }
                console.log(`${astronaut.name} took a breath and recovered ${amount} oxygen!`);
                break;
        }
    }

    for(let astronaut of astronauts){
        console.log(`Astronaut: ${astronaut.name}, Oxygen: ${astronaut.oxygen}, Energy: ${astronaut.energy}`);
    }
}

solve([    '4',
    'Alice 60 100',
    'Bob 40 80',
    'Charlie 70 150',
    'Dave 80 180',
    'Explore - Bob - 60',
    'Refuel - Alice - 30',
    'Breathe - Charlie - 50',
    'Refuel - Dave - 40',
    'Explore - Bob - 40',
    'Breathe - Charlie - 30',
    'Explore - Alice - 40',
    'End']
);