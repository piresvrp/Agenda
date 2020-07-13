
package MVC.Model;

/**
 *
 * @author Maicon Vinicios
 */

public class Usuario {
    
    private int cdusuario;
    private String nome;
    private String email;
    private String urlFoto;
    private String senha;
    
    public int getCD() {
        return this.cdusuario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }
    
    public String getURLFoto() {
        return this.urlFoto;
    }
    
    public void setURLFoto(String novaURL) {
        this.urlFoto = novaURL;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }
    
 }
