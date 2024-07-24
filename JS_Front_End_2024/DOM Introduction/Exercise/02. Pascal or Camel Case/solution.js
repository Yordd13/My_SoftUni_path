function solve() {
  const text = document.getElementById('text').value;
  const namingConvention = document.getElementById('naming-convention').value;
  const result = document.getElementById('result');

  if(namingConvention === 'Camel Case'){
    result.textContent = text.toLowerCase().split(' ').map((word, index) => index === 0 ? word : word.charAt(0).toUpperCase() + word.slice(1)).join('');
  }else if(namingConvention === 'Pascal Case'){
    result.textContent = text.toLowerCase().split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join('');
  }else {
    result.textContent = 'Error!';
  }
}