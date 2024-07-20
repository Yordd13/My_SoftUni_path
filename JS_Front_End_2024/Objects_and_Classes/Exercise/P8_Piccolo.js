function solve(input){

    let parkingLot = [];
    for(let carInfo of input){
        let [command, number] = carInfo.split(', ');
        if(command === 'IN' && !parkingLot.includes(number)){
            parkingLot.push(number);
        } else if(command === 'OUT'){
            parkingLot = parkingLot.filter(car => car !== number)
        }
    }

    if(parkingLot.length === 0){
        console.log("Parking Lot is Empty");
    } else {
        parkingLot.sort((a,b) => a.localeCompare(b));
        for(let spot of parkingLot){
            console.log(spot);
        }
    }
}

solve(['IN, CA2844AA',
    'IN, CA1234TA',
    'OUT, CA2844AA',
    'IN, CA9999TT',
    'IN, CA2866HI',
    'OUT, CA1234TA',
    'IN, CA2844AA',
    'OUT, CA2866HI',
    'IN, CA9876HH',
    'IN, CA2822UU']);