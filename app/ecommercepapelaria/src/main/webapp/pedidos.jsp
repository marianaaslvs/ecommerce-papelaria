<html>

<head>
    <title>Pedido</title>
</head>

<body>

    <h2>Pedidos</h2>

    <form action="/criar-pedido" method="post">

        <input type="hidden" id="codPedido" name="codPedido" value="${param.codPedido}">
        <label>Cliente</label>
        <input type="text" name="cliente" id="cliente" value="${param.cliente}">
        <label>Produto</label>
        <input type="text" name="produto" id="produto" value="${param.produto}">
        <label>Metodo de Pagamento</label>
        <input type="text" name="metodoPagamento" id="metodoPagamento" value="${param.metodoPagamento}">
        <label>Status</label>
        <input type="text" name="status" id="status" value="${param.status}">


        <button type="submit">Salvar</button>

    </form>

</body>

</html>