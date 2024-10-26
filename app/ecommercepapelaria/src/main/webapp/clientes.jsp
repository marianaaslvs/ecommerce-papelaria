<html>
<head>
    <title>Cliente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <h2>Cadastro de Clientes</h2>

    <form action="/criar-cliente" method="post">

            <input type="hidden" id="idCliente" name="idCliente" value="${param.idCliente}">

           <div class="mb-3">
            <label>Nome</label>
            <input type="text" name="nome" id="nome" class="form-control" value="${param.nome}">
           </div>

           <div class="mb-3">
            <label>CPF</label>
            <input type="text" name="cpf" id="cpf" class="form-control" value="${param.cpf}">
            </div>

           <div class="mb-3">
            <label>Telefone</label>
            <input type="text" name="telefone" id="telefone" class="form-control" value="${param.telefone}">
           </div>

           <div class="mb-3">
            <label>Email</label>
            <input type="text" name="email" id="email" class="form-control" value="${param.email}">
           </div>

           <div class="mb-3">
            <label>Rua</label>
            <input type="text" name="rua" id="rua" class="form-control" value="${param.rua}">
           </div>

           <div class="mb-3">
            <label>Numero:</label>
            <input type="text" name="numero" id="numero" class="form-control" value="${param.numero}">
           </div>

           <div class="mb-3">
            <label>Cidade</label>
            <input type="text" name="cidade" id="cidade" class="form-control" value="${param.cidade}">
           </div>

           <div class="mb-3">
            <label>Estado</label>
            <input type="text" name="estado" id="estado" class="form-control" value="${param.estado}">
           </div>

        <button class="btn btn-primary" type="submit">Salvar</button>

    </form>

</body>
</html>