<html lang="en">

<head>
    <title>Imaginarte</title>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
    <link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/Index.css" rel="stylesheet" type="text/css" >
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Template para o carousel Bootstrap</title>

    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="carousel.css" rel="Astylesheet">

    <style>

        body, html {
            margin: 0;
            padding: 0;
            height: 100%;
        }


        main {
            padding-top: 70px;
        }

    </style>

</head>

<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="index.jsp">Imaginarte</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-produtos">Produtos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-pedidos">Pedidos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/find-all-duvidas">Contato</a>
                </li>
            </ul>
        </div>
    </nav>
</header>

<!-- <div class="img">
    <img src="https://images.pexels.com/photos/2280913/pexels-photo-2280913.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" class="img-fluid" alt="Imagem">
</div> -->

<main role="main">

    <div class="container marketing">

        <div class="row">
            <div class="col-lg-4">
                <img class="rounded-circle" src="https://images.pexels.com/photos/15422295/pexels-photo-15422295/free-photo-of-caderno-notebook-papel-trabalho.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="Generic placeholder image" width="140" height="140">
                <h2>Caderno</h2>
                <p>Na Imaginarte você encontra os mais divertidos e descolados cadernos!</p>
                <p><a class="btn btn-secondary" href="/find-all-produtos" role="button">Clique e confira!</a></p>
            </div>
            <div class="col-lg-4">
                <img class="rounded-circle" src="https://images.pexels.com/photos/627901/pexels-photo-627901.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="Generic placeholder image" width="140" height="140">
                <h2>Lapis</h2>
                <p>Na Imaginarte você tem os melhores lápis de cor para deixar seus desenhos ainda mais bonitos!</p>
                <p><a class="btn btn-secondary" href="/find-all-produtos" role="button">Clique e confira!</a></p>
            </div>
            <div class="col-lg-4">
                <img class="rounded-circle" src="https://images.pexels.com/photos/1152665/pexels-photo-1152665.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="Generic placeholder image" width="140" height="140">
                <h2>Caneta</h2>
                <p>Na Imaginarte escrever nunca foi mais divertido com nossas canetas! </p>
                <p><a class="btn btn-secondary" href="/find-all-produtos" role="button">Clique e confira!</a></p>
            </div>
        </div>


        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">Planner personalizado</h2>
                <p class="lead">Escolha a capa do seu planner 2025!</p>
            </div>
            <div class="col-md-5">
                <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="500x500" src="https://images.pexels.com/photos/1558691/pexels-photo-1558691.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" data-holder-rendered="true" style="width: 300px; height: 300px;">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7 order-md-2">
                <h2 class="featurette-heading">Monte seu kit escolar 2025!</h2>
                <p class="lead">Escolha seus cadernos, mochila, lapis, canetas, estojo e muito mais....</p>
            </div>
            <div class="col-md-5 order-md-1">
                <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="500x500" src="https://images.pexels.com/photos/159497/school-notebook-binders-notepad-159497.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" data-holder-rendered="true" style="width: 300px; height: 300px;">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">Mochila Personalizada</h2>
                <p class="lead">Já pensou em ter uma mochila da sua serie favorita ou daquele contor que você gosta? Na Imaginarte você pode!</p>
            </div>
            <div class="col-md-5">
                <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="500x500" src="https://images.pexels.com/photos/2905238/pexels-photo-2905238.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" data-holder-rendered="true" style="width: 300px; height: 300px;">
            </div>
        </div>

        <hr class="featurette-divider">

    </div>

    <footer class="container">
        <p class="float-right"><a href="#">Voltar ao topo</a></p>
        <p>© Companhia S.A., 2017-2018 · <a href="#">Privacidade</a> · <a href="#">Termos</a></p>
    </footer>
</main>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="../../assets/js/vendor/popper.min.js"></script>
<script src="../../dist/js/bootstrap.min.js"></script>

<svg xmlns="http://www.w3.org/2000/svg" width="500" height="500" viewBox="0 0 500 500" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="25" style="font-weight:bold;font-size:25pt;font-family:Arial, Helvetica, Open Sans, sans-serif">500x500</text></svg></body></html>

