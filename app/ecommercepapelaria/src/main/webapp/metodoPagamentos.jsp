<html>
<head>
    <title>Metodo de Pagamento</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <%@ include file="header.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/MetodoPagamento.css">
    <link href="css/Footer.css" rel="stylesheet" type="text/css" >
</head>
<body style="background-color: #fff8ef;">
<br><br>
<div class="content">
    <section style="background-color: #fff8ef;">
        <div class="container py-5">
            <div class="row d-flex justify-content-center align-items-center">
                <div class="col-lg-6 mb-4">
                    <div class="card shopping-cart" style="border-radius: 15px; border: 3px solid #FEB6C6;">
                        <div class="card-body">
                            <!-- SEÇÃO DE PRODUTOS -->
                            <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">SEUS PRODUTOS</h3>
                            <div class="d-flex align-items-center mb-5">
                                <div class="flex-shrink-0">
                                    <img src="${param.image}" class="img-fluid" style="width: 150px;" alt="Imagem do produto">
                                </div>
                                <div class="flex-grow-1 ms-3">
                                    <a href="#!" class="float-end"><i class="fas fa-times"></i></a>
                                    <h5 class="card-title">${param.nomeProduto}</h5>
                                    <h6 style="color: #fdBc96;">${param.descricao}</h6>
                                    <div class="d-flex align-items-center">
                                        <p id="price" class="fw-bold mb-0 me-5 pe-3">R$ ${param.preco}</p>
                                        <div class="def-number-input number-input d-flex align-items-center">
                                            <button onclick="adjustQuantity(-1)" class="minus btn">-</button>
                                            <input id="quantity" class="quantity text-center fw-bold bg-body-tertiary text-body" min="0" name="quantity" value="1" type="number" onchange="validateQuantity()">
                                            <button onclick="adjustQuantity(1)" class="plus btn">+</button>
                                        </div>
                                    </div>
                                    <script src="total.js" defer></script>
                                </div>
                            </div>

                            <hr class="mb-4" style="height: 4px; background-color: #fdBc96; opacity: 5; border: none">
                            <div class="d-flex justify-content-center p-2 mb-2 custom-bg">
                                <p id="total" class="fw-bold mt-3">Total: R$0.00</p>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- FORMULÁRIO DE PAGAMENTO -->
                <div class="col-lg-6">
                    <h3 class="mb-5 pt-2 text-center fw-bold text-uppercase">PAGAMENTO</h3>
                    <div class="container">
                        <h2>Dados do Cartão</h2>
                        <form action="/criar-metodoPagamento" method="post">
                            <input type="hidden" id="idMetodoPagamento" name="idMetodoPagamento" value="${param.idMetodoPagamento}">
                            <div class="mb-5">
                                <div data-mdb-input-init class="form-outline mb-5">
                                    <label for="numCartao" class="form-label">Número do Cartão:</label>
                                    <input type="text" name="numCartao" id="numCartao" class="form-control form-control-lg" size="16" required>
                                </div>
                                <div data-mdb-input-init class="form-outline mb-5">
                                    <label class="form-label" for="titular">Nome do Titular:</label>
                                    <input type="text" name="titular" id="titular" class="form-control form-control-lg" size="17" required>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 mb-5">
                                        <div data-mdb-input-init class="form-outline">
                                            <label for="validade" class="form-label">Data de Validade (MM/AA):</label>
                                            <input type="text" name="validade" id="validade" class="form-control form-control-lg" placeholder="MM/AA" size="7" required>
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-5">
                                        <label for="codSeg" class="form-label">Código de Segurança (CVV):</label>
                                        <input type="text" name="codSeg" id="codSeg" class="form-control form-control-lg" size="1" required>
                                    </div>
                                </div>
                                <button href="pedidos.jsp?idMetodoPagamento=${metodoPagamento.idMetodoPagamento}&titular=${metodoPagamento.titular}&numCartao=${metodoPagamento.numCartao}&validade=${metodoPagamento.validade}&codSeg=${metodoPagamento.codSeg}" class="btn btn-primary" type="submit">Realizar Pagamento</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>

<!-- Footer -->
<footer>
    <div class="footer">
        <div class="itens">
            Contato: sac.imaginarte@gmail.com <br>
            Copyright &copy; 2024 Imaginarte
        </div>
    </div>
</footer>
</body>
</html>
