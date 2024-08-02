window.addEventListener("load", solve);

function solve() {
      const adoptButton = document.getElementById('adopt-btn');
      adoptButton.addEventListener('click', adoptPet);
      
      function adoptPet(e){
        e.preventDefault();
        const type = document.getElementById('type').value;
        const age = document.getElementById('age').value;
        const gender = document.getElementById('gender').value;

        clear();

        if(age === '' || type === '' || gender === ''){
          return;
        } else {
          const adoptInfo = document.getElementById('adoption-info');

          const li = document.createElement('li');
          const article = document.createElement('article');

          const pPet = document.createElement('p');
          pPet.appendChild(document.createTextNode(`Pet:${type}`));
          article.appendChild(pPet);

          const pGender = document.createElement('p');
          pGender.appendChild(document.createTextNode(`Gender:${gender}`));
          article.appendChild(pGender);

          const pAge = document.createElement('p');
          pAge.appendChild(document.createTextNode(`Age:${age}`));
          article.appendChild(pAge);

          li.appendChild(article);

          const div = document.createElement('div');
          div.classList.add('buttons');

          const editButton = document.createElement('button');
          editButton.classList.add('edit-btn');
          editButton.appendChild(document.createTextNode('Edit'));
          div.appendChild(editButton);

          const doneButton = document.createElement('button');
          doneButton.classList.add('done-btn');
          doneButton.appendChild(document.createTextNode('Done'));
          div.appendChild(doneButton);

          li.appendChild(div);

          adoptInfo.appendChild(li);

          editButton.addEventListener('click', editInfo);
          function editInfo(event){
            document.getElementById('type').value = type;
            document.getElementById('age').value = age;
            document.getElementById('gender').value = gender;
            document.getElementById('adoption-info').removeChild(event.target.parentNode.parentNode);
          }

          doneButton.addEventListener('click', doneInfo);
          function doneInfo(){
            li.removeChild(div);
            const clearButton = document.createElement('button');
            clearButton.appendChild(document.createTextNode('Clear'));
            clearButton.classList.add('clear-btn');
            li.appendChild(clearButton);
            
            document.getElementById('adopted-list').appendChild(li);
          
            clearButton.addEventListener('click', clearInfo);
            function clearInfo(event){
              document.getElementById('adopted-list').removeChild(event.target.parentNode);
            }
          }
      }
      }
      function clear(){
        document.getElementById('type').value = '';
        document.getElementById('age').value = '';
        document.getElementById('gender').value = '';
      }    
}
  