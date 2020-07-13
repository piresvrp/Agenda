package MVC.Controller;

//Importação de API necessária
import javax.servlet.*;
import javax.servlet.http.*;
import MVC.Model.Usuario;
import MVC.Model.UsuarioDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maicon Vinicios
 */
public class ServletCadastro extends HttpServlet {
    
    //Sobrescreve o método doPost pois a solicitação cliente virá através do POST.
    public void doPost(HttpServletRequest requisicao,
                    HttpServletResponse resposta) throws ServletException, IOException {
        
        //Recebe dados do formulário e cria instância de classe do pacote Model.
        String nome = requisicao.getParameter("nome");
        String email = requisicao.getParameter("email");
        String senha = requisicao.getParameter("senha");
        Usuario novoUsuario = new Usuario();
        UsuarioDAO dao = null;
        try {
            dao = new UsuarioDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        novoUsuario.setNome(nome);
        novoUsuario.setEmail(email);
        novoUsuario.setSenha(senha);
        
        dao.insereUsuario(novoUsuario);
        RequestDispatcher despachar = requisicao.getRequestDispatcher("cadastrado.jsp");
        despachar.forward(requisicao, resposta);
        
    }
}
