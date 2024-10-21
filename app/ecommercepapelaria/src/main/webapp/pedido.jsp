<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Pedido</title>
  </head>
<body>

<div class="container">

  <h1>Pedido</h1>

  <br>

  <table>
    <tr>
      <th>ID</th>
      <th>Cliente</th>
      <th>Produto</th>
      <th>Metodo De Pagamento</th>
      <th>Status</th>
    </tr>
    <c:forEach var="pedido" items="${pedidos}">
      <tr>
        <td>${pedido.codPedido}</td>
        <td>${pedido.cliente}</td>
        <td>${pedido.produto}</td>
        <td>${pedido.metodoPagamento}</td>
        <td>${pedido.status}</td>
       <td>
        <form action="/delete-pedido" method="post">
          <input type="hidden" id="codPedido" name="codPedido" value="${pedido.codPedido}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="pedidos.jsp?id=${pedido.codPedido}&name=${pedido.cliente}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>

  </table>
  </div>

</body>
</html>