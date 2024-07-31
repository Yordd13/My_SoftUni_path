function validate() {
    const email = document.getElementById('email');

    email.addEventListener('change', valid);

    function valid(event){
        if(!validateEmail(event.target)){
            event.target.classList.add('error');
        } else {
            event.target.classList.remove('error');
        }
    }

    function validateEmail(email) {
        const emailRegex = /^[a-z]+@[a-z]+\.[a-z]+$/;
        return email.value.match(emailRegex);
    }

}