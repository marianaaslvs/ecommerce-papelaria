<html>
<head>
    <meta charset="UTF-8">
    <title>Imaginarte - Fale Conosco</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>

<div class="container">

  <h2>Fale Conosco</h2>

  <form action="/fale-conosco" method="post">

    <input type="hidden" id="idDuvida" name="idDuvida" value="${param.idDuvida}">

    <div  class="mb-3">
      <label for="nome">Nome: </label>
      <input type="text" name="nome" id="nome" class="form-control" value="${param.nome}">
    </div>

    <div  class="mb-3">
      <label for="email">Email: </label>
      <input type="text" name="email" id="email"  class="form-control" value="${param.email}">
    </div>

    <div  class="mb-3">
      <label for="duvida">Duvida</label>
      <input type="text" name="duvida" id="duvida"  class="form-control" value="${param.duvida}">
    </div>

    <div  class="mb-3">
          <label>Status</label>
          <select name="status" id="status" class="form-control">
             <option value="">Status da solicitacao</option>
                 <option value="Não Recebido">Não Recebido</option>
                 <option value="Recebido">Recebido</option>
                 <option value="Concluído">Concluído</option>
                 <option value="Cancelado">Cancelado</option>
                 <option value="Indeferido">Indeferido</option>
          </select>
    </div>

    <button class="btn btn-primary" type="submit">Salvar</button>

  </form>

</div>

</body>
</html>