window.addEventListener("load", solve);

function solve() {

    const addButton = document.getElementById('add-btn');
    addButton.addEventListener('click', checkContact);

    function checkContact(){
      const name = document.getElementById('name').value;
      const phone = document.getElementById('phone').value;
      const category = document.getElementById('category').value;
      
      clear();

      if(name === '' || phone === '' || category === ''){
        return;
      } else {
        const checkList = document.getElementById('check-list');

        const li = document.createElement('li');
        const article = document.createElement('article');
        
        const pName = document.createElement('p');
        pName.appendChild(document.createTextNode(`name:${name}`));
        article.appendChild(pName);

        const pNumber = document.createElement('p');
        pNumber.appendChild(document.createTextNode(`phone:${phone}`));
        article.appendChild(pNumber);

        const pCategory = document.createElement('p');
        pCategory.appendChild(document.createTextNode(`category:${category}`));
        article.appendChild(pCategory);

        li.appendChild(article);

        const div = document.createElement('div');
        div.classList.add('buttons');
        const editButton = document.createElement('button');
        editButton.classList.add('edit-btn');
        div.appendChild(editButton);
        const saveButton = document.createElement('button');
        saveButton.classList.add('save-btn');
        div.appendChild(saveButton);
        li.appendChild(div);

        checkList.appendChild(li);

        editButton.addEventListener('click', editContact);
        function editContact(){
          document.getElementById('name').value = name;
          document.getElementById('phone').value = phone;
          document.getElementById('category').value = category;

          checkList.innerHTML = '';
        }

        saveButton.addEventListener('click', saveContact);
        function saveContact(){
          checkList.innerHTML = '';
          li.removeChild(div);

          const deleteButton = document.createElement('button');
          deleteButton.classList.add('del-btn');
          li.appendChild(deleteButton);

          document.getElementById('contact-list').appendChild(li);
        
          deleteButton.addEventListener('click', deleteContact);
        
          function deleteContact(event){
            document.getElementById('contact-list').removeChild(event.target.parentNode);
          }
        }
      }
    }

    function clear(){
      document.getElementById('name').value = '';
      document.getElementById('phone').value = '';
      document.getElementById('category').value = '';
    }
}
  