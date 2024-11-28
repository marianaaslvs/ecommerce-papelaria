<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
  <title>Imaginarte - Pedidos</title>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <%@ include file="header.jsp" %>
  <link href="css/ListarPedido.css" rel="stylesheet" type="text/css" >
    <link rel="icon" href="/imagens/Logo.png">
</head>



<body>

<div class="container">

    <c:if test="${sessionScope.loggedUser != null}">
        <span>${sessionScope.loggedUser}</span>
        <a href="/logout">Logout</a>
    </c:if>


  <table class="table table-sm">
      <br>
      <h4>Controle de Pedidos</h4>
      <br>

    <thead>
    <tr>
      <th>Pedido</th>
      <th>Cliente</th>
      <th>Produto</th>
      <th>Data</th>
      <th>Endereco</th>
      <th>Valor</th>
      <th>Status</th>
      <th></th>
    </tr>
    </thead>

    <tbody>

    <c:forEach var="pedido" items="${pedidos}">

      <tr>
        <td>${pedido.codPedido}</td>
        <td>${pedido.cliente}</td>
        <td>${pedido.produto}</td>
        <td>${pedido.data}</td>
        <td>${pedido.endereco}</td>
        <td>${pedido.valor}</td>
        <td>${pedido.status}</td>
       <td>


        <!-- if para que apenas o administrador consiga editar o pedido (Retirei para testar as funcionalidades sem ter que fazer login)-->


        <form action="/delete-pedido" method="post">
          <input type="hidden" id="codPedido" name="codPedido" value="${pedido.codPedido}">
         <div class="d-flex justify-content-between mb-8">
           <div class="col-6">
             <button  type="submit" class="btn btn-primary w-100">Excluir</button>
           </div>
         </div>

          <div class="d-flex justify-content-between mb-8 ">
            <div class="col-6">
              <a class="btn btn-secondary w-100" href="pedidos.jsp?codPedido=${pedido.codPedido}&cliente=${pedido.cliente}&produto=${pedido.produto}&data=${pedido.data}&endereco=${pedido.endereco}&valor=${pedido.valor}&status=${pedido.status}">Alterar</a>
            </div>
          </div>

        </form>


       </td>
      </tr>

    </c:forEach>

    </tbody>

  </table>
  </div>

</body>
</html>