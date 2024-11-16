<html>

<head>
    <title>Pedidos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="css/CadastrarPedido.css" rel="stylesheet" type="text/css" >
</head>

<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="index.jsp">Imaginarte</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-produtos">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-pedidos">Pedidos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-duvidas">Contato</a>
                </li>
            </ul>
        </div>
    </nav>
</header>

<div class="container">

    <h2>Pedidos</h2>

    <form action="/criar-pedido" method="post">

        <input type="hidden" id="codPedido" name="codPedido" value="${param.codPedido}">

        <div class="mb-3">
        <label>Cliente</label>
        <input type="text" name="cliente" id="cliente" class="form-control" value="${param.cliente}">
        </div>

        <div class="mb-3">
        <label>Produto</label>
        <input type="text" name="produto" id="produto" class="form-control" value="${param.produto}">
        </div>

        <div class="mb-3">
        <label>Metodo de Pagamento</label>
        <input type="text" name="metodoPagamento" id="metodoPagamento" class="form-control" value="${param.metodoPagamento}">
        </div>

        <div class="mb-3">
        <label>Status</label>
        <input type="text" name="status" id="status" class="form-control" value="${param.status}">
        </div>

        <button class="btn btn-primary" type="submit">Salvar</button>

    </form>

</div>

</body>

</html>