package MVC.Model;

import java.sql.*;

/**
 *
 * @author Maicon Vinicios
 */
public class Conexao {
  
    public Connection getConnection() throws ClassNotFoundException {
        
        Connection conexao = null;
        Class.forName("org.postgresql.Driver");
        try {
            conexao =  DriverManager.getConnection(
                "jdbc:postgresql://localhost/agenda", "postgres", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
         }
        
        return conexao;
    }
}