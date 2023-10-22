/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import Classes.RefeicaoAlimento;

/**
 *
 * @author Lukas
 */
public class Refeicao {
    
    // ID E QUANTIDADE DE REFEIÇÕES
    private static int quant_refeicao;
    private int id;     
    
    
    //variaveis
    private RefeicaoAlimento[] cafe = new RefeicaoAlimento[5]; 
    private RefeicaoAlimento almoco = new RefeicaoAlimento(); 
    private RefeicaoAlimento janta = new RefeicaoAlimento(); 
    private RefeicaoAlimento[] outros = new RefeicaoAlimento[5]; 
    
    private int cafeCount; 
    private int outrosCount; 

    private int proteina;
    private int carboidrato;
    private int gordura;
    private int caloriasTotal;
    
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    
    
    
    public Refeicao()
    {
        //controle do id
         Refeicao.quant_refeicao++;
        this.id = Refeicao.quant_refeicao;
        
        //data de criação
         setDataCriacao(LocalDate.now());
        
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }
    
    //METODO PARA ADICIONAR AS REFEICOES
    public void adicionarRefeicao(RefeicaoAlimento refeicao) {
        if(refeicao.getNomeRefeicao().equals("almoco"))
        {
            almoco= refeicao;
        }
        else if(refeicao.getNomeRefeicao().equals("janta"))
        {
            janta = refeicao;
        }
        else if(refeicao.getNomeRefeicao().equals("cafe"))
        {
            if (cafeCount < cafe.length) {
                cafe[cafeCount] = refeicao;
                cafeCount++;
            }
        }
        else //outros
        {
            if (outrosCount < outros.length) {
            outros[outrosCount] = refeicao;
            outrosCount++;
            }
        }
        
        //receber valores nutricionais das refeições
        proteina += refeicao.getProteina();
        carboidrato += refeicao.getCarboidrato();
        gordura += refeicao.getGordura();
        caloriasTotal += refeicao.getCalorias();
        
        //atualizar data de modificação
        atualizarDataModificacao();
    }
        
    
    //GETES E SETTERS PADRAO

    public RefeicaoAlimento[] getCafe() {
        return cafe;
    }

    public RefeicaoAlimento getAlmoco() {
        return almoco;
    }

    public RefeicaoAlimento getJanta() {
        return janta;
    }


    public RefeicaoAlimento[] getOutros() {
        return outros;
    }


    // GET DO ID

    public int getId() {
        return id;
    }

    //GET E SETERS DATAS
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    private void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }
    
    

        

    
    
    
    
    
    
}
