package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Carrinho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarrinhoDao {
    public void createCarrinho(Carrinho carrinho){
        String SQL = "INSERT INTO CARRINHO (ID_CARRINHO,ID_CLIENTE,ID_PRODUTO) VALUES (?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, carrinho.getIdCliente());
            preparedStatement.setString(2,carrinho.getIdProduto());
            preparedStatement.execute();

            System.out.println("Sucesso ao inserir o carrinho no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir carrinhi no banco de dados" + e.getMessage());

        }
    }
}
