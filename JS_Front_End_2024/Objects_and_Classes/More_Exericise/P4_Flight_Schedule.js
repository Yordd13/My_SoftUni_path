function solve(input){
    let flights = input[0];
    let changeStatus = input[1];
    let flightStatus = input[2];


    let schedule = [];
    for(let flight of flights){
        let [number, place] = flight.split(' ');
        let flightSchedule = {number: number, Destination: place, Status: 'Ready to fly'};
        schedule.push(flightSchedule);
    }

    for(let flight of changeStatus){
        let flightNumber = flight.split(' ');
        const plane = schedule.find(plane => plane.number === flightNumber[0]);
        if(plane){
            plane.Status = 'Cancelled';
        }
    }  

    for(let flight of schedule){
        if(flight.Status === flightStatus[0]){
            let { number, ...flightWithoutNumber } = flight;
            console.log(flightWithoutNumber);
        }
    }
}

solve([['WN269 Delaware',
    'FL2269 Oregon',
     'WN498 Las Vegas',
     'WN3145 Ohio',
     'WN612 Alabama',
     'WN4010 New York',
     'WN1173 California',
     'DL2120 Texas',
     'KL5744 Illinois',
     'WN678 Pennsylvania'],
     ['DL2120 Cancelled',
     'WN612 Cancelled',
     'WN1173 Cancelled',
     'SK330 Cancelled'],
     ['Ready to fly']
 ]);