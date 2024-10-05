package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProdutoDao {

    public void createProduto(Produto produto){
        String SQL = "INSERT INTO PRODUTO (IDPRODUTO, DESCRICAO,PRECO) VALUES (?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getIdProduto());
            preparedStatement.setString(2,produto.getDescricao());
            preparedStatement.setString(3, produto.getPreco());

            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o produto no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir produto no banco de dados " + e.getMessage());

        }
}}
