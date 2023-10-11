/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Lukas
 */
public class Dieta {
    private String tipo;
    private int idDieta;
    private String nome;
    private int carboidrato;
    private int proteina;
    private int gordura;
    private Double imc;
    //Adicionar data de Criação e modificação  
    
    //Contrutor da dieta
    public Dieta(String tipo, Pessoa pessoa,AvaliacaoFisica avaliacao){
        
        //ATRIBUTOS REFERENTE A DIETA
        
        
        // Loop infinito
        for (; ; ) {  
            if (tipo.equals("DIMINUIR O PESO") || tipo.equals("MANTER O PESO") ||
                tipo.equals("MELHORAR COMPOSIÇÃO CORPORAL") || tipo.equals("AUMENTAR O PESO")) {
                this.tipo = tipo;  // Atribui o tipo válido
                break;  // Sai do loop quando o tipo é válido
            } else {
                System.out.println("TIPO INVÁLIDO");

            }
            
            //ATRIBUTOS REFERENTE A PESSOA
            nome = pessoa.getNome();
            
            
            //ATRIBUTOS REFERENTE A AVALIAÇÃO FISICCA
            //imc= avaliacao.imc()
            
            
            
            
            
            
            
            
            //ATRIBUTOS REFERENTE A AVALIACAO FISICA
        

        
        }
    
    
    }
}
