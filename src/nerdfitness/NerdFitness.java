/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nerdfitness;

import interface_.Interface;
import classes.PessoaDao;
import classes.AlimentoDao;

/**
 *
 * @author gutom
 */
public class NerdFitness {
    
    

    // CONSTRUTOR PARA RODAR O CODIGO
    public NerdFitness() {
        
        //POPULANDO DADOS
        new PessoaDao();
        new AlimentoDao();
        
        

        
        //METODO QUE CHAMA A INTERFACE DO PROGRAMA
        new Interface();
        
       
        
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        //CHAMADA DO CONSTRUTOR COM O CODIGO PRINCIPAL DO PROGRAMA
        new NerdFitness();
    }
    
}
