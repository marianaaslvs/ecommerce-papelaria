package br.com.ecommercepapelaria.servlet.dao;

import br.com.ecommercepapelaria.servlet.config.ConnectionPoolConfig;
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
        String SQL = "INSERT INTO METODOPAGAMENTO(TITULAR,NUMCARTAO,VALIDADE,CODSEG) VALUES (?,?,?,?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, metodoPagamento.getTitular());
            preparedStatement.setString(2, metodoPagamento.getNumCartao());
            preparedStatement.setString(3, metodoPagamento.getValidade());
            preparedStatement.setString(4, metodoPagamento.getCodSeg());

preparedStatement.execute();

            System.out.println("Sucesso ao inserir o metodo de pagamentos no banco de dados");

            connection.close();

        } catch (Exception e) {

            System.out.println("Erro ao inserir o metodo de pagamentos no banco de dados" + e.getMessage());

        }
    }



        public List<MetodoPagamento> findAllMetodoPagamento(){

            String SQL = "SELECT * FROM METODOPAGAMENTO";

            try{

                Connection connection = ConnectionPoolConfig.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                ResultSet resultSet = preparedStatement.executeQuery();

                List<MetodoPagamento> allMetodoPagamento = new ArrayList<>();

                while (resultSet.next()) {

                    String idMetodoPagamento = resultSet.getString("IDMETODOPAGAMENTO");
                    String titular = resultSet.getString("TITULAR");
                    String numCartao = resultSet.getString("NUMCARTAO");
                    String validade = resultSet.getString("VALIDADE");
                    String codSeg = resultSet.getString("CODSEG");


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

        public void deleteMetodoPagamento(String idMetodoPagamento){

            String SQL = "DELETE METODOPAGAMENTO WHERE ID = ?";

            try {

                Connection connection = ConnectionPoolConfig.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setString(1, idMetodoPagamento);
                preparedStatement.execute();

                System.out.println("Sucesso ao deletar o Metodo de Pagamento: " + idMetodoPagamento);

                connection.close();

            } catch (Exception e) {

                System.out.println("Falha ao se conectar com o BD!");

            }



        }


}
