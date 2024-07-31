function solve() {
   let sum = 0;
   let products = [];

   const addProducts = document.getElementsByClassName('add-product');
   const productName = document.getElementsByClassName('product-title');
   const productPrice = document.getElementsByClassName('product-line-price');
   
   for (let i = 0; i < addProducts.length; i++) {
      addProducts[i].addEventListener('click', () => addProduct(i));
  }

   function addProduct(i){
      let price = Number(productPrice[i].textContent);
      let name = productName[i].textContent;
      document.querySelector('textarea').textContent += `Added ${name} for ${price.toFixed(2)} to the cart.\n`; 
   
      sum += price;
      if(!products.includes(name)){
         products.push(name);
      }
   }


   const checkout = document.querySelector('.checkout');
   checkout.addEventListener('click', checkoutBill);

   function checkoutBill(){
      document.querySelector('textarea').textContent += `You bought ${products.join(', ')} for ${sum.toFixed(2)}.`;
      
      for(let add of addProducts){
         add.disabled = true;
      }
      checkout.disabled = true;
   }
}