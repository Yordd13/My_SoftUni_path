function solve(base, increment){
    let stone = 0;
    let marble = 0;
    let lapis = 0;
    let gold = 0;
    let height = 1;

    while (base > 2) {
        base -= 2;
        stone += ((base) ** 2) * increment;
        if (height % 5 == 0) {
            lapis += ((base * 4) + 4) * increment;
        } else {
            marble += ((base * 4) + 4) * increment;
        }
        height += 1;
    }
    gold += (base ** 2) * increment;


    console.log(`Stone required: ${Math.ceil(stone)}`);
    console.log(`Marble required: ${Math.ceil(marble)}`);
    console.log(`Lapis Lazuli required: ${Math.ceil(lapis)}`);
    console.log(`Gold required: ${Math.ceil(gold)}`);
    console.log(`Final pyramid height: ${Math.floor(height * increment)}`);
}

solve(23, 0.5);