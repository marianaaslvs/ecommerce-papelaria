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
      <th>idProduto</th>
      <th>nomeProduto</th>
      <th>descricao</th>
      <th>preco</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="produto" items="${produtos}">
      <tr>
        <td>${produto.idProduto}</td>
        <td>${produto.nomeProduto}</td>
        <td>${produto.descricao}</td>
        <td>${produto.preco}</td>


            <td>

                   <form action="/delete-produto" method="post">
                   <input type="hidden" id="idProduto" name="idProduto" value="${produto.idProduto}">
                   <button type="submit">Delete</button>

                   <span> | </span>
                   <a href="produtos.jsp?idProduto=${produto.idProduto}&nomeProduto=${produto.nomeProduto}&descricao=${produto.descricao}&preco=${produto.preco}">Update</a>
                   </form>
          </td>



      </tr>
    </c:forEach>
    </tbody>
  </table>
  <div>

</body>
</html>