/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nerdfitness;

/**
 *
 * @author gutom
 */
public class NerdFitness {
    
    

    // CONSTRUTOR PARA RODAR O CODIGO
    public NerdFitness() {
        new PessoaDao();
        Interface it = new Interface();
        
       
        System.out.println(PessoaDao.clientes[0].getNome());
        System.out.println(PessoaDao.clientes[1].getNome());
        System.out.println(PessoaDao.clientes[2].getNome());
        
        it.tela_inicial();
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        //CHAMADA DO CONSTRUTOR COM O CODIGO PRINCIPAL DO PROGRAMA
        new NerdFitness();
    }
    
}
