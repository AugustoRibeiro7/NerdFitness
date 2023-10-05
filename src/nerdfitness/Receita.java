/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

import java.util.Date;



/**
 *
 * @author gutom
 */
public class Receita {
   
    // ID E QUANTIDADE DE RECEITAS
    private long id;
    private static long quant_receitas;
    
    //VARIAVEIS PARA OS DADOS DAS RECEITAS
     private String nome;
     private double carboidratos;
     private double proteínas;
     private double gorduras;
     private double calorias;
     private int porcao = 100;
     private String tipoUsuario;
     private Date dataCriacao;
     private Date dataModificacao;
     
     
    // CONSTRUTOR
    public Receita()
    {
        Receita.quant_receitas++;
        this.id = Receita.quant_receitas;
    }
    
     //GET PARA PEGAR O ID
    public long getId() {
        return id;
    }

    //GET PARA PEGAR A QUANTIDADE DE RECEITAS CRIADAS
    public static long getQuant_receitas() {
        return quant_receitas;
    }
    
    //GETS E SETS DAS VARIAVEIS DE RECEITA
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteínas() {
        return proteínas;
    }

    public void setProteínas(double proteínas) {
        this.proteínas = proteínas;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias() {
        double calorias = this.carboidratos * 4 + this.proteínas * 4 + this.gorduras * 9;
        this.calorias = calorias;
    }

    public int getPorcao() {
        return porcao;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    

    
    
    
}
