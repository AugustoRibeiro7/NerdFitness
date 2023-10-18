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
    private String objetivo;
    private int numRefeicoes;

    private String nome; //tipo
    private int carboidrato;
    private int proteina;
    private int gordura;
    private Double imc;
    private Double caloriasdietatotal;
    
    //data de Criação e modificação  
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    
    
    //Contrutor da dieta
    public Dieta(String objetivo, int tipo, Pessoa pessoa,AvaliacaoFisica avaliacao, int num_Refeicoes){
        
        //controle do id
         Dieta.quant_dieta++;
        this.id = Dieta.quant_dieta;
        
        //data de criação
         setDataCriacao(LocalDate.now());
        
        //ATRIBUTOS REFERENTE A DIETA
        
        
        // Loop infinito
        for (; ; ) {  
            if (objetivo.equals("DIMINUIR O PESO") || objetivo.equals("MANTER O PESO") ||
                objetivo.equals("MELHORAR COMPOSIÇÃO CORPORAL") || objetivo.equals("AUMENTAR O PESO")) {
                this.objetivo = objetivo;  // Atribui o tipo válido
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

        if("MANTER O PESO".equals(this.objetivo))
        {
            caloriasdietatotal = avaliacao.getTMB();

        }

        if("DIMINUIR O PESO".equals(this.objetivo))
        {
            caloriasdietatotal = avaliacao.getTMB()-500;

        }

        if("AUMENTAR O PESO".equals(this.objetivo))
        {
            caloriasdietatotal = avaliacao.getTMB()+500;
        }
            
        //CHAMAR METODO TIPO DE DIETA
        tipoDieta(tipo);
        
        //SETAR NUMERO DE REFEIÇÕES
        setNumRefeicoes(num_Refeicoes);
        
        //GUARDAR DIETA NA MEMORIA DAO
        DietaDao.guardardieta(this, (int) pessoa.getId());
    
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }

    //getters and setters

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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

    public int getNumRefeicoes() {
        return numRefeicoes;
    }

    private void setNumRefeicoes(int numRefeicoes) {
        this.numRefeicoes = numRefeicoes;
    }
    
    

    //METODO TIPO DE DIETA
    private void tipoDieta(int tipo)
    {
        switch (tipo) {
            case 1:
                this.nome = "EQUILIBRADA";
                this.carboidrato = 40;
                this.proteina = 30;
                this.gordura = 30;
                
                break;
            case 2:
                this.nome = "LOW CARB";
                this.carboidrato = 30;
                this.proteina = 50;
                this.gordura = 20;
                
                break;
            case 3:
                this.nome = "CETOGÊNICA";
                this.carboidrato = 15;
                this.proteina = 15;
                this.gordura = 70;
                
                break;
        }
    }
    
    
}
