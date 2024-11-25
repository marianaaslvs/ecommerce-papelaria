<html>
<head>
    <title>Pedido</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="css/CadastrarPedido.css" rel="stylesheet" type="text/css">
</head>

<%@ include file="header.jsp" %>

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
                                             class="img-fluid" style="width: 150px;" alt="Produto">
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
                                                <button onclick="adjustQuantity(-1)" class="minus btn btn-sm btn-outline-secondary rounded-circle me-2">-</button>
                                                <input id="quantity" class="quantity text-center fw-bold bg-body-tertiary text-body" min="0" name="quantity" value="1" type="number" onchange="validateQuantity()">
                                                <button onclick="adjustQuantity(1)" class="plus btn btn-sm btn-outline-secondary rounded-circle m-2"> + </button>
                                            </div>
                                        </div>
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

                            <!-- Seção de Dados de Pagamento -->
                            <div class="col-lg-6 px-5 py-4">
                                <!-- Título da seção -->
                                <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">DADOS DE PAGAMENTO</h3>

                                <!-- Exibir os dados de pagamento -->
                                <div class="container">
                                    <p><strong>Nome do Titular:</strong> ${param.titular}</p>
                                    <p><strong>Numero Cartao:</strong> ${param.numCartao}</p>
                                    <p><strong>Validade:</strong> ${param.validade}</p>
                                    <p><strong>Codigo de Seguranca:</strong>${param.codSeg}</p>
                                </div>
                            </div>

                            <!-- FIM SEÇÃO DE DADOS DE PAGAMENTO -->

                            <!-- Seção de Dados do Cliente -->
                            <div class="col-lg-6 px-5 py-4">
                                <!-- Título da seção -->
                                <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">DADOS DO CLIENTE</h3>

                                <!-- Exibir os dados do cliente -->
                                <div class="container">
                                    <p><strong>Nome:</strong> ${param.nome}</p>
                                    <p><strong>CPF:</strong> ${param.cpf}</p>
                                    <p><strong>Telefone:</strong> ${param.telefone}</p>
                                    <p><strong>Email:</strong> ${param.email}</p>
                                    <p><strong>Rua:</strong> ${param.rua}</p>
                                    <p><strong>Numero:</strong> ${param.numero}</p>
                                    <p><strong>Cidade:</strong> ${param.cidade}</p>
                                    <p><strong>Estado:</strong> ${param.estado}</p>
                                </div>
                            </div>
                            <!-- FIM SEÇÃO DE DADOS DO CLIENTE -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</html>
