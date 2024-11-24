// Preço do item
const priceElement = document.getElementById('price');
const price = parseFloat(priceElement.textContent.replace('R$', '').replace(',', '.'));

// Elementos da quantidade e total
const quantityElement = document.getElementById('quantity');
const totalElement = document.getElementById('total');

// Função para ajustar a quantidade
function adjustQuantity(step) {
  const currentQuantity = parseInt(quantityElement.value) || 0;
  const newQuantity = currentQuantity + step;

  if (newQuantity >= 0) {
    quantityElement.value = newQuantity;
    updateTotal();
  }
}

// Função para validar a quantidade
function validateQuantity() {
  let quantity = parseInt(quantityElement.value);

  if (isNaN(quantity) || quantity < 0) {
    quantity = 0; // Define para 0 se inválido
  }

  quantityElement.value = quantity;
  updateTotal();
}

// Função para atualizar o total
function updateTotal() {
  const quantity = parseInt(quantityElement.value) || 0;
  const total = (quantity * price).toFixed(2);
  totalElement.textContent = `Total: R$${total.replace('.', ',')}`;
}

// Inicializa o cálculo do total
updateTotal();
