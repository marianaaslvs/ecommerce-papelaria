package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDao {

    public void criarCliente(Cliente cliente){

        String SQL = "INSERT INTO CLIENTE (NOME, CPF, TELEFONE, EMAIL, RUA, NUMERO, ESTADO, CIDADE)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getRua());
            preparedStatement.setString(6, cliente.getNumero());
            preparedStatement.setString(7, cliente.getEstado());
            preparedStatement.setString(8, cliente.getCidade());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o cliente no banco de dados");

            connection.close();

        } catch (Exception e){

            System.out.println("Erro ao inserir cliente no banco de dados" + e.getMessage());
        }

    }
}
