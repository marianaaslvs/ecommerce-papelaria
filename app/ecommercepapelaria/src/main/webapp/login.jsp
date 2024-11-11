<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<form action="/login" method="post">

    <span>${requestScope.message}</span>

    <br>

    <label for="CPF">CPF</label>
    <input type="text" id="cpf" name="cpf">

    <br>

    <label for="SENHA">SENHA</label>
    <input type="text" id="senha" name="senha">

    <button type="submit">Login</button>

</form>

</body>
</html>