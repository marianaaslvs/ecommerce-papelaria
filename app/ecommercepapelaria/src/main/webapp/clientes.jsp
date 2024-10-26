<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cliente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <h2>Cadastro de Clientes</h2>

    <form action="/criar-cliente" method="post">

            <input type="hidden" id="idCliente" name="idCliente" value="${param.idCliente}">

           <div class="mb-3">
            <label>Nome</label>
            <input type="text" name="nome" id="nome" class="form-control" value="${param.nome}">
           </div>

        <div class="mb-3">
            <label for="cpf">CPF</label>
            <input type="text" name="cpf" id="cpf" class="form-control" maxlength="14" placeholder="000.000.000-00" value="${param.cpf}" oninput="formatCPF(this)" required>
        </div>
        <script>
            function formatCPF(cpfField) {
                let cpf = cpfField.value.replace(/\D/g, '');
                if (cpf.length > 11) {
                    cpf = cpf.slice(0, 11);
                }
                if (cpf.length > 9) {
                    cpf = cpf.replace(/(\d{3})(\d{3})(\d{3})(\d{1,2})/, '$1.$2.$3-$4');
                } else if (cpf.length > 6) {
                    cpf = cpf.replace(/(\d{3})(\d{3})(\d{1,3})/, '$1.$2.$3');
                } else if (cpf.length > 3) {
                    cpf = cpf.replace(/(\d{3})(\d{1,3})/, '$1.$2');
                } else if (cpf.length > 0) {
                    cpf = cpf.replace(/(\d{1,3})/, '$1');
                }
                cpfField.value = cpf;
            }
        </script>

        <div class="mb-3">
            <label for="telefone">Telefone</label>
            <input type="text" name="telefone" id="telefone" class="form-control" maxlength="15" placeholder="(00) 00000-0000" value="${param.telefone}" oninput="formatTelefone(this)" required>
        </div>

        <script>
            function formatTelefone(telefoneField) {
                let telefone = telefoneField.value.replace(/\D/g, '');

                if (telefone.length > 11) {
                    telefone = telefone.slice(0, 11);
                }

                if (telefone.length > 10) {
                    telefone = telefone.replace(/(\d{2})(\d{5})(\d{4})/, '($1) $2-$3');
                } else if (telefone.length > 5) {
                    telefone = telefone.replace(/(\d{2})(\d{5})/, '($1) $2');
                } else if (telefone.length > 0) {
                    telefone = telefone.replace(/(\d{2})/, '($1)');
                }

                telefoneField.value = telefone;
            }
        </script>

           <div class="mb-3">
            <label>Email</label>
            <input type="text" name="email" id="email" class="form-control" placeholder="seuemail@exemplo.com" value="${param.email}">
           </div>

           <div class="mb-3">
            <label>Rua</label>
            <input type="text" name="rua" id="rua" class="form-control" value="${param.rua}">
           </div>

           <div class="mb-3">
            <label>Numero:</label>
            <input type="text" name="numero" id="numero" class="form-control" value="${param.numero}">
           </div>

           <div class="mb-3">
            <label>Cidade</label>
            <input type="text" name="cidade" id="cidade" class="form-control" value="${param.cidade}">
           </div>

           <div class="mb-3">
            <label for="estado">Estado</label>
            <select name="estado" id="estado" class="form-control">
                <option value="">Selecione um estado</option>
                <option value="AC">AC</option>
                <option value="AL">AL</option>
                <option value="AP">AP</option>
                <option value="AM">AM</option>
                <option value="BA">BA</option>
                <option value="CE">CE</option>
                <option value="DF">DF</option>
                <option value="ES">ES</option>
                <option value="GO">GO</option>
                <option value="MA">MA</option>
                <option value="MT">MT</option>
                <option value="MS">MS</option>
                <option value="MG">MG</option>
                <option value="PA">PA</option>
                <option value="PB">PB</option>
                <option value="PR">PR</option>
                <option value="PE">PE</option>
                <option value="PI">PI</option>
                <option value="RJ">RJ</option>
                <option value="RN">RN</option>
                <option value="RS">RS</option>
                <option value="RO">RO</option>
                <option value="RR">RR</option>
                <option value="SC">SC</option>
                <option value="SP">SP</option>
                <option value="SE">SE</option>
                <option value="TO">TO</option>
            </select>
        </div>

        <button class="btn btn-primary" type="submit">Salvar</button>

    </form>
</div>
</body>
</html>