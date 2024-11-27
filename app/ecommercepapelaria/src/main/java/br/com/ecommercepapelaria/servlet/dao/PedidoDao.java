package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.Pedido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PedidoDao {

    public void criarPedido(Pedido pedido){

        String SQL = "INSERT INTO PEDIDO (CLIENTE, PRODUTO, ENDERECO, VALOR, STATUS) VALUES (?, ?, ?, ?, ?)";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setString(3, pedido.getEndereco());
            preparedStatement.setDouble(4, pedido.getValor());
            preparedStatement.setString(5, pedido.getStatus());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o pedido no banco de dados");

            connection.close();

        } catch (Exception e){

            System.out.println("Erro ao inserir pedido no banco de dados" + e.getMessage());
        }
    }

    public List<Pedido> findAllPedidos(){

        String SQL = "SELECT * FROM PEDIDO";

        try{

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Pedido> allPedidos = new ArrayList<>();

            while (resultSet.next()) {

                String codPedido = resultSet.getString("ID");
                String cliente = resultSet.getString("CLIENTE");
                String produto = resultSet.getString("PRODUTO");
                String data = resultSet.getString("DATA");
                String endereco = resultSet.getString("ENDERECO");
                double valor = resultSet.getDouble("VALOR");
                String status = resultSet.getString("STATUS");

                Pedido pedido = new Pedido(codPedido, cliente, produto, data, endereco, valor, status);

                allPedidos.add(pedido);
            }

            System.out.println("Sucesso ao consultar os dados na tabela PEDIDO");

            connection.close();

            return allPedidos;

        } catch (Exception e) {

            System.out.println("Falha ao consultar os carros na tabela PEDIDO: " + e.getMessage());

        }


        return Collections.emptyList();

    }

    public void deletePedidoById(String codPedido) {

        String SQL = "DELETE PEDIDO WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, codPedido);
            preparedStatement.execute();

            System.out.println("Sucesso ao deletar o pedido: " + codPedido);

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");

        }

    }

    public void updatePedido(Pedido pedido) {

        String SQL = "UPDATE PEDIDO SET CLIENTE = ? ,PRODUTO = ?, ENDERECO = ?, VALOR = ?,STATUS = ? WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setString(3, pedido.getEndereco());
            preparedStatement.setDouble(4, pedido.getValor());
            preparedStatement.setString(5, pedido.getStatus());
            preparedStatement.setString(6, pedido.getCodPedido());

            preparedStatement.execute();

            System.out.println("Sucesso ao atualizar o pedido");

            connection.close();

        } catch (Exception e) {

            System.out.println("Falha ao se conectar com o DB!");
            System.out.println("Error: " + e.getMessage());

        }
    }
}
