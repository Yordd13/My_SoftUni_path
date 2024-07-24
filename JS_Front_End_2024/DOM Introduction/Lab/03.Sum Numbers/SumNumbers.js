function calc() {
    
    const num1 = document.getElementById('num1').value;
    const num2 = document.querySelector('#num2').value;
    const result = document.querySelector('#sum');

    let sum = Number(num1) + Number(num2);

    result.value = sum;
}
