/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Model;

/**
 *
 * @author Maicon Vinicios
 */
public class Compromisso {
   
    private int cdcompromisso;
    private String descricao;
    private String nomeCompromisso;
    private String local;
    private String dtCompromisso;
    
    public int  getCD() {
        return this.cdcompromisso;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setNome(String nome) {
        this.nomeCompromisso = nome;
    }
    
    public String getNome() {
        return this.nomeCompromisso;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public String getLocal() {
        return this.local;
    }
    
    public String getData() {
        return this.dtCompromisso;
    }
    
    public void setData(String data) {
        this.dtCompromisso = data;
    }
    
}