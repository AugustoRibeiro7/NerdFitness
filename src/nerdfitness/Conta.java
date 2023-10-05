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
    
    // ID E QUANTIDADE DE CONTAS
    private static long quant_contas;
    private long id;
    
    //VARIAVEIS DA CONTA
    Pessoa cliente = new Pessoa();
    Receita receita = new Receita();
    
    // CONSTRUTOR
    public Conta()
    {
        Conta.quant_contas++;
        this.id = Conta.quant_contas;
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
