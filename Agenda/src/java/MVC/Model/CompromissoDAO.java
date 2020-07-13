/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Maicon Vinicios
 */
public class CompromissoDAO {

    private Connection conexao;
    
    public CompromissoDAO() throws ClassNotFoundException {
        this.conexao = new Conexao().getConnection();
    }
    
    public void insereCompromisso(Compromisso compromisso) {
        
        String sql = "INSERT INTO compromisso" +
                "(nome_comp, descricao, local, dtcompromisso, cdusuario) VALUES" +
                "(?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ps.setString(1, compromisso.getNome() );
            ps.setString(2, compromisso.getDescricao() );
            ps.setString(3, compromisso.getLocal() );
            ps.setString(4, compromisso.getData());
            ps.setString(5, "colocar id do usuario aqui");
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
