package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClienteDao {

    public void criarCliente(Cliente cliente){

        String SQL = "INSERT INTO CLIENTE (NOME, CPF, TELEFONE, EMAIL, RUA, NUMERO, CIDADE, ESTADO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getRua());
            preparedStatement.setString(6, cliente.getNumero());
            preparedStatement.setString(7, cliente.getCidade());
            preparedStatement.setString(8, cliente.getEstado());
            preparedStatement.setString(9, cliente.getSenha());
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

            Connection connection = ConnectionPoolConfig.getConnection();

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
                String senha = resultSet.getString("SENHA");

                Cliente cliente = new Cliente(idCliente, nome, cpf, telefone, email, rua, numero, cidade, estado, senha);

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

            Connection connection = ConnectionPoolConfig.getConnection();

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

        String SQL = "UPDATE CLIENTE SET NOME = ?, CPF = ?, TELEFONE = ?, EMAIL = ?, RUA = ?, NUMERO = ?, CIDADE = ?, ESTADO = ?, SENHA = ? WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getRua());
            preparedStatement.setString(6, cliente.getNumero());
            preparedStatement.setString(7, cliente.getCidade());
            preparedStatement.setString(8, cliente.getEstado());
            preparedStatement.setString(9, cliente.getSenha());
            preparedStatement.setString(10, cliente.getIdCliente());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o cliente");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");
            System.out.println("Error: " + e.getMessage());

        }

    }
}
