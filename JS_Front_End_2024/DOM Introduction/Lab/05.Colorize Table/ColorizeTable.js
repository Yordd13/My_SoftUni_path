function colorize() {
   const dataCells = document.getElementsByTagName('tr'); 

   for(let i = 1; i < dataCells.length; i += 2){
        dataCells[i].style.backgroundColor = 'Teal';
   }
}