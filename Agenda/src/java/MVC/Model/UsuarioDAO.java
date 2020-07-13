package MVC.Model;

import MVC.Model.Conexao;
import java.sql.*;

/**
 *
 * @author Maicon Vinicios
 */
public class UsuarioDAO {
    
    private Connection conexao;
    
    public UsuarioDAO() throws ClassNotFoundException {
        this.conexao = new Conexao().getConnection();
    }
    
    public void insereUsuario(Usuario usuario) {
        
        String sql = "INSERT INTO usuario" +
                "(nome_usuario, email_usuario, senha_usuario) VALUES" +
                "(?,?,?)";
        
        try {
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, usuario.getNome() );
            ps.setString(2, usuario.getEmail() );
            ps.setString(3, usuario.getSenha() );
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}