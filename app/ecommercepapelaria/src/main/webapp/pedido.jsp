<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Pedido</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link href="css/ListarPedido.css" rel="stylesheet" type="text/css" >
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
    <c:if test="${sessionScope.loggedUser != null}">
        <span>${sessionScope.loggedUser}</span>
        <a href="/logout">Logout</a>
    </c:if>

  <h1>Pedido</h1>

  <br>

  <table class="table table-sm">
    <thead>
    <tr>
      <th>ID</th>
      <th>Cliente</th>
      <th>Produto</th>
      <th>Metodo De Pagamento</th>
      <th>Status</th>
      <th></th>
    </tr>
    </thead>

    <tbody>

    <c:forEach var="pedido" items="${pedidos}">

      <tr>
        <td>${pedido.codPedido}</td>
        <td>${pedido.cliente}</td>
        <td>${pedido.produto}</td>
        <td>${pedido.metodoPagamento}</td>
        <td>${pedido.status}</td>
       <td>
<<<<<<< HEAD
<!-- if para que apenas o administrador consiga editar o pedido -->
        <c:if test="${sessionScope.loggedUser != null && sessionScope.loggedUser == '12345'}">
=======
>>>>>>> 086dced3ad8636ebc61819294da391ae0e2221f6

        <form action="/delete-pedido" method="post">
          <input type="hidden" id="codPedido" name="codPedido" value="${pedido.codPedido}">
         <div class="d-flex justify-content-between mb-8">
           <div class="col-6">
             <button  type="submit" class="btn btn-primary w-100">Excluir</button>
           </div>
         </div>
          <div class="d-flex justify-content-between mb-8 ">
            <div class="col-6">
              <a class="btn btn-secondary w-100" href="pedidos.jsp?codPedido=${pedido.codPedido}&cliente=${pedido.cliente}&produto=${pedido.produto}&metodoPagamento=${pedido.metodoPagamento}&status=${pedido.status}">Alterar</a>
            </div>
          </div>

        </form>
<<<<<<< HEAD
         </c:if>
=======
>>>>>>> 086dced3ad8636ebc61819294da391ae0e2221f6

       </td>
      </tr>

    </c:forEach>

    </tbody>

  </table>
  </div>

</body>
</html>