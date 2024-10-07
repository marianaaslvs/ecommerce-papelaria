package br.com.ecommercepapelaria.servlet.dao;

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

        String SQL = "INSERT INTO PEDIDO (CLIENTE, PRODUTO, METODOPAGAMENTO, STATUS) VALUES (?, ?, ?, ?)";

        try{

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, pedido.getCliente());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setString(3, pedido.getMetodoPagamento());
            preparedStatement.setString(4, pedido.getStatus());
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

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar com o DB!");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Pedido> allPedidos = new ArrayList<>();

            while (resultSet.next()) {

                String cliente = resultSet.getString("CLIENTE");
                String produto = resultSet.getString("PRODUTO");
                String metodoDePagamento = resultSet.getString("METODOPAGAMENTO");
                String status = resultSet.getString("STATUS");

                Pedido pedido = new Pedido(status, cliente, metodoDePagamento, produto);

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
}
