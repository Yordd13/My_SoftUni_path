window.addEventListener("load", solve);

function solve() {
  const addButton = document.getElementById('add-btn');
  addButton.addEventListener('click', addPlayer);

  function addPlayer(){
    const name = document.getElementById('player').value;
    const score = document.getElementById('score').value;
    const round = document.getElementById('round').value;

    if(name === '' || score === '' || round === ''){
      return;
    } else {
        clear();

        const li = document.createElement('li');
        li.classList.add('dart-item');

        const article = document.createElement('article');

        const pName = document.createElement('p');
        pName.appendChild(document.createTextNode(`${name}`));
        article.appendChild(pName);

        const pScore = document.createElement('p');
        pScore.appendChild(document.createTextNode(`Score: ${score}`));
        article.appendChild(pScore);

        const pRound = document.createElement('p');
        pRound.appendChild(document.createTextNode(`Round: ${round}`));
        article.appendChild(pRound);

        li.appendChild(article);

        const editButton = document.createElement('button');
        editButton.classList.add('btn', 'edit');
        editButton.appendChild(document.createTextNode('edit'));
        li.appendChild(editButton);

        const okButton = document.createElement('button');
        okButton.classList.add('btn', 'ok');
        okButton.appendChild(document.createTextNode('ok'));
        li.appendChild(okButton);

        document.getElementById('sure-list').appendChild(li);

        addButton.disabled = true;

        editButton.addEventListener('click', editInfo);
        function editInfo(){
          document.getElementById('player').value = name;
          document.getElementById('score').value = score;
          document.getElementById('round').value = round;

          document.getElementById('sure-list').removeChild(li);
          
          addButton.disabled = false;
        }

        okButton.addEventListener('click', saveInfo);
        function saveInfo(){
          addButton.disabled = false;

          li.removeChild(editButton);
          li.removeChild(okButton);

          document.getElementById('scoreboard-list').appendChild(li);
        }

        const clearButton = document.querySelector('#players-container button');
        clearButton.addEventListener('click', clearInfo);
        function clearInfo(){
          location.reload();
        }
    }
  }

  function clear(){
    document.getElementById('player').value = '';
    document.getElementById('score').value = '';
    document.getElementById('round').value = '';
  }
}
  