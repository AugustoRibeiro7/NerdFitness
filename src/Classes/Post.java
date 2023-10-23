/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import classes.Pessoa;

/**
 *
 * @author Lukas
 */
public class Post {

    static void adicionarPost(Post novoPost) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int curtida;
    private String conteudo;
    private Pessoa autor;

    
   public Post(String conteudo)
   {
       this.conteudo =conteudo;
       this.autor = autor;
   }
   
   public void curtir ()
   {
       this.curtida++;
   }

    public int getCurtida() {
        return curtida;
    }

    public void setCurtida(int curtida) {
        this.curtida = curtida;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    
    
}
