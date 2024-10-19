package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
        }

        public List<Login> findAllLogin(){

            String SQL = "SELECT * FROM LOGIN";

            try{

                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

                System.out.println("Sucesso ao se conectar com o DB!");

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                ResultSet resultSet = preparedStatement.executeQuery();

                List<Login> allLogin = new ArrayList<>();

                while (resultSet.next()) {

                    String cpf = resultSet.getString("CPF");
                    String senha = resultSet.getString("SENHA");


                    Login login= new Login(cpf,senha);

                    allLogin.add(login);
                }

                System.out.println("Sucesso ao consultar os dados na tabela LOGIN");

                connection.close();

                return allLogin;

            } catch (Exception e) {

                System.out.println("Falha ao consultar os dados na tabela LOGIN: " + e.getMessage());

            }


            return Collections.emptyList();

        }



    }
