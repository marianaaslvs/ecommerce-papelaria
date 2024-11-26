<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <head>
      <meta charset="UTF-8">
      <title>Imaginarte - Fale Conosco</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      <%@ include file="header.jsp" %>
        <link href="css/FaleConoscoAdmin.css" rel="stylesheet" type="text/css" >
        <link rel="icon" href="imagens/Logo.png">
    </head>

        <body>

            <div class="container">

              <table class="table">
                  <br>
                  <h4>Fale Conosco - Controle de Qualidade</h4>
                  <br>
                <thead>
                <tr>
                  <th>Número do Chamado</th>
                  <th>Nome Cliente</th>
                  <th>Email</th>
                  <th>Dúvida</th>
                  <th>Status</th>
                  <th></th>
                </tr>
                </thead>

                <tbody>
                    <c:forEach var="duvida" items="${duvidas}">
                      <tr>
                        <td>${duvida.idDuvida}</td>
                        <td>${duvida.nome}</td>
                        <td>${duvida.email}</td>
                        <td>${duvida.duvida}</td>
                        <td>${duvida.status}</td>

                        <td>
                            <form action="/delete-fale-conosco" method="post">
                                <input type="hidden" id="idDuvida" name="idDuvida" value="${duvida.idDuvida}">
                                <button type="submit">Delete</button>

                                <span> | </span>
                                <a href="faleConoscoP.jsp?idDuvida=${duvida.idDuvida}&nome=${duvida.nome}&email=${duvida.email}&duvida=${duvida.duvida}&status=${duvida.status}">Update</a>

                            </form>

                        =</td>
                      </tr>
                    </c:forEach>
                </tbody>
              </table>


        </body>
</html>