function toggle() {
    const button = document.querySelector('.head span');
    const extraText = document.getElementById('extra');


    if(button.textContent === 'More'){
        button.textContent = 'Less';
        extraText.style.display = 'block';        
    } else {
        button.textContent = 'More';
        extraText.style.display = 'none'; 
    }
}