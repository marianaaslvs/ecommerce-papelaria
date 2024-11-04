<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <link href= "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

  <meta charset="UTF-8">
  <title>LOGIN</title>
  </head>
<body>

<div class="container">

  <h1>LOGIN</h1>

  <br>

  <table class = "table">


    <thead
>

        <tr>
      <th>ID</th>
      <th>CPF</th>
      <th>SENHA</th>

    </tr>
    </thead>
<tbody>

    <c:forEach var="login" items="${login}">
      <tr>
        <td>${login.cpf}</td>
        <td>${login.senha}</td>

       <td>
        <form action="/delete-login" method="post">
          <input type="hidden" id="cpf" name="cpf" value="${login.cpf}">
          <button type="submit">Delete</button>
          <span> | </span>
          <a href="login.jsp?id=${login.cpf}&name=${login.cpf}&senha=${login.senha}">Update</a>
        </form>
       </td>
      </tr>
    </c:forEach>

  </table>
  </div>

</body>
</html>