package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.model.Login;
import br.com.ecommercepapelaria.servlet.model.MetodoPagamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodoPagamentoDao {

    public void createMetodoPagamento(MetodoPagamento metodoPagamento) {
        String SQL = "INSERT INTO METODOPAGAMENTO (idMetodoPagamento, titular,numCartao,validade,codSeg) VALUES (?,?,?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("Sucesso ao se conectar no banco de dados");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, metodoPagamento.getIdMetodoPagamento());
            preparedStatement.setString(2, metodoPagamento.getTitular());
            preparedStatement.setString(3, metodoPagamento.getNumCartao());
            preparedStatement.setString(4, metodoPagamento.getValidade());
            preparedStatement.setString(5, metodoPagamento.getCodSeg());



            System.out.println("Sucesso ao inserir o metodo de pagamentos no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir o metodo de pagamentos no banco de dados" + e.getMessage());

        }
    }



        public List<MetodoPagamento> findAllMetodoPagamentos(){

            String SQL = "SELECT * FROM METODOPAGAMENTO";

            try{

                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

                System.out.println("Sucesso ao se conectar com o DB!");

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                ResultSet resultSet = preparedStatement.executeQuery();

                List<MetodoPagamento> allMetodoPagamento = new ArrayList<>();

                while (resultSet.next()) {

                    String idMetodoPagamento = resultSet.getString("IDMETODOPAGAMENTO");
                    String titular = resultSet.getString("TITULAR");
                    String numCartao = resultSet.getString("NUMCARTAO");
                    String validade = resultSet.getString("VALIDADE");
                    String codSeg = resultSet.getString("CODSEGURANCA");


                    MetodoPagamento metodoPagamento = new MetodoPagamento(idMetodoPagamento,titular,numCartao,validade,codSeg);

                    allMetodoPagamento.add(metodoPagamento);
                }

                System.out.println("Sucesso ao consultar os dados na tabela METODO PAGAMENTO");

                connection.close();

                return allMetodoPagamento;

            } catch (Exception e) {

                System.out.println("Falha ao consultar os dados na tabela METODO PAGAMENTO: " + e.getMessage());

            }


            return Collections.emptyList();

        }



}
