/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Alimento {
    static int idalimento;
    private String nome;
    private int proteina;
    private int carboidrato;
    private int gordura;
    private int calorias;
    private LocalDate dataCriacao;
    private LocalDate datamod;
    
    
    
    
    //Contrutor do alimento testandp
    public Alimento (String nome,int proteina, int carboidrato, int gordura)
    {
        this.dataCriacao = LocalDate.now();
        this.nome = nome;
        this.proteina = proteina;
        this.carboidrato = carboidrato;
        this.gordura = gordura;    
        //Calculo de caloria do alimento
        this.calorias = ((this.gordura*9)+(this.proteina*4)+(this.carboidrato*4));
        //Contador de alimentos adicionadps( Id ) 
        this.idalimento++;
           
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

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }
    
    //setters

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
    
 

    
    
    
}
