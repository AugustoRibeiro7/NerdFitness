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
    private double proteina;
    private double carboidrato;
    private double gordura;
    private double calorias;
    private int porcao = 100;
    private LocalDate dataCriacao;
    private LocalDate datamod;
    
    
    
    
    //Contrutor do alimento testando
    public Alimento (String nome,double proteina, double carboidrato, double gordura)
    {
        //controle do id
         Alimento.quant_alimentos++;
        this.id = Alimento.quant_alimentos;
        
        this.dataCriacao = LocalDate.now();
        this.nome = nome;
        this.proteina = proteina;
        this.carboidrato = carboidrato;
        this.gordura = gordura;    
        //Calculo de caloria do alimento
        this.calorias = ((this.gordura*9)+(this.proteina*4)+(this.carboidrato*4))*porcao;
       
        
        //Adicionar alimentos
        AlimentoDao.guardarAlimentos(this);
        
           
    }
    //Atualizar data de modificação
        private void atualizarData() {
        this.datamod = LocalDate.now();
    }

    //Getters
    
    public String getNome() {
        return nome;

    }

    public double getProteina() {
        return proteina;
    }

    public double getCarboidrato() {
        return carboidrato;
    }

    public double getGordura() {
        return gordura;
    }

    public double getCalorias() {
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
    
    public void setProteina(double proteina) {
        atualizarData();
        this.proteina = proteina;
    }
    

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
        atualizarData();
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
        atualizarData();
    }

    public void setCalorias(double calorias) {
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
