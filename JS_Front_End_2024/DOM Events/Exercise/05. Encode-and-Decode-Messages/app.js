function encodeAndDecodeMessages() {
    const [input, output] = document.querySelectorAll('textarea');
    const [encode, decode] = document.querySelectorAll('button');

    encode.addEventListener('click', encodeMsg);
    decode.addEventListener('click', decodeMsg);

    function encodeMsg(){
        output.value = '';
        let newMsg = '';
        for(let i = 0; i < input.value.length; i++){
            newMsg += String.fromCharCode(input.value.charCodeAt(i) + 1);
        }
        output.value = newMsg;
        input.value = '';
    }


    function decodeMsg(){
        let newMsg = '';
        for(let i = 0; i < output.value.length; i++){
            newMsg += String.fromCharCode(output.value.charCodeAt(i) - 1);
        }
        output.value = newMsg;
    }
}