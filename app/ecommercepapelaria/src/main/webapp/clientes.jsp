<html>
<head>
    <title>Cliente</title>
</head>
<body>

    <h2>Cadastro de Clientes</h2>

    <form action="/criar-cliente" method="post">

            <input type="hidden" id="idCliente" name="idCliente" value="${param.idCliente}">

            <label>Nome</label>
            <input type="text" name="nome" id="nome" value="${param.nome}">

            <label>CPF</label>
            <input type="text" name="cpf" id="cpf"  value="${param.cpf}">

            <label>Telefone</label>
            <input type="text" name="telefone" id="telefone"  value="${param.telefone}">

            <label>Email</label>
            <input type="text" name="email" id="email"  value="${param.email}">

            <label>Rua</label>
            <input type="text" name="rua" id="rua"  value="${param.rua}">

            <label>Numero:</label>
            <input type="text" name="numero" id="numero"  value="${param.numero}">

            <label>Cidade</label>
            <input type="text" name="cidade" id="cidade"  value="${param.cidade}">

            <label>Estado</label>
            <input type="text" name="estado" id="estado"  value="${param.estado}">

        <button type="submit">Salvar</button>

    </form>

</body>
</html>