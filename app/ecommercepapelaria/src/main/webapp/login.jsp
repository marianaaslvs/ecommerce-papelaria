<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <meta charset="UTF-8">
  <title>LOGIN</title>
  </head>
<body>

<div class="container">

  <h1>LOGIN</h1>

  <br>

  <table>
    <tr>
      <th>ID</th>
      <th>CPF</th>
      <th>SENHA</th>

    </tr>
    <c:forEach var="login" items="${login}">
      <tr>
        <td>${login.cpf}</td>
        <td>${login.senha}</td>

       <td>
        <form action="/delete-login" method="post">
          <input type="hidden" id="cpf" name="cpf" value="${login.cpf}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="login.jsp?id=${login.cpf}&name=${login.cpf}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>

  </table>
  </div>

</body>
</html>