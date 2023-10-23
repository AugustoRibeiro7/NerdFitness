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
public class RedeSocial {
    private Pessoa usuario;
    private TimeLine timeline;

    public RedeSocial(Pessoa usuario) {
        this.usuario = usuario;
        this.timeline = new TimeLine(usuario);
    }

    public void adicionarPost(String conteudo) {
        Post novoPost = new Post(conteudo);
        Post.adicionarPost(novoPost);
    }

    public void exibirTimeline() {
        timeline.exibirTimeline();
    }

    public static void main(String[] args) {
        Pessoa usuario = new Pessoa();

        RedeSocial redeSocial = new RedeSocial(usuario);

        redeSocial.adicionarPost("Conteúdo do primeiro post");
        redeSocial.adicionarPost("Conteúdo do segundo post");

        redeSocial.exibirTimeline();
    }
    
}
