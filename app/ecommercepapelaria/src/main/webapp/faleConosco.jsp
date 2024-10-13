<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Fale Conosco</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>

<div class="container">

  <h1>Fale Conosco</h1>

  <br>

  <table class="table">
    <thead>
    <tr>
      <th>nome</th>
      <th>email</th>
      <th>duvida</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="faleConosco" items="${duvidas}">
      <tr>
        <td>${duvidas.nome}</td>
        <td>${duvidas.email}</td>
        <td>${duvidas.duvida}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>

</body>
</html>