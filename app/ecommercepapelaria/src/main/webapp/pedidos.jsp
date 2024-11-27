<html>

<head>
    <title>Pedidos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <%@ include file="header.jsp" %>
    <link href="css/CadastrarPedido.css" rel="stylesheet" type="text/css" >
</head>



<body>

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
            <label>Endereco</label>
            <input type="text" name="endereco" id="endereco" class="form-control" value="${param.endereco}">
        </div>

        <div class="mb-3">
            <label>Valor</label>
            <input type="text" name="valor" id="valor" class="form-control" value="${param.valor}">
        </div>

        <div class="mb-3">
            <label>Status</label>
            <select name="status" id="status" class="form-control">
                <option value="">Selecione uma opcao</option>
                <option value="Em separacao">Em separacao</option>
                <option value="A Caminho">A Caminho</option>
                <option value="Entregue">Entregue</option>
            </select>
        </div>

        <button class="btn btn-primary" type="submit">Salvar</button>

    </form>

</div>

</body>

</html>