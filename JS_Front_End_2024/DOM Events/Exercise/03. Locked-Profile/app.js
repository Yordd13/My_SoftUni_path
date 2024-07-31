function lockedProfile() {
    const buttons = document.querySelectorAll('.profile button');
    const hidden = document.querySelectorAll('.profile div');
    const unlocked  = document.querySelectorAll('.profile > input:nth-of-type(2)');

    for(let i = 0; i < buttons.length; i++){
        buttons[i].addEventListener('click', () => solve(i));
    }

    function solve(i){
        if(unlocked[i].checked && buttons[i].textContent === 'Show more'){
            hidden[i].style.display = 'block';
            buttons[i].textContent = 'Hide it';
        } else if(unlocked[i].checked){
            hidden[i].style.display = 'none';
            buttons[i].textContent = 'Show more';
        }
    }
}