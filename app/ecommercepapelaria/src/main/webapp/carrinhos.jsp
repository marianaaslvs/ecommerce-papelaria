<html>
<head>
    <title>CARRINHO</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <h2>CARRINHO</h2>

    <form action="/criar-carrinho" method="post">


          <! --  <input type="hidden" id="idCarrinho" name="idCarrinho" value="${param.idCarrinho}"> -->



        <div  class="mb-3">
            <label for="idCliente" class="form-label">ID do Cliente:</label>
            <input type="text" name="idCliente" id="idCliente" class="form-control">
        </div>

        <div  class="mb-3">
            <label for="idProduto" class="form-label">ID do Produto:</label>
            <input type="text" name="idProduto" id="idProduto"  class="form-control">
        </div>
             <div  class="mb-3">
                 <label for="quantidade" class="form-label">QUANTIDADE:</label>
                 <input type="number" name="quantidade" id="quantidade"  class="form-control">
             </div>


        <button class="btn btn-primary" type="submit">Salvar</button>

    </form>

</div>

</body>
</html>