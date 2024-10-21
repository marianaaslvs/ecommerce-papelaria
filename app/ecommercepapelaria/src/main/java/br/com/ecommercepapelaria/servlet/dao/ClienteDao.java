package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.Pedido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClienteDao {

    public void criarCliente(Cliente cliente){

        String SQL = "INSERT INTO CLIENTE (NOME, CPF, TELEFONE, EMAIL, RUA, NUMERO, ESTADO, CIDADE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

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

        String SQL = "SELECT * FROM CLIENTE";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cliente> allClientes = new ArrayList<>();

            while (resultSet.next()) {

                String idCliente = resultSet.getString("ID");
                String nome = resultSet.getString("NOME");
                String cpf = resultSet.getString("CPF");
                String telefone = resultSet.getString("TELEFONE");
                String email = resultSet.getString("EMAIL");
                String rua = resultSet.getString("RUA");
                String numero = resultSet.getString("NUMERO");
                String cidade = resultSet.getString("CIDADE");
                String estado = resultSet.getString("ESTADO");

                Cliente cliente = new Cliente(idCliente, nome, cpf, telefone, email, rua, numero, cidade, estado);

                allClientes.add(cliente);
            }

            System.out.println("Sucesso ao consultar os dados na tabela CLIENTE");

            connection.close();

            return allClientes;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os carros na tabela CLIENTE: " + e.getMessage());

        }


        return Collections.emptyList();

    }

    public void deleteClienteById(String idCliente) {

        String SQL = "DELETE CLIENTE WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, idCliente);
            preparedStatement.execute();

            System.out.println("Sucesso ao deletar o pedido: " + idCliente);

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");

        }

    }

    public void updateCliente(Cliente cliente) {

        String SQL = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?, SET CPF = ? WHERE ID = ?, SET TELEFONE = ? WHERE ID = ?, SET EMAIL = ? WHERE ID = ?, SET RUA = ? WHERE ID = ?, SET NUMERO = ? WHERE ID = ?, SET ESTADO = ? WHERE ID = ?, SET CIDADE = ? WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getIdCliente());
            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getTelefone());
            preparedStatement.setString(5, cliente.getEmail());
            preparedStatement.setString(6, cliente.getRua());
            preparedStatement.setString(7, cliente.getNumero());
            preparedStatement.setString(8, cliente.getEstado());
            preparedStatement.setString(9, cliente.getCidade());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o cliente");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");
            System.out.println("Error: " + e.getMessage());

        }

    }
}
