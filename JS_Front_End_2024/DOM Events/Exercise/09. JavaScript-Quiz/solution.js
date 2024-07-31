function solve() {
    const buttons = document.querySelectorAll('.answer-wrap');

    let countCorrect = 0;
    for(let i = 0; i < buttons.length; i++){
      buttons[i].addEventListener('click', () => checkAnswer(i));
    }

    let counter = 0;
    function checkAnswer(index){
      counter++;

      if ([0, 3, 4].includes(index)) {
        countCorrect++;
      }

      document.querySelector(`section:nth-of-type(${counter})`).style.display = 'none';

      if (counter < 3) {
        document.querySelector(`section:nth-of-type(${counter + 1})`).style.display = 'block';
      } else{
        if(countCorrect === 3){
          document.querySelector('.results-inner h1').textContent = 'You are recognized as top JavaScript fan!';
        } else{
          document.querySelector('.results-inner h1').textContent = `You have ${countCorrect} right answers`
        }

        const resultsSection = document.querySelector('#results');
        resultsSection.style.display = 'block';
      }

    }
}
