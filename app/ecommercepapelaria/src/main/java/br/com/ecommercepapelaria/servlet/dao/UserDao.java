package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
import br.com.ecommercepapelaria.servlet.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

        public boolean verifyCredentials(User user) {
            String SQL = "SELECT * FROM USER WHERE CPF = ?";

            try {

                Connection connection = ConnectionPoolConfig.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                preparedStatement.setString(1, user.getCpf());
                ResultSet resultSet = preparedStatement.executeQuery();

                System.out.println("success in select CPF");

                while (resultSet.next()) {

                    String senha = resultSet.getString("senha");

                    if (senha.equals(user.getSenha())) {

                        return true;

                    }

                }

                connection.close();

                return false;

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());

                return false;

            }

        }
}
