/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;
/**
 *
 * @author gutom
 */
public class Conta {
    
    
    
    //VARIAVEIS DA CONTA
    Pessoa cliente = new Pessoa();
    Receita receita = new Receita();
    
    
    public Conta()
    {
        
    }
    
    
    //GET PARA PEGAR O ID

    public long getId() {
        return id;
    }
    
    //GET PARA PEGAR A QUANTIDADE DE CONTAS CRIADAS

    public static long getQuant_contas() {
        return quant_contas;
    }

    
}
