package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Login;
import br.com.ecommercepapelaria.servlet.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class LoginDao {

    public void createLogin(Login login){
        String SQL = "INSERT INTO LOGIN (CPF,SENHA) VALUES (?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, login.getCpf());
            preparedStatement.setString(2,login.getSenha());
                       preparedStatement.execute();

            System.out.println("Sucesso ao inserir o LOGIN no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir LOGIN no banco de dados" + e.getMessage());

        }
    }}
