package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.FaleConosco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FaleConoscoDao {

    public void criarCriarFaleConosco(FaleConosco FaleConosco){

        String SQL = "INSERT INTO FALECONOSCO (NOME, EMAIL, DUVIDA) VALUES (?,?,?)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, FaleConosco.getNome());
            preparedStatement.setString(2, FaleConosco.getEmail());
            preparedStatement.setString(3, FaleConosco.getDuvida());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o Fale Conosco no banco de dados");

            connection.close();

        } catch (Exception e){

            System.out.println("Erro ao inserir Fale Conosco no banco de dados" + e.getMessage());
        }

    }

    public List<FaleConosco> findAllDuvidas(){

        String SQL = "SELECT * FROM PEDIDO";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<FaleConosco> allDuvidas = new ArrayList<>();

            while (resultSet.next()) {

                String nome = resultSet.getString("NOME");
                String email = resultSet.getString("EMAIL");
                String duvida = resultSet.getString("DUVIDA");

                FaleConosco faleConosco = new FaleConosco(nome, email, duvida);

                allDuvidas.add(faleConosco);
            }

            System.out.println("Sucesso ao consultar os dados na tabela FALE CONOSCO");

            connection.close();

            return allDuvidas;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os carros na tabela FALE CONOSCO: " + e.getMessage());

        }


        return Collections.emptyList();

    }

}
