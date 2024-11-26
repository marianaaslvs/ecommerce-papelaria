<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <head>
      <title>Imaginarte - Produtos</title>
      <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      <%@ include file="header.jsp" %>
      <link href="css/AllProdutos.css" rel="stylesheet" type="text/css" >
      <link href="css/Footer.css" rel="stylesheet" type="text/css" >
      <link rel="icon" href="/imagens/Logo.png">
    </head>


    <body>

        <br>
        <div class="container">

            <c:if test="${sessionScope.loggedUser != null}">
                <span>${sessionScope.loggedUser}</span>
                <a href="/logout">Logout</a>
            </c:if>


              <h1>Produtos Imaginarte</h1>
              <br>

            <div class="product-container">
                <c:forEach var="produto" items="${produtos}" varStatus="status">
                    <div class="card">
                        <img src="${produto.image}" class="card-img-top" alt="Imagem do produto">
                        <div class="card-body">
                            <h5 class="card-title">${produto.nomeProduto}</h5>
                            <p class="card-text">R$ ${produto.preco}</p>
                            <a href="/metodoPagamentos.jsp?idProduto=${produto.idProduto}&nomeProduto=${produto.nomeProduto}&descricao=${produto.descricao}&preco=${produto.preco}&image=${produto.image}" class="btn btn-primary">Comprar</a>

                            <c:if test="${sessionScope.loggedUser != null && sessionScope.loggedUser == '12345'}">
                                    <form action="/delete-produto" method="post" class="mt-3">
                                        <input type="hidden" id="idProduto" name="idProduto" value="${produto.idProduto}">
                                        <button type="submit" class="btn btn-danger btn-sm">Deletar</button>

                                        <span>   </span>
                                        <a href="produtos.jsp?idProduto=${produto.idProduto}&nomeProduto=${produto.nomeProduto}&descricao=${produto.descricao}&preco=${produto.preco}&image=${produto.image}" class="btn btn-warning btn-sm">Atualizar</a>
                                    </form>
                            </c:if>
                        </div>
                    </div>
                </c:forEach>
            </div>

        </div>


        <footer>
            <div class="footer">
                <div class="cont">
                    <div class="paginas">
                        <ul class="navbar-nav ms-3">
                            <li class="nav-item me-3"> <a class="nav-link" href="index.jsp">Home</a> </li>
                            <li class="nav-item me-3"> <a class="nav-link" href="find-all-produtos">Produtos</a> </li>
                            <li class="nav-item me-3"> <a class="nav-link" href="fale-conosco">Fale Conosco</a> </li>
                        </ul>
                    </div>

                    <div class="copyright">
                    Copyright &copy; 2024 Imaginarte
                    </div>

                    <div class="contatos">
                    Contato: sac.imaginarte@gmail.com
                    </div>
                </div>
            </div>
        </footer>

    </body>
</html>