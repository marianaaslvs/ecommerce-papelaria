<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
    <meta charset="UTF-8">
    <title>Imaginarte - Fale Conosco</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <%@ include file="header.jsp" %>
    <link href="css/FaleConosco.css" rel="stylesheet" type="text/css" >
    <link href="css/Footer.css" rel="stylesheet" type="text/css" >
    <link rel="icon" href="imagens/Logo.png">

</head>


<body>
<div class="content">
<div class="container">


  <form action="/fale-conosco" method="post">
      <br>
    <h4>Fale Conosco</h4>

    <input type="hidden" id="idDuvida" name="idDuvida" value="${param.idDuvida}">

    <div  class="mb-3">
      <input type="text" name="nome" id="nome" class="form-control" value="${param.nome}" placeholder="Nome Completo" required>
    </div>

    <div  class="mb-3">
      <input type="text" name="email" id="email"  class="form-control" value="${param.email}" placeholder="Email" required>
    </div>

    <div  class="mb-3">
      <input type="text" name="duvida" id="duvida"  class="form-control" value="${param.duvida}" placeholder="Dúvida" required>
    </div>


    <c:if test="${sessionScope.loggedUser != null && sessionScope.loggedUser == '12345'}">
        <div  class="mb-3">
              <select name="status" id="status" class="form-control">
                 <option value="">Status da solicitação</option>
                     <option value="Não Recebido">Não Recebido</option>
                     <option value="Recebido">Recebido</option>
                     <option value="Concluído">Concluído</option>
                     <option value="Cancelado">Cancelado</option>
                     <option value="Indeferido">Indeferido</option>
              </select>
        </div>
    </c:if>

      <c:if test="${sessionScope.loggedUser == null || sessionScope.loggedUser != '123.456.789-10'}">
          <input type="hidden" name="status" value="Não Recebido" />
      </c:if>

    <button class="btn btn-primary" type="submit">Enviar</button>
<br>
      <div class="mensagem">
      <c:if test="${not empty mensagem}">
          <div class="alert alert-info">
                  ${mensagem}
          </div>
      </c:if>
      </div>
  </form>

</div>

</div>


        <footer>
            <div class="footer">
                <div class="itens">
                    Contato: sac.imaginarte@gmail.com <br>
                    Copyright &copy; 2024 Imaginarte
                </div>
            </div>
        </footer>

</body>
</html>