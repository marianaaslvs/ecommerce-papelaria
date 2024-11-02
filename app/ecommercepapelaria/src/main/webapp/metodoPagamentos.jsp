<html>
<head>
    <title>Metodo de Pagamento</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <h2>Metodo de Pagamento</h2>

    <form action="/criar-metodoPagamento" method="post">



            <input type="hidden" id="idMetodoPagamento" name="idMetodoPagamento" value="${param.idMetodoPagamento}">



        <div class="mb-3">
            <label for="titular" class="form-label">Nome do Titular:</label>
            <input type="text" name="titular" id="titular" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="numCartao" class="form-label">Numero do Cartao:</label>
            <input type="text" name="numCartao" id="numCartao" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="validade" class="form-label">Data de Validade (MM/AA):</label>
            <input type="text" name="validade" id="validade" class="form-control" placeholder="MM/AA" required>
        </div>

        <div class="mb-3">
            <label for="codSeg" class="form-label">Codigo de Seguranca (CVV):</label>
            <input type="text" name="codSeg" id="codSeg" class="form-control" required>
        </div>

        <button class="btn btn-primary" type="submit">Realizar Pagamento</button>

    </form>

</div>

</body>
</html>