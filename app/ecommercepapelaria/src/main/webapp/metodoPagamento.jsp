<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>METODO DE PAGAMENTO</title>
  </head>
<body>

<div class="container">

  <h1>METODO DE PAGAMENTO</h1>

  <br>

  <table>
    <tr>
      <th>ID</th>
      <th>TITULAR</th>
      <th>NUMCARTAO</th>
      <th>VALIDADE</th>
      <th>CODSEG</th>
    </tr>


    <c:forEach var="metodoPagamento" items="${metodoPagamento}">
      <tr>
        <td>${metodoPagamento.titular}</td>
        <td>${metodoPagamento.numCartao}</td>
        <td>${metodoPagamento.validade}</td>
        <td>${metodoPagamento.codSeg}</td>
        <td>${metodoPagamento.id}</td>

       <td>
        <form action="/delete-login" method="post">
          <input type="hidden" id="numCartao" name="cpf" value="${metodoPagamento.numCartao}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="login.jsp?id=${metodoPagamento.numCartao}&name=${metodoPagamento.numCartao}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>

  </table>
  </div>

</body>
</html>