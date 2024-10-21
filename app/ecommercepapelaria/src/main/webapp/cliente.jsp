<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Cliente</title>
</head>
<body>

<div class="container">

  <h1>Cliente</h1>

  <br>

  <table>
    <tr>
      <th>ID</th>
      <th>Nome</th>
      <th>CPF</th>
      <th>Telefone</th>
      <th>Email</th>
      <th>Rua</th>
      <th>Numero</th>
      <th>Estado</th>
      <th>Cidade</th>
    </tr>
    <c:forEach var="cliente" items="${clientes}">
      <tr>
        <td>${cliente.idCliente}</td>
        <td>${cliente.nome}</td>
        <td>${cliente.cpf}</td>
        <td>${cliente.telefone}</td>
        <td>${cliente.email}</td>
        <td>${cliente.rua}</td>
        <td>${cliente.numero}</td>
        <td>${cliente.estado}</td>
        <td>${cliente.cidade}</td>
        <td>
        <form action="/delete-cliente" method="post">
          <input type="hidden" id="idCliente" name="idCliente" value="${cliente.idCliente}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="clientes.jsp?id=${cliente.idCliente}&name=${cliente.nome}">Update</a>
        </form>
        </td>
      </tr>
    </c:forEach>
  </table>
  </div>

</body>
</html>