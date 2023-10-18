/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nerdfitness;

import interface_.Interface;
import classes.PessoaDao;

/**
 *
 * @author gutom
 */
public class NerdFitness {
    
    

    // CONSTRUTOR PARA RODAR O CODIGO
    public NerdFitness() {
        
        new PessoaDao();
        
        //método que roda a tela de login/cadastro
        new Interface();
        
       //testando as pessoas criadas automaticamente pelo PessoaDao
        //System.out.println(PessoaDao.clientes[0].getNome());
        //System.out.println(PessoaDao.clientes[1].getNome());
       // System.out.println(PessoaDao.clientes[2].getNome());
        
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        //CHAMADA DO CONSTRUTOR COM O CODIGO PRINCIPAL DO PROGRAMA
        new NerdFitness();
    }
    
}
