package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
import br.com.ecommercepapelaria.servlet.model.Pedido;
import br.com.ecommercepapelaria.servlet.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDao {

    public void createProduto(Produto produto){
        String SQL = "INSERT INTO PRODUTO (NOMEPRODUTO, DESCRICAO, PRECO, IMAGE) VALUES (?,?,?,?)";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setString(2,produto.getDescricao());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setString(4,produto.getImage());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o produto no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir produto no banco de dados " + e.getMessage());

        }
    }

    public List<Produto> findAllProdutos(){

        String SQL = "SELECT * FROM PRODUTO";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> allProdutos = new ArrayList<>();

            while (resultSet.next()) {

                String idProduto = resultSet.getString("ID");
                String nomeProduto = resultSet.getString("NOMEPRODUTO");
                String descricao = resultSet.getString("DESCRICAO");
                double preco = resultSet.getDouble("PRECO");
                String image = resultSet.getString("image");

                Produto produto = new Produto(idProduto, nomeProduto, descricao, preco, image);

                allProdutos.add(produto);
            }

            System.out.println("Sucesso ao consultar os dados na tabela PEDIDO");

            connection.close();

            return allProdutos;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os produtos na tabela PRODUTO: " + e.getMessage());

        }


        return Collections.emptyList();

    }

    public void deleteProduto(String idProduto) {

        String SQL = "DELETE PRODUTO WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, idProduto);
            preparedStatement.execute();

            System.out.println("Sucesso ao deletar o Produto: " + idProduto);

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");

        }
    }

    public void updateProduto(Produto produto){
        String SQL = "UPDATE PRODUTO SET NOMEPRODUTO = ?, DESCRICAO = ?, PRECO = ?, IMAGE = ?  WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setString(4, produto.getImage());
            preparedStatement.setString(5, produto.getIdProduto());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o Produto");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar ao BD!");
            System.out.println("Error: " + e.getMessage());

        }

    }
}
