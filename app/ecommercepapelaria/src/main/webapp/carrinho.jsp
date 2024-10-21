<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>CARRINHO</title>
  </head>
<body>

<div class="container">

  <h1>CARRINHO</h1>

  <br>

  <table>
    <tr>
      <th>ID</th>
      <th>IDCLIENTE</th>
      <th>IDPRODUTO</th>

    </tr>
    <c:forEach var="carrinho" items="${carrinho}">
      <tr>
        <td>${carrinho.idCarrinho}</td>

        <td>${carrinho.idCliente}</td>
        <td>${carrinho.idProduto}</td>

       <td>
        <form action="/delete-carrinho" method="post">
          <input type="hidden" id="idCarrinho" name="idCarrinho" value="${carrinho.idCarrinho}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="login.jsp?id=${carrinho.idCarrinho}&name=${carrinho.idCarrinho}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>

  </table>
  </div>

</body>
</html>