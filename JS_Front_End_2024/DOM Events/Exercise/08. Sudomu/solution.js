function solve() {
    const [check, clear] = document.querySelectorAll('button');

    check.addEventListener('click', checkTheSudoku);
    clear.addEventListener('click', clearDisplay);

    function checkTheSudoku(){
        const input = Array.from(document.querySelectorAll('input'));
        let array = [];
        let count = 0;
        let rowArr= [];
        for(let cell of input){
            if(count % 3 === 0 && count !== 0){
                array.push(rowArr);
                rowArr = [];
            }
            rowArr.push(cell.value);
            count++;
        }
        array.push(rowArr);

        const check = document.querySelector('#check p');
        const table = document.querySelector('table');

        if(validSudoku(array)){
            check.style.color = 'green';
            table.style.border = '2px solid green';
            check.textContent = 'You solve it! Congratulations!';
        } else{
            check.style.color = 'red';
            table.style.border = '2px solid red';
            check.textContent = 'NOP! You are not done yet...';
        }

        function validSudoku(cells){
            for(let i = 0; i < 3; i++){
                let row = cells[i];
                for(let j = 0; j < 3; j++){
                    if(row[j] === row[i] && i !== j){
                        return false;
                    }
                }
            }
            for (let i = 0; i < 3; i++) {
                for (let j = 0; j < 3; j++) {
                    for (let k = 0; k < 3; k++) {
                        if (cells[j][i] === cells[k][i] && j !== k) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }


    function clearDisplay(){
        const input = Array.from(document.querySelectorAll('input'));
        const table = document.querySelector('table');

        for(let cell of input){
            cell.value = '';
        }

        document.querySelector('#check p').textContent = '';
        table.style.border = 'none';
    }
}