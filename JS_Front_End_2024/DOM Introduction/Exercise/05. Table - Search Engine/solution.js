function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);

   function onClick() {
      const search = document.getElementById('searchField').value;
      const data = document.getElementsByTagName('tr');
      
      for(let row of data){
         row.classList.remove('select');
      }
      
      for (let i = 2; i < data.length; i++) {
         const row = data[i].children;
         for(let cell of row){
            if(cell.textContent.includes(search)){
               data[i].classList.add('select');
            }
         }
      }
   }
}