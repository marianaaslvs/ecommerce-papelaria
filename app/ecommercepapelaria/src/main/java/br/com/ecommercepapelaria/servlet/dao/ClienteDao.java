package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClienteDao {

    public void criarCliente(Cliente cliente){

        String SQL = "INSERT INTO CLIENTES (NOME, CPF, TELEFONE, EMAIL, RUA, NUMERO, ESTADO, CIDADE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

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

    public List<Cliente> findAllClientes(){

        String SQL = "SELECT * FROM CLIENTES";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cliente> allClientes = new ArrayList<>();

            while (resultSet.next()) {

                String nome = resultSet.getString("NOME");
                String email = resultSet.getString("EMAIL");
                String rua = resultSet.getString("RUA");
                String cidade = resultSet.getString("CIDADE");
                String estado = resultSet.getString("ESTADO");
                String cpf = resultSet.getString("CPF");
                String numero = resultSet.getString("NUMERO");
                String telefone = resultSet.getString("TELEFONE");

                Cliente cliente = new Cliente(nome, email, rua, cidade, estado, cpf, numero, telefone);

                allClientes.add(cliente);
            }

            System.out.println("Sucesso ao consultar os dados na tabela CLIENTE");

            connection.close();

            return allClientes;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os carros na tabela CAR: " + e.getMessage());

        }


        return Collections.emptyList();

    }
}
