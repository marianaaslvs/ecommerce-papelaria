package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
import br.com.ecommercepapelaria.servlet.model.Carrinho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDao {
    public void createCarrinho(Carrinho carrinho){
        String SQL = "INSERT INTO CARRINHO (IDCLIENTE,IDPRODUTO,QUANTIDADE) VALUES (?,?,?)";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,carrinho.getIdCliente());
            preparedStatement.setString(2,carrinho.getIdProduto());
            preparedStatement.setInt(3,carrinho.getQuantidade());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o carrinho no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir a tabela de carrinho no banco de dados" + e.getMessage());

        }
    }
    public List<Carrinho> findAllCarrinho(){

        String SQL = "SELECT * FROM CARRINHO";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carrinho> allCarrinho = new ArrayList<>();


            //System.out.println("Sucesso ao se conectar com o DB!");


            while (resultSet.next()) {

                String idCarrinho = resultSet.getString("IDCARRINHO");
                String idCliente = resultSet.getString("IDCLIENTE");
                String idProduto = resultSet.getString("IDPRODUTO");
                int quantidade = resultSet.getInt("QUANTIDADE");



                Carrinho carrinho = new Carrinho (idCarrinho,idCliente, idProduto,quantidade);

                allCarrinho.add(carrinho);
            }

            System.out.println("Sucesso ao consultar os dados na tabela Carrinho");

            connection.close();

            return allCarrinho;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os dados na tabela CARRINHO: " + e.getMessage());

        }


        return Collections.emptyList();

    }
    public void deleteCarrinho (String idCarrinho){
        String SQL = "DELETE FROM CARRINHO WHERE IDCARRINHO = ?";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, idCarrinho);
            preparedStatement.execute();

            System.out.println("Sucesso ao deletar o Carrinho: " + idCarrinho);

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o BD!");

        }




    }

    public void updateCarrinho(Carrinho carrinho){


        String SQL = "UPDATE CARRINHO SET IDCARRINHO = ?, IDPRODUTO = ? ,IDCLIENTE = ? ,QUANTIDADE = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, carrinho.getIdCarrinho());
            preparedStatement.setString(2, carrinho.getIdProduto());
            preparedStatement.setString(3, carrinho.getIdCliente());
            preparedStatement.setInt(4, carrinho.getQuantidade());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o Carrinho");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");
            System.out.println("Error: " + e.getMessage());

        }

    }

}



