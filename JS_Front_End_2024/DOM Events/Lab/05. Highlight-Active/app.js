function focused() {
    const sections = document.querySelectorAll('input');

    for(let input of sections){
        input.addEventListener('focus',gray);
        input.addEventListener('blur',normal);
    }

    function gray(event){
        event.target.parentNode.classList.add('focused');
    }
    function normal(event){
        event.target.parentNode.classList.remove('focused');
    }
}