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
public class TimeLine {
  private Post[] posts;
    private int tamanho;

    public TimeLine(Pessoa pessoa) {
        this.posts = new Post[pessoa.getSeguidores().length * 10]; 
        this.tamanho = 0;

        for (Pessoa seguidor : pessoa.getSeguidores()) {
            Post[] postsSeguidor = seguidor.getPosts(); 
            for (Post post : postsSeguidor) {
                adicionarPost(post);
            }
        }
    }

    public void adicionarPost(Post post) {
        if (tamanho == posts.length) {
            Post[] novaArray = new Post[posts.length * 2];
            System.arraycopy(posts, 0, novaArray, 0, tamanho);
            posts = novaArray;
        }

        posts[tamanho] = post;
        tamanho++;
    }

    public void exibirTimeline() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Autor: " + posts[i].getAutor().getNome());
            System.out.println("Conteúdo: " + posts[i].getConteudo());
            System.out.println("Curtidas: " + posts[i].getCurtida());
            System.out.println();
        }
    }
}
