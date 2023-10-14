/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 *
 * @author Lukas
 */
public class Dieta {
    
    // ID E QUANTIDADE DE DIETAS
    private int id;
    private static int quant_dieta;
    
    //atributos dieta
    private String tipo;

    private String nome;
    private int carboidrato;
    private int proteina;
    private int gordura;
    private Double imc;
    private Double caloriasdietatotal;
    private LocalDate dataCriacao;
     private LocalDate dataModificacao;

    //Adicionar data de Criação e modificação  
    
    //Contrutor da dieta
    public Dieta(String tipo, Pessoa pessoa,AvaliacaoFisica avaliacao){
        
        //controle do id
         Dieta.quant_dieta++;
        this.id = Dieta.quant_dieta;
        
        //data de criação
         setDataCriacao(LocalDate.now());
        
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
        }
            
            //cases da dieta
            
            //ATRIBUTOS REFERENTE A PESSOA
            nome = pessoa.getNome();
            
            
            //ATRIBUTOS REFERENTE A AVALIAÇÃO FISICCA
            imc= avaliacao.getIMC();
            
            
            //CALCULO DA DIETA
            
            if(this.tipo=="MANTER O PESO")
            {
                caloriasdietatotal = avaliacao.getTMB();
                
            }
            
            if(this.tipo == "DIMINUIR O PESO")
            {
                caloriasdietatotal = avaliacao.getTMB()-500;
                
            }
            
            if(this.tipo == "AUMENTAR O PESO")
            {
                caloriasdietatotal = avaliacao.getTMB()+500;
            }
            
            DietaDao.guardardieta(this, (int) pessoa.getId());
            
        
        
    
    
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        atualizarDataModificacao();
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        atualizarDataModificacao();
        this.nome = nome;
    }

    public int getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(int carboidrato) {
        atualizarDataModificacao();
        this.carboidrato = carboidrato;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        atualizarDataModificacao();
        this.proteina = proteina;
    }

    public int getGordura() {
        return gordura;
    }

    public void setGordura(int gordura) {
        atualizarDataModificacao();
        this.gordura = gordura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        atualizarDataModificacao();
        this.imc = imc;
    }

    public Double getCaloriasdietatotal() {
        return caloriasdietatotal;
    }

    public void setCaloriasdietatotal(Double caloriasdietatotal) {
        this.caloriasdietatotal = caloriasdietatotal;
        atualizarDataModificacao();
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    private void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
        atualizarDataModificacao();
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

 
    
}
