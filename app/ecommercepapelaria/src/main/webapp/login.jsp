<!DOCTYPE html>
<html lang="en">
<head>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">


    <meta charset="UTF-8">
    <title>Login</title>
        <script>
            function formatCPF(cpfField) {
                let cpf = cpfField.value.replace(/\D/g, ''); // Remove caracteres não numéricos
                if (cpf.length > 11) {
                    cpf = cpf.slice(0, 11); // Limita a 11 caracteres
                }
                if (cpf.length > 9) {
                    cpf = cpf.replace(/(\d{3})(\d{3})(\d{3})(\d{1,2})/, '$1.$2.$3-$4');
                } else if (cpf.length > 6) {
                    cpf = cpf.replace(/(\d{3})(\d{3})(\d{1,3})/, '$1.$2.$3');
                } else if (cpf.length > 3) {
                    cpf = cpf.replace(/(\d{3})(\d{1,3})/, '$1.$2');
                }
                cpfField.value = cpf; // Atualiza o valor no campo
            }
        </script>

</head>




<%@ include file="header.jsp" %>


    <link rel="stylesheet" type="text/css" href="css/Login.css">


<div class="wrapper fadeInDown">
  <div id="formContent">

<body>

<form action="/login" method="post">


    <span>${requestScope.message}</span>

    <br>

<!-- LABEL DE CPF -->
  <h1 class="bebas-neue-regular">LOGIN IMAGINARTE</h1>

    <input type="text" id="cpf" class = "fadeIn second" name="cpf" placeholder = "CPF">


    <br>

<!-- LABEL DE SENHA -->
   <!-- <label for="SENHA">SENHA</label> -->
    <input type="password" id="senha" class = "fadeIn third" name="senha" placeholder = "SENHA">
      <input type="submit" class="fadeIn second" value="Login">









   <!-- <button type="submit" class = "fadeIn fourth" value="Login">Login</button>-->

</form>

</body>
</html>