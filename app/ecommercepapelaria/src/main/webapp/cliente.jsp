<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Cliente</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>


<body>

<div class="container">

  <h1>Cliente</h1>

  <br>

  <table class="table table-sm">
  <thead>
    <tr>
      <th>ID</th>
      <th>Nome</th>
      <th>CPF</th>
      <th>Telefone</th>
      <th>Email</th>
      <th>Rua</th>
      <th>Numero</th>
      <th>Cidade</th>
      <th>Estado</th>
      <th>Senha</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="cliente" items="${clientes}">
      <tr>
        <td>${cliente.idCliente}</td>
        <td>${cliente.nome}</td>
        <td>${cliente.cpf}</td>
        <td>${cliente.telefone}</td>
        <td>${cliente.email}</td>
        <td>${cliente.rua}</td>
        <td>${cliente.numero}</td>
        <td>${cliente.cidade}</td>
        <td>${cliente.estado}</td>
        <td>${cliente.senha}</td>
        <td>
        <form action="/delete-cliente" method="post">
          <input type="hidden" id="idCliente" name="idCliente" value="${cliente.idCliente}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="clientes.jsp?idCliente=${cliente.idCliente}&nome=${cliente.nome}&cpf=${cliente.cpf}&telefone=${cliente.telefone}&email=${cliente.email}&rua=${cliente.rua}&numero=${cliente.numero}&cidade=${cliente.cidade}&estado=${cliente.estado}&senha=${cliente.senha}">Update</a>
        </form>
        </td>
      </tr>
    </c:forEach>
    <tbody>
  </table>
  </div>

</body>
</html>