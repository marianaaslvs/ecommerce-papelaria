package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Login;
import br.com.ecommercepapelaria.servlet.model.MetodoPagamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MetodoPagamentoDao {

    public void createMetodoPagamento(MetodoPagamento metodoPagamento){
        String SQL = "INSERT INTO METODOPAGAMENTO (idMetodoPagamento) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, metodoPagamento.getIdMetodoPagamento());

            System.out.println("Sucesso ao inserir o metodo de pagamentos no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir o metodo de pagamentos no banco de dados" + e.getMessage());

        }
    }}