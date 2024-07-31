function create(words) {
   const content = document.getElementById('content');

   for(let word of words){
      let div = document.createElement('div');
      let p = document.createElement('p');
      p.style.display = 'none';
      p.appendChild(document.createTextNode(word));
      div.appendChild(p);

      div.addEventListener('click',  () => {
         p.style.display = 'block';
      });
      content.appendChild(div);
   }
}