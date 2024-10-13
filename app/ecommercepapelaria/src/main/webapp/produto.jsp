<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>Imaginarte - Cadastrar Produto</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

  <h1>Cadastrar Produto</h1>

  <br>

  <table class="table">
    <thead>
    <tr>
      <th>nomeProduto</th>
      <th>descricao</th>
      <th>preco</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="produto" items="${produtos}">
      <tr>
        <td>${produtos.nomeProduto}</td>
        <td>${produtos.descricao}</td>
        <td>${produtos.preco}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>

</body>
</html>