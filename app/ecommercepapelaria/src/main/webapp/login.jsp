<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
    <link rel="stylesheet" type="text/css" href="css/Login.css">


<div class="wrapper fadeInDown">
  <div id="formContent">

<body>

<form action="/login" method="post">

    <span>${requestScope.message}</span>

    <br>

<!-- LABEL DE CPF -->
<label class="h3">LOGIN IMAGINARTE</label>

    <input type="text" id="cpf" class = "fadeIn second" name="cpf" placeholder = "CPF">

    <br>

<!-- LABEL DE SENHA -->
   <!-- <label for="SENHA">SENHA</label> -->
    <input type="text" id="senha" class = "fadeIn third" name="senha" placeholder = "SENHA">
      <input type="submit" class="fadeIn fourth" value="Login">



   <!-- <button type="submit" class = "fadeIn fourth" value="Login">Login</button>-->

</form>

</body>
</html>