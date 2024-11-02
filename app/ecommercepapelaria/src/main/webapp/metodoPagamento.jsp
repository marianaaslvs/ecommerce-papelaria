<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<link href= "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <meta charset="UTF-8">
  <title>METODO DE PAGAMENTO</title>
  </head>
<body>

<div class="container">

  <h1>METODO DE PAGAMENTO</h1>

  <br>

  <table class="table">

  <thead>
    <tr>

      <th>ID</th>
      <th>TITULAR</th>
      <th>NUMCARTAO</th>
      <th>VALIDADE</th>
      <th>CODSEG</th>
    </tr>
</thead>
<tbody>
    <c:forEach var="metodoPagamento" items="${metodoPagamento}">


      <tr>
        <td>${metodoPagamento.idMetodoPagamento}</td>
        <td>${metodoPagamento.titular}</td>
        <td>${metodoPagamento.numCartao}</td>
        <td>${metodoPagamento.validade}</td>
        <td>${metodoPagamento.codSeg}</td>

       <td>
        <form action="/delete-metodoPagamento" method="post">
          <input type="hidden" id="idMetodoPagamento" name="idMetodoPagamento" value="${metodoPagamento.idMetodoPagamento}">
          <button type="submit">Delete</button>

          <span> | </span>
          <a href="login.jsp?id=${metodoPagamento.numCartao}&name=${metodoPagamento.numCartao}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>
</tbody>

  </table>
  </div>

</body>
</html>