function solve() {
  const [inputArea, output] = document.querySelectorAll('textarea');
  const table = document.querySelector('.table tbody');
  const [generate, buy] = document.querySelectorAll('button');

  generate.addEventListener('click', generateFurniture);
  buy.addEventListener('click', buyFurniture);

  

  function generateFurniture(){
      let input = JSON.parse(inputArea.value);
      
      for(let element of input){
        let tr = document.createElement('tr');

        let tdImage = document.createElement('td');
        let img = document.createElement('img');
        img.src = element.img;
        tdImage.appendChild(img);
        tr.appendChild(tdImage);
  
        let tdName = document.createElement('td');
        let name = document.createElement('p');
        name.textContent = element.name;
        tdName.appendChild(name);
        tr.appendChild(tdName);
  
        let tdPrice = document.createElement('td');
        let price = document.createElement('p');
        price.textContent = element.price;
        tdPrice.appendChild(price);
        tr.appendChild(tdPrice);
  
        let tdDecFactor = document.createElement('td');
        let decFactor = document.createElement('p');
        decFactor.textContent = element.decFactor;
        tdDecFactor.appendChild(decFactor);
        tr.appendChild(tdDecFactor);
  
        let tdCheckbox = document.createElement('td');
        let checkbox = document.createElement('input');
        checkbox.type = 'checkbox';
        tdCheckbox.appendChild(checkbox);
        tr.appendChild(tdCheckbox);
  
        table.appendChild(tr);
      }
  }

  function buyFurniture(){
    const rows = Array.from(table.querySelectorAll('tr'));
    let selectedFurniture = [];
    let totalPrice = 0;
    let totalDecFactor = 0;

    rows.forEach(row => {
      const checkbox = row.querySelector('input[type=checkbox]');
      if (checkbox && checkbox.checked) {
        const columns = row.querySelectorAll('td');
        const name = columns[1].textContent;
        const price = Number(columns[2].textContent);
        const decFactor = Number(columns[3].textContent);

        selectedFurniture.push(name);
        totalPrice += price;
        totalDecFactor += decFactor;
      }
    });

      output.value = `Bought furniture: ${selectedFurniture.join(', ')}\n`;
      output.value += `Total price: ${totalPrice.toFixed(2)}\n`;
      output.value += `Average decoration factor: ${(totalDecFactor / selectedFurniture.length)}`;
  }
}