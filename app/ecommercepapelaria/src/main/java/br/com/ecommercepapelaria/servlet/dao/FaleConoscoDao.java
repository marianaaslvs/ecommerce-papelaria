package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
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

        String SQL = "INSERT INTO FALECONOSCO (NOME, EMAIL, DUVIDA, STATUS) VALUES (?,?,?,?)";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, FaleConosco.getNome());
            preparedStatement.setString(2, FaleConosco.getEmail());
            preparedStatement.setString(3, FaleConosco.getDuvida());
            preparedStatement.setString(4, FaleConosco.getStatus());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o Fale Conosco no banco de dados");

            connection.close();

        } catch (Exception e){

            System.out.println("Erro ao inserir Fale Conosco no banco de dados " + e.getMessage());
        }

    }

    public List<FaleConosco> findAllDuvidas(){

        String SQL = "SELECT * FROM FALECONOSCO";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<FaleConosco> allDuvidas = new ArrayList<>();

            while (resultSet.next()) {

                String idDuvida = resultSet.getString("ID");
                String nome = resultSet.getString("NOME");
                String email = resultSet.getString("EMAIL");
                String duvida = resultSet.getString("DUVIDA");
                String status = resultSet.getString("STATUS");

                FaleConosco faleConosco = new FaleConosco(idDuvida, nome, email, duvida, status);

                allDuvidas.add(faleConosco);
            }

            System.out.println("Sucesso ao consultar os dados na tabela FALE CONOSCO");

            connection.close();

            return allDuvidas;

        } catch (Exception e) {

            System.out.println("Falha ao consultar as duvidas na tabela FALE CONOSCO: " + e.getMessage());

        }


        return Collections.emptyList();

    }

    public void deleteDuvida(String idDuvida) {

        String SQL = "DELETE FALECONOSCO WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, idDuvida);
            preparedStatement.execute();

            System.out.println("Sucesso ao deletar o Fale Conosco: " + idDuvida);

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o BD!");

        }


    }

    public void updateFaleConosco (FaleConosco faleConosco) {
        String SQL = "UPDATE FALECONOSCO SET STATUS = ?  WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, faleConosco.getStatus());
            preparedStatement.setString(2, faleConosco.getIdDuvida());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o Status do Fale Conosco");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar ao BD!");
            System.out.println("Error: " + e.getMessage());

        }



    }

}
