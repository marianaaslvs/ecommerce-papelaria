<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Imaginarte - Cadastrar Produto</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="css/CadastrarProduto.css" rel="stylesheet" type="text/css">

</head>


<body>


<div class="container">



    <form action="/criar-produto" method="post" enctype="multipart/form-data">
        <h4>Cadastrar Produtos</h4>

        <input type="hidden" id="idProduto" name="idProduto" value="${param.idProduto}">


        <div class="pon">
            <div  class="mb-8">
                <input type="text" name="nomeProduto" id="nome-produto" class="form-control" value="${param.nomeProduto}" placeholder="Nome do Produto" required>
                </br>

                <input type="text" name="descricao" id="descricao" class="form-control" value="${param.descricao}" placeholder="Descrição do Produto" required>
                </br>

                <input type="text" name="preco" id="preco"  class="form-control" value="${param.preco}" placeholder="Valor" required>
            </div>

            <div class="mb-4 d-flex justify-content-end">
                <div  class="file-input">
                    <input type="file" name="image" id="image">
                    <br>
                    <label for="image">...</label>
                </div>
            </div>
        </div>


        <button class="btn btn-primary" type="submit">Cadastrar</button>

    </form>

</div>


</body>
</html>