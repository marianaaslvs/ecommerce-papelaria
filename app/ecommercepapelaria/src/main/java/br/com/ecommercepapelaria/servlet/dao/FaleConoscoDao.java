package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.FaleConosco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FaleConoscoDao {

    public void criarCriarFaleConosco(FaleConosco FaleConosco){

        String SQL = "INSERT INTO FALECONOSCO (IDFALECONOSCO, NOME, EMAIL, DUVIDA)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1, FaleConosco.getIdFaleConosco());
            preparedStatement.setString(2, FaleConosco.getNome());
            preparedStatement.setString(3, FaleConosco.getEmail());
            preparedStatement.setString(4, FaleConosco.getDuvida());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o Fale Conosco no banco de dados");

            connection.close();

        } catch (Exception e){

            System.out.println("Erro ao inserir Fale Conosco no banco de dados" + e.getMessage());
        }

    }

}
