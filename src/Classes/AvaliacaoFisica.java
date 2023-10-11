/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 *
 * @author gutom
 */
public class AvaliacaoFisica {
    
    // ID E QUANTIDADE DE CONTAS
    private static long quant_pessoas;
    private long id;
    
    //VARIAVEIS PARA OS DADOS DA AVALIAÇÃO FISICA
    private Pessoa usuario;
    private double peso, altura, pescoco, cintura, quadril;
    private double IMC, taxaAtivade, TMB, BF, massa_gorda, massa_magra;
    private int idade;
    private LocalDate dataCriacao, dataModificacao;
    
    
    //CONSTRUTOR
    public AvaliacaoFisica()
    {
        //controle do id
         AvaliacaoFisica.quant_pessoas++;
        this.id = AvaliacaoFisica.quant_pessoas;
        
        //data de criação
         setDataCriacao(LocalDate.now());
    }
    
    //GET PARA PEGAR O ID

    public long getId() {
        return id;
    }
    
    //GET PARA PEGAR A QUANTIDADE DE CONTAS CRIADAS

    public static long getQuant_pessoas() {
        return quant_pessoas;
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }
    
    
    //METODOS
    
    public void calcula_IMC()
    {
        this.IMC = this.peso / (this.altura * this.altura);
        atualizarDataModificacao();
    }
    
    public void calcula_taxaAtividade(int taxa)
    {
        atualizarDataModificacao();
        switch (taxa) {
            case 1:
                this.taxaAtivade = 1.2; //Sedentários
                break;
            case 2:
                this.taxaAtivade = 1.375; //Levemente ativo
                break;
            case 3:
                this.taxaAtivade = 1.55; //Moderadamente ativo
                break;
            case 4:
                this.taxaAtivade = 1.725; //Altamente ativo
                break;
            case 5:
                this.taxaAtivade =  1.9; //Extremamente ativo
                break;
        }
    }
    
    public void calcula_TMB(String sexo)
    {
        atualizarDataModificacao();
        if("masc".equals(sexo))
        {
            this.TMB = this.taxaAtivade * (66 + ((13.7 * this.peso) + ( 5 * this.altura) - (6.8 * this.idade)));
        }
        else
        {
            this.TMB = this.taxaAtivade * (655 + ((9.6 * this.peso) + (1.8 * this.altura) - (4.7 * this.idade)));
        }
    }
    
    public void calcula_BF(String sexo) //valor do percentual de gordura
    {
        atualizarDataModificacao();
        if("masc".equals(sexo))
        {
            this.BF = 86.010 * Math.log10(this.cintura - this.pescoco) - 70.041 * Math.log10(this.altura) + 36.76;
        }
        else
        {
            this.BF = 163.205 * Math.log10(this.cintura + this.quadril - this.pescoco) - 97.684 * Math.log10(this.altura) - 78.387;

        }
    }
    
    public void calcula_massaGorda()
    {
        atualizarDataModificacao();
        this.massa_gorda = this.peso * (this.BF/100);
    }
    
    public void calcula_massaMagra()
    {
        atualizarDataModificacao();
        this.massa_magra = this.peso - this.massa_gorda;
    }
    
    //GETERS DOS METODOS

    public double getIMC() {
        return IMC;
    }

    public double getTaxaAtivade() {
        return taxaAtivade;
    }

    public double getTMB() {
        return TMB;
    }

    public double getBF() {
        return BF;
    }

    public double getMassa_gorda() {
        return massa_gorda;
    }

    public double getMassa_magra() {
        return massa_magra;
    }
    
    
    //GETERS E SETERS DOS DADOS DO USUARIO

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
        atualizarDataModificacao();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        atualizarDataModificacao();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        atualizarDataModificacao();
    }

    public double getPescoco() {
        return pescoco;
    }

    public void setPescoco(double pescoco) {
        this.pescoco = pescoco;
        atualizarDataModificacao();
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
        atualizarDataModificacao();
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
        atualizarDataModificacao();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        atualizarDataModificacao();
    }
    
    //GETERS E SETERS DAS DATAS DE CRIAÇÁO E MODIFICAÇÃO
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }
 
    
}

