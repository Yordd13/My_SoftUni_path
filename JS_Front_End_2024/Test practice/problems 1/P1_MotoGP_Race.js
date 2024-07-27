function solve(input){
    let n = Number(input[0]);

    let drivers = [];

    for(let i = 1; i < 1 + n; i++){
        let tokens = input[i].split('|');
        let driver = {  rider: tokens[0], 
                        fuelCap: Number(tokens[1]),
                        position: Number(tokens[2])
                    };
        drivers.push(driver);
    }

    for(let i = 1 + n; i < input.length - 1; i++){
        let tokens = input[i].split(' - ');
        let command = tokens[0];
        let rider = tokens[1];
        
        let driver = drivers.find(person => person.rider === rider);

        switch(command){
            case 'StopForFuel':
                let minFuel = Number(tokens[2]);
                let positionChange = Number(tokens[3]);
                if(driver.fuelCap < minFuel){
                    driver.position = positionChange;
                    console.log(`${driver.rider} stopped to refuel but lost his position, now he is ${driver.position}.`);
                } else {
                    console.log(`${driver.rider} does not need to stop for fuel!`);
                }
                break; 
            case 'Overtaking':
                let driver2 = drivers.find(person => person.rider === tokens[2]);
                if(driver.position < driver2.position){
                    let swap = driver.position;
                    driver.position = driver2.position;
                    driver2.position = swap;
                    console.log(`${driver.rider} overtook ${driver2.rider}!`);
                }
                break;
            case 'EngineFail':
                let lapsLeft = Number(tokens[2]);
                console.log(`${driver.rider} is out of the race because of a technical issue, ${lapsLeft} laps before the finish.`);
                drivers = drivers.filter(person => person.rider !== rider);
                break;
        }
    }

    for(let driver of drivers){
        console.log(`${driver.rider}\n  Final position: ${driver.position}`);
    }
}

solve((["4",
    "Valentino Rossi|100|1",
    "Marc Marquez|90|3",
    "Jorge Lorenzo|80|4",
    "Johann Zarco|80|2",
    "StopForFuel - Johann Zarco - 90 - 5",
    "Overtaking - Marc Marquez - Jorge Lorenzo",
    "EngineFail - Marc Marquez - 10",
    "Finish"])    
    );