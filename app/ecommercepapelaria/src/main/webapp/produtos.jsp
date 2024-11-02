<html>
<head>
    <title>Imaginarte - Cadastrar Produto</title>
  <link rel="stylesheet" href="webapp/css/CadastrarProduto.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>

<div class="container">

  <h2>Cadastrar Produtos</h2>

  <form action="/criar-produto" method="post" enctype="multipart/form-data">

            <input type="hidden" id="idProduto" name="idProduto" value="${param.idProduto}">

            <div  class="mb-3">
              <label>Nome Produto:</label>
              <input type="text" name="nomeProduto" id="nome-produto" class="form-control" value="${param.nomeProduto}">
            </div>

            <div  class="mb-3">
              <label for="descricao" class="form-label">Descricao:</label>
              <input type="text" name="descricao" id="descricao" class="form-control" value="${param.descricao}">
            </div>

            <div  class="mb-3">
              <label for="preco" class="form-label">Preco</label>
              <input type="text" name="preco" id="preco"  class="form-control" value="${param.preco}">
            </div>

            <div  class="mb-3">
              <label for="image">Choose file</label>
              <input type="file" name="image" id="image">
            </div>

            <button class="btn btn-primary" type="submit">Salvar</button>

  </form>

</div>



</body>
</html>