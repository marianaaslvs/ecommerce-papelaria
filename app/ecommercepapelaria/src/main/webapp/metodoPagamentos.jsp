<html>

<head>
    <title>Metodo de Pagamento</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" href="css/MetodoPagamento.css">

</head>

  <%@ include file="header.jsp"%>


<section class="h-100 h-custom" style="background-color: #fff8ef;">
  <div class="container h-100 py-5">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card shopping-cart" style="border-radius: 15px; border: 3px solid #FEB6C6;">
          <div class="card-body">


            <!-- Início da seção de produtos -->
            <div class="row">
              <!-- Coluna da esquerda: lista de produtos -->
              <div class="col-lg-6 px-5 py-4">

                <!-- Título da seção -->
                <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">SEUS PRODUTOS</h3>

                <!-- Produto 1 -->
                <div class="d-flex align-items-center mb-5">
                  <!-- Imagem do produto -->
                  <div class="flex-shrink-0">
                    <img src="${param.image}"
                      class="img-fluid" style="width: 150px;" alt="Generic placeholder image">
                  </div>
                  <!-- Informações do produto -->
                  <div class="flex-grow-1 ms-3">
                    <!-- Ícone para remover o produto -->
                    <a href="#!" class="float-end"><i class="fas fa-times"></i></a>
                     <h5 class="card-title">${param.nomeProduto}</h5>
                <h6 style="color: #fdBc96;">${param.descricao}</h6>



<!-- Preço e controle de quantidade -->
<div class="d-flex align-items-center">
  <p id="price" class="fw-bold mb-0 me-5 pe-3">${param.preco}</p>
  <div class="def-number-input number-input d-flex align-items-center">
    <!-- Botões para ajustar a quantidade -->
    <button onclick="adjustQuantity(-1)"     class="minus btn btn-sm btn-outline-secondary rounded-circle me-2">-</button>
    <input id="quantity" class="quantity text-center fw-bold bg-body-tertiary text-body"
           min="0" name="quantity" value="1" type="number"
           onchange="validateQuantity()">


    <button onclick="adjustQuantity(1)" class="plus btn btn-sm btn-outline-secondary rounded-circle m-2">+</button>
  </div>
</div>
  <script src="total.js" defer></script>

</div>
</div>

<!-- FIM SEÇÃO DE PRODUTOS -->

 <!-- Linha divisória para separar os produtos do resumo -->
                <hr class="mb-4" style="height: 4px; background-color: #fdBc96; opacity: 5; border: none">

                <!-- Resumo de descontos e total -->

                <div class="d-flex justify-content-between p-2 mb-2 custom-bg">
                  <h5 class="fw-bold mb-0">Total:</h5>
<p id="total" class="fw-bold mt-3">Total: R$0.00</p>
                </div>

              </div>

              <!-- FIM SEÇÃO DE RESUMO -->


              <!-- FORMULARIO DE PAGAMENTO -->
   <!-- Coluna da direita: formulário de pagamento -->
               <div class="col-lg-6 px-5 py-4">
                               <!-- Título da seção -->
                <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">PAGAMENTO</h3>


<div class="container">

    <h2>Dados do cartao</h2>

    <form action="/criar-metodoPagamento" method="post">
<input type="hidden" id="idMetodoPagamento" name="idMetodoPagamento" value="${param.idMetodoPagamento}">




   <form class="mb-5">

<!-- Campo para o número do cartão -->

       <div data-mdb-input-init class="form-outline mb-5">
           <label for="numCartao" class="form-label">Numero do Cartao:</label>
           <input type="text" name="numCartao" id="numCartao" class="form-control  form-control-lg" size="16" required>
        </div>

<!-- Campo para o nome no cartao -->
        <div data-mdb-input-init class="form-outline mb-5">
         <!-- for="titular" -->
                    <label  class="form-label" for="titular">Nome do Titular:</label>

          <input type="text" name="titular" id="titular" class="form-control form-control-lg" size="17" required>
        </div>
<! Campo para a validade e cvv do cartão -->


<div class="row">
<div class="col-md-6 mb-5">
  <div data-mdb-input-init class="form-outline">
                        <label for="validade" class="form-label">Data de Validade (MM/AA):</label>

            <input type="text" name="validade" id="validade" class="form-control form-control-lg" placeholder="MM/AA" size="7" required>
        </div>
</div>

<div class="col-md-6 mb-5">
                    <label for="codSeg" class="form-label">Codigo de Seguranca (CVV):</label>
            <input type="text" name="codSeg" id="codSeg" class="form-control form-control-lg" size="1" required>

        </div>

         <button href="/pedido.jsp" class="btn btn-primary" type="submit">Realizar Pagamento</button>

    </form>

</div>

</html>