/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Alimento {
    
    // ID E QUANTIDADE DE ALIMENTOS
    private static int quant_alimentos;
    private int id;
    
    private String nome;
    private int proteina;
    private int carboidrato;
    private int gordura;
    private int calorias;
    private int porcao;
    private LocalDate dataCriacao;
    private LocalDate datamod;
    static Alimento BancoDeAlimento[] = new Alimento[1000];
    
    
    
    
    //Contrutor do alimento testandp
    public Alimento (String nome,int proteina, int carboidrato, int gordura,int porcao)
    {
        //controle do id
         Alimento.quant_alimentos++;
        this.id = Alimento.quant_alimentos;
        
        this.dataCriacao = LocalDate.now();
        this.nome = nome;
        this.porcao = porcao;
        this.proteina = proteina;
        this.carboidrato = carboidrato;
        this.gordura = gordura;    
        //Calculo de caloria do alimento
        this.calorias = ((this.gordura*9)+(this.proteina*4)+(this.carboidrato*4))*porcao;
       
        
        //Adicionar alimentos
        BancoDeAlimento[id]=this;
        
           
    }
    //Atualizar data de modificação
        private void atualizarData() {
        this.datamod = LocalDate.now();
    }

    //Getters
    
    public String getNome() {
        return nome;

    }

    public int getProteina() {
        return proteina;
    }

    public int getCarboidrato() {
        return carboidrato;
    }

    public int getGordura() {
        return gordura;
    }

    public int getCalorias() {
        return calorias;
    }
    
      public int getId() {
        return id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDatamod() {
        return datamod;
    }

    //setters
    
    public void setProteina(int proteina) {
        atualizarData();
        this.proteina = proteina;
    }
    

    public void setCarboidrato(int carboidrato) {
        this.carboidrato = carboidrato;
        atualizarData();
    }

    public void setGordura(int gordura) {
        this.gordura = gordura;
        atualizarData();
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
        atualizarData();
    }
    
    
    
    
    //Imprimir lista de alimentos
    
    public void imprimirAlimentos()
    {
        for(int cont =0 ; cont <=  id; cont++)
        {
            System.out.println("Nome: ");
        }
    }
    
    
    
 

    
    
    
}
