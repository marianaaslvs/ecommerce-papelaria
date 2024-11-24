<html>
<head>
    <meta charset="UTF-8">
    <title>Imaginarte - Fale Conosco</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="css/FaleConosco.css" rel="stylesheet" type="text/css" >
    <link rel="icon" href="imagens/Logo.png">
</head>
<%@ include file="header.jsp" %>

<body>

<div class="container">

  <form action="/fale-conosco" method="post">
    <h4>Fale Conosco</h4>

    <input type="hidden" id="idDuvida" name="idDuvida" value="${param.idDuvida}">

    <div  class="mb-3">
      <input type="text" name="nome" id="nome" class="form-control" value="${param.nome}" placeholder="Nome Completo" required>
    </div>

    <div  class="mb-3">
      <input type="text" name="email" id="email"  class="form-control" value="${param.email}" placeholder="email" required>
    </div>

    <div  class="mb-3">
      <input type="text" name="duvida" id="duvida"  class="form-control" value="${param.duvida}" placeholder="dúvida" required>
    </div>

    <div  class="mb-3">
          <select name="status" id="status" class="form-control">
             <option value="">Status da solicitacao</option>
                 <option value="Não Recebido">Não Recebido</option>
                 <option value="Recebido">Recebido</option>
                 <option value="Concluído">Concluído</option>
                 <option value="Cancelado">Cancelado</option>
                 <option value="Indeferido">Indeferido</option>
          </select>
    </div>

    <button class="btn btn-primary" type="submit">Enviar</button>

  </form>

</div>

</body>
</html>