package br.com.ecommercepapelaria.servlet.config;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionPoolConfig {

    private static BasicDataSource dataSource;
    public String sql = null;
    public Connection con = null;

    public ConnectionPoolConfig() {
        getDataSource();
    }

    public static BasicDataSource getDataSource() {

        if (dataSource == null) {

            dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:h2:~/test");
            dataSource.setUsername("sa");
            dataSource.setPassword("sa");
            dataSource.setMinIdle(5);   // Número mínimo de conexões ociosas no pool
            dataSource.setMaxIdle(10);  // Número máximo de conexões ociosas no pool
            dataSource.setMaxTotal(50); // Número máximo de conexões totais no pool

            System.out.println("Nova conexão pool criada com sucesso!");
        }

        return dataSource;

    }

    public static Connection getConnection() throws SQLException {

        return getDataSource().getConnection();

    }
}
