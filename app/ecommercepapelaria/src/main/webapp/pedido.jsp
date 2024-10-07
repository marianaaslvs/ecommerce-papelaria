<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Pedido</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

  <h1>Pedido</h1>

  <br>

  <table class="table">
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
        <td>${pedidos.cliente}</td>
        <td>${pedidos.produto}</td>
        <td>${pedidos.metodoDePagamento}</td>
        <td>${pedidos.status}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>

</body>
</html>