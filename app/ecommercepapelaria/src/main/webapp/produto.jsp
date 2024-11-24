<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
  <meta charset="UTF-8">
  <title>Imaginarte - Cadastrar Produto</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
   <link href="css/AllProdutos.css" rel="stylesheet" type="text/css" >
</head>


<body>

<div class="container">
    <c:if test="${sessionScope.loggedUser != null}">
        <span>${sessionScope.loggedUser}</span>
        <a href="/logout">Logout</a>
    </c:if>

  <h1>Cadastrar Produto</h1>

  <br>

        <c:forEach var="produto" items="${produtos}">
        <input type="hidden" id="idProduto" name="idProduto" value="${param.idProduto}">

        <div class="card" style="width: 300px;">
            <img src="${produto.image}" class="card-img-top" alt="...">
            <div class="card-body text-center">
                <h5 class="card-title">${produto.nomeProduto}</h5>
                <p class="card-text">${produto.preco}</p>
                <a href="/metodoPagamentos.jsp?idProduto=${produto.idProduto}&nomeProduto=${produto.nomeProduto}&descricao=${produto.descricao}&preco=${produto.preco}&image=${produto.image}" class="btn btn-primary">Comprar</a>
            </div>
        </div>



            <td>
         <c:if test="${sessionScope.loggedUser != null && sessionScope.loggedUser == '123.45'}">

                   <form action="/delete-produto" method="post">
                   <input type="hidden" id="idProduto" name="idProduto" value="${produto.idProduto}">
                   <button type="submit">Delete</button>

                   <span> | </span>
                   <a href="produtos.jsp?idProduto=${produto.idProduto}&nomeProduto=${produto.nomeProduto}&descricao=${produto.descricao}&preco=${produto.preco}&image=${produto.image}">Update</a>
                   </form>
         </c:if>
          </td>


        </c:forEach>



  </table>
  <div>

</body>
</html>