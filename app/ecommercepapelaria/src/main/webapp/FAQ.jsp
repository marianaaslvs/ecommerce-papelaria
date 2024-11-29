<html lang="pt-br">
<head>
  <title>Imaginarte - FAQ</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="icon" href="../../../../favicon.ico">

  <link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/ConfirmacaoPedido.css" rel="stylesheet" type="text/css">
  <link href="css/Footer.css" rel="stylesheet" type="text/css">

  <style>
    body, html {
      margin: 0;
      padding: 0;
      height: 100%;
      font-family: Arial, sans-serif;
    }

    .faq-container {
      max-width: 800px;
      margin: 0 auto;
      padding-top: 50px;
    }

    .accordion-item {
      margin-bottom: 10px;
      border-radius: 8px;
      background-color: #f9f9f9;
    }

    footer {
      padding: 10px 0;
      background-color: #222;
      color: white;
      text-align: center;
    }
  </style>
</head>
        <%@ include file="header.jsp" %>

<body>

  <main>
    <!-- Container do acordeão centralizado -->
    <div class="container text-center">
      <h2 class="mb-5" style="color: #fdBc96;">Perguntas Frequentes (FAQ)</h2> <!-- Título "Perguntas Frequentes (FAQ)" em laranja -->

      <div class="accordion w-75 mx-auto" id="basicAccordion">
        <!-- Pergunta 1 -->
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingOne">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#basicAccordionCollapseOne" aria-expanded="false" aria-controls="collapseOne">
              Quais sao os prazos e custos de entrega?
            </button>
          </h2>
          <div id="basicAccordionCollapseOne" class="accordion-collapse collapse" aria-labelledby="headingOne" data-bs-parent="#basicAccordion">
            <div class="accordion-body">
              Após 24 horas da confirmacao do seu pedido, o prazo é estipulado de acordo com a transportadora responsavel pelo envio.
            </div>
          </div>
        </div>

        <!-- Pergunta 2 -->
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingTwo">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#basicAccordionCollapseTwo" aria-expanded="false" aria-controls="collapseTwo">
              Quais formas de pagamento sao aceitas?
            </button>
          </h2>
          <div id="basicAccordionCollapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#basicAccordion">
            <div class="accordion-body">
              Por enquanto a Imaginarte aceita apenas cartao de credito.
            </div>
          </div>
        </div>

        <!-- Pergunta 3 -->
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingThree">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#basicAccordionCollapseThree" aria-expanded="false" aria-controls="collapseThree">
              Como faco para acompanhar meu pedido?
            </button>
          </h2>
          <div id="basicAccordionCollapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#basicAccordion">
            <div class="accordion-body">
              Após a emissao da etiqueta de envio, a Imaginarte envia o codigo de rastreio no seu email.
            </div>
          </div>
        </div>

        <!-- Pergunta 4 -->
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingFour">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#basicAccordionCollapseFour" aria-expanded="false" aria-controls="collapseFour">
              Qual e a politica de troca, devolucao e reembolso?
            </button>
          </h2>
          <div id="basicAccordionCollapseFour" class="accordion-collapse collapse" aria-labelledby="headingFour" data-bs-parent="#basicAccordion">
            <div class="accordion-body">
              A Imaginarte aceita trocas, devolucoes ou reembolso apenas em casos de:<br>
              <ul>
                <li>Avarias no Produto;</li>
                <li>Atraso na Entrega;</li>
                <li>Falta de estoque;</li>
              </ul>
            </div>
          </div>
        </div>

        <!-- Pergunta 5 -->
        <div class="accordion-item">
          <h2 class="accordion-header" id="headingFive">
            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#basicAccordionCollapseFive" aria-expanded="false" aria-controls="collapseFive">
              Posso personalizar os produtos antes de comprar?
            </button>
          </h2>
          <div id="basicAccordionCollapseFive" class="accordion-collapse collapse" aria-labelledby="headingFive" data-bs-parent="#basicAccordion">
            <div class="accordion-body">
              Infelizmente nao trabalhamos com personalizados, pois a Imaginarte nao possui produtos licenciados.
            </div>
          </div>
        </div>

      </div>
    </div>

  </main>


  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>

</body>

  <footer>
    <div class="footer">
      <div class="itens">
        Contato: sac.imaginarte@gmail.com <br>
        Copyright &copy; 2024 Imaginarte
      </div>
    </div>
  </footer>

</html>
