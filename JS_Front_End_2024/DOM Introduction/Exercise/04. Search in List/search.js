function search() {
   const towns = document.querySelectorAll('#towns li');
   const search = document.getElementById('searchText').value;
   const result = document.getElementById('result');

   if(result.textContent !== ''){
      for(const town of towns){
         town.style.textDecoration = 'none';
         town.style.fontWeight = 'normal';
      }
   }
   let counter = 0;

   for (const town of towns) {
      if (town.textContent.includes(search)) {
         counter++;
         town.style.fontWeight = 'bold';
         town.style.textDecoration = 'underline';
     }
   }

   result.textContent = `${counter} matches found`;
}
