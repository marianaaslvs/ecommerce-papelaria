package br.com.ecommercepapelaria.servlet.dao;

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
        String SQL = "INSERT INTO PRODUTO (NOMEPRODUTO, DESCRICAO,PRECO) VALUES (?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setString(2,produto.getDescricao());
            preparedStatement.setString(3, produto.getPreco());
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

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> allProdutos = new ArrayList<>();

            while (resultSet.next()) {

                String nomeProduto = resultSet.getString("NOMEPRODUTO");
                String descricao = resultSet.getString("DESCRICAO");
                String preco = resultSet.getString("PRECO");

                Produto produto = new Produto(nomeProduto, descricao, preco);

                allProdutos.add(produto);
            }

            System.out.println("Sucesso ao consultar os dados na tabela PEDIDO");

            connection.close();

            return allProdutos;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os carros na tabela PRODUTO: " + e.getMessage());

        }


        return Collections.emptyList();

    }
}
