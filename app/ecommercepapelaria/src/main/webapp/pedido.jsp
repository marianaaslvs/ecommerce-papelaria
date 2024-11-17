<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Pedido</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
<body>

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
        <c:if test="${sessionScope.loggedUser != null}">

        <form action="/delete-pedido" method="post">
          <input type="hidden" id="codPedido" name="codPedido" value="${pedido.codPedido}">
          <button type="submit" class="btn btn-primary">Excluir</button>


          <span> | </span>
          <a class="btn btn-secondary" href="pedidos.jsp?codPedido=${pedido.codPedido}&cliente=${pedido.cliente}&produto=${pedido.produto}&metodoPagamento=${pedido.metodoPagamento}&status=${pedido.status}">Alterar</a>
        </form>
         </c:if>

       </td>
      </tr>
    </c:forEach>
    </tbody>

  </table>
  </div>

</body>
</html>