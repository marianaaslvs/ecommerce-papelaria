package br.com.ecommercepapelaria.servlet.dao;

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
        String SQL = "INSERT INTO CARRINHO (ID_CLIENTE,ID_PRODUTO) VALUES (?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, carrinho.getIdCliente());
            preparedStatement.setString(2,carrinho.getIdProduto());
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

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carrinho> allCarrinho = new ArrayList<>();

            while (resultSet.next()) {

                String idCliente = resultSet.getString("IDCLIENTE");
                String idProduto = resultSet.getString("IDPRODUTO");



                Carrinho carrinho = new Carrinho (idCliente, idProduto);

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

}
