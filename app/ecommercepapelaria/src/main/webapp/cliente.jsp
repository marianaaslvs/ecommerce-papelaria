<!DOCTYPE html>
<html lang="en">
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

  <table class="table">
    <thead>
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
    </thead>

    <tbody>
    <c:forEach var="cliente" items="${clientes}">
      <tr>
        <td>${clientes.nome}</td>
        <td>${clientes.cpf}</td>
        <td>${clientes.telefone}</td>
        <td>${clientes.email}</td>
        <td>${clientes.rua}</td>
        <td>${clientes.numero}</td>
        <td>${clientes.estado}</td>
        <td>${clientes.cidade}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>

</body>
</html>