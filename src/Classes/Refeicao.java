/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author Lukas
 */
public class Refeicao {
    
    // ID E QUANTIDADE DE REFEIÇÕES
    private static int quant_refeicao;
    private int id;     
    
    
    //variaveis
    private Alimento[] cafe = new Alimento[10]; 
    private Alimento[] almoco = new Alimento[10]; 
    private Alimento[] janta = new Alimento[10]; 
    private Alimento[] outros = new Alimento[10]; 
    private int cafeCount; 
    private int almocoCount; 
    private int jantaCount; 
    private int outrosCount; 
    //private double cafe;
    //private double almoco;
    //private double janta;
    //private double outros;
    private double cafeLimite;
    private double almocoLimite;
    private double jantaLimite;
    private double outrosLimite;
    private int proteina;
    private int carboidrato;
    private int gordura;
    private int caloriasTotal;
    private String refeicao;
    
    private LocalDate dataCriacao;
     private LocalDate dataModificacao;
    
    
    
    public Refeicao(Dieta dieta,String refeicao)
    {
        //controle do id
         Refeicao.quant_refeicao++;
        this.id = Refeicao.quant_refeicao;
        
        //data de criação
         setDataCriacao(LocalDate.now());
         
         
                //Definindo limites de KCAL para cada refeicao
                cafeLimite = (dieta.getCaloriasdietatotal() * 0.25);
                almocoLimite = (dieta.getCaloriasdietatotal()* 0.35);
                jantaLimite = (dieta.getCaloriasdietatotal()* 0.25);
                outrosLimite = (dieta.getCaloriasdietatotal()* 0.25);
                this.refeicao = refeicao;
                   
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }
    
    //ADICIONAR ALIMENTOS AS REFEIÇÕES
    //cafe
    public void adicionarAlimentoAlmoco(Alimento alimento) {
        if (almocoCount < almoco.length) {
            almoco[almocoCount] = alimento;
            almocoCount++;
        }
    }
    
    //JANTA
    
        public void adicionarAlimentoJanta(Alimento alimento) {
        if (jantaCount < janta.length) {
            janta[jantaCount] = alimento;
            jantaCount++;
            atualizarDataModificacao();
        }
    }
        
     //CAFE
        public void adicionarAlimentoCafe(Alimento alimento) {
        if (cafeCount < cafe.length) {
            cafe[cafeCount] = alimento;
            cafeCount++;
            atualizarDataModificacao();
        }
    }
        
    //OUTROS
        public void adicionarAlimentoOutros(Alimento alimento) {
        if (outrosCount < outros.length) {
            outros[outrosCount] = alimento;
            outrosCount++;
            atualizarDataModificacao();
        }
    }
        
        
     //CONTAR MACROS
     // Método para calcular o total de proteína, carboidrato, gordura e calorias na refeição
    public void calcularNutrientes() {
        int totalProteina = 0;
        int totalCarboidrato = 0;
        int totalGordura = 0;
        int totalCalorias = 0;

        if (refeicao.equalsIgnoreCase("cafe")) {
            for (int i = 0; i < cafeCount; i++) {
                totalProteina += cafe[i].getProteina();
                totalCarboidrato += cafe[i].getCarboidrato();
                totalGordura += cafe[i].getGordura();
                totalCalorias += cafe[i].getCalorias();
            }
        } else if (refeicao.equalsIgnoreCase("almoco")) {
            for (int i = 0; i < almocoCount; i++) {
                totalProteina += almoco[i].getProteina();
                totalCarboidrato += almoco[i].getCarboidrato();
                totalGordura += almoco[i].getGordura();
                totalCalorias += almoco[i].getCalorias();
            }
        } else if (refeicao.equalsIgnoreCase("janta")) {
            for (int i = 0; i < jantaCount; i++) {
                totalProteina += janta[i].getProteina();
                totalCarboidrato += janta[i].getCarboidrato();
                totalGordura += janta[i].getGordura();
                totalCalorias += janta[i].getCalorias();
            }
        } else if (refeicao.equalsIgnoreCase("outros")) {
            for (int i = 0; i < outrosCount; i++) {
                totalProteina += outros[i].getProteina();
                totalCarboidrato += outros[i].getCarboidrato();
                totalGordura += outros[i].getGordura();
                totalCalorias += outros[i].getCalorias();
            }
        }

        System.out.println("Total de Proteína: " + totalProteina);
        System.out.println("Total de Carboidrato: " + totalCarboidrato);
        System.out.println("Total de Gordura: " + totalGordura);
        System.out.println("Total de Calorias: " + totalCalorias);
        
        atualizarDataModificacao();
    }
    
    //GETES E SETTERS PADRAO

    public Alimento[] getCafe() {
        return cafe;
    }

    public void setCafe(Alimento[] cafe) {
        atualizarDataModificacao();
        this.cafe = cafe;
    }

    public Alimento[] getAlmoco() {
        return almoco;
    }

    public void setAlmoco(Alimento[] almoco) {
        atualizarDataModificacao();
        this.almoco = almoco;
    }

    public Alimento[] getJanta() {
        return janta;
    }

    public void setJanta(Alimento[] janta) {
        atualizarDataModificacao();
        this.janta = janta;
    }

    public Alimento[] getOutros() {
        return outros;
    }

    public void setOutros(Alimento[] outros) {
        atualizarDataModificacao();
        this.outros = outros;
    }

    public double getCafeLimite() {
        return cafeLimite;
    }

    public void setCafeLimite(double cafeLimite) {
        atualizarDataModificacao();
        this.cafeLimite = cafeLimite;
    }

    public double getAlmocoLimite() {
        return almocoLimite;
    }

    public void setAlmocoLimite(double almocoLimite) {
        atualizarDataModificacao();
        this.almocoLimite = almocoLimite;
    }

    public double getJantaLimite() {
        return jantaLimite;
    }

    public void setJantaLimite(double jantaLimite) {
        atualizarDataModificacao();
        this.jantaLimite = jantaLimite;
    }

    public double getOutrosLimite() {
        return outrosLimite;
    }

    public void setOutrosLimite(double outrosLimite) {
        atualizarDataModificacao();
        this.outrosLimite = outrosLimite;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        atualizarDataModificacao();
        this.proteina = proteina;
    }

    public int getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(int carboidrato) {
        atualizarDataModificacao();
        this.carboidrato = carboidrato;
    }
    
    
    

    public int getGordura() {
        return gordura;
    }

    public void setGordura(int gordura) {
        atualizarDataModificacao();
        this.gordura = gordura;
    }

    public int getCaloriasTotal() {
        return caloriasTotal;
    }

    public void setCaloriasTotal(int caloriasTotal) {
        atualizarDataModificacao();
        this.caloriasTotal = caloriasTotal;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        atualizarDataModificacao();
        this.refeicao = refeicao;
    }

    public int getId() {
        return id;
    }

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
