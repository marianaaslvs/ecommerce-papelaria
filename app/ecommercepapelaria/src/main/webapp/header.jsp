<!DOCTYPE html>
<html lang="en">
<head>


<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">



    <!-- Configuração básica do documento -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Header Imaginarte</title>

    <!-- Conexão com o arquivo CSS personalizado -->
    <link rel="stylesheet" href="css/Header.css">

    <!-- Conexão com a biblioteca Bootstrap (CSS) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


</head>


<body>
    <!-- Início do cabeçalho -->
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
            <div class="container-fluid">
                <!-- Logo e nome da marca -->
                <a class="navbar-brand d-flex align-items-center" href="index.jsp">
                    <!-- Logo -->
                    <img src="/imagens/Imaginarte_Icone.png" alt="Imaginarte Logo" width="50" height="50" class="d-inline-block align-text-top me-2">
                    <!-- Nome da marca -->
                    <span class="brand-name">Imaginarte</span>
                </a>

                <!-- Botão de colapso (visível em telas menores) -->
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <!-- Menu de navegação -->
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <!-- Links de navegação principais (alinhados à esquerda) -->
                    <ul class="navbar-nav ms-3">
                        <li class="nav-item me-3">
                            <a class="nav-link active" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item me-3">
                            <a class="nav-link" href="/find-all-produtos">Produtos</a>
                        </li>
                        <li class="nav-item me-3">
                            <a class="nav-link" href="/find-all-pedidos">Pedidos</a>
                        </li>
                        <li class="nav-item me-3">
                            <a class="nav-link" href="/find-all-duvidas">Contato</a>
                        </li>
                    </ul>

                    <!-- Links de navegação adicionais (alinhados à direita) -->
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item me-3">
                            <a class="nav-link" href="/criar-metodoPagamento">Carrinho</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/login">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <!-- Conexão com o Bootstrap (JavaScript) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
