// Aguarda o DOM ser completamente carregado
document.addEventListener('DOMContentLoaded', () => {
  const priceElement = document.getElementById('price');
  const price = parseFloat(priceElement.textContent.replace('R$', '').replace(',', '.')) || 0;
  const quantityElement = document.getElementById('quantity');
  const totalElement = document.getElementById('total');

  // Função para atualizar o total
  const updateTotal = () => {
    const quantity = parseInt(quantityElement.value) || 0;
    const total = (quantity * price).toFixed(2);
    totalElement.textContent = `Total: R$${total.replace('.', ',')}`;
  };

  // Função para ajustar a quantidade
  const adjustQuantity = (step) => {
    let currentQuantity = parseInt(quantityElement.value) || 0;
    currentQuantity += step;
    if (currentQuantity < 0) currentQuantity = 0; // Evita valores negativos
    quantityElement.value = currentQuantity;
    updateTotal();
  };

  // Função para validar entrada manual
  const validateQuantity = () => {
    let quantity = parseInt(quantityElement.value);
    if (isNaN(quantity) || quantity < 0) quantity = 0; // Corrige valores inválidos
    quantityElement.value = quantity;
    updateTotal();
  };

  // Adiciona eventos aos botões
  document.querySelector('.minus').addEventListener('click', () => adjustQuantity(-1));
  document.querySelector('.plus').addEventListener('click', () => adjustQuantity(1));

  // Valida quantidade ao alterar manualmente
  quantityElement.addEventListener('change', validateQuantity);

  // Inicializa o total
  updateTotal();
});
