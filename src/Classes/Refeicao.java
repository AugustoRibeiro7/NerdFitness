/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Lukas
 */
public class Refeicao {
    
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
    
    
    
    public Refeicao(Dieta dieta,String refeicao)
    {
                //Definindo limites de KCAL para cada refeicao
                cafeLimite = (dieta.getCaloriasdietatotal() * 0.25);
                almocoLimite = (dieta.getCaloriasdietatotal()* 0.35);
                jantaLimite = (dieta.getCaloriasdietatotal()* 0.25);
                outrosLimite = (dieta.getCaloriasdietatotal()* 0.25);
                this.refeicao = refeicao;
                   
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
        }
    }
        
     //CAFE
        public void adicionarAlimentoCafe(Alimento alimento) {
        if (cafeCount < cafe.length) {
            cafe[cafeCount] = alimento;
            cafeCount++;
        }
    }
        
    //OUTROS
        public void adicionarAlimentoOutros(Alimento alimento) {
        if (outrosCount < outros.length) {
            outros[outrosCount] = alimento;
            outrosCount++;
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
    }
    
    //GETES E SETTERS PADRAO

    public Alimento[] getCafe() {
        return cafe;
    }

    public void setCafe(Alimento[] cafe) {
        this.cafe = cafe;
    }

    public Alimento[] getAlmoco() {
        return almoco;
    }

    public void setAlmoco(Alimento[] almoco) {
        this.almoco = almoco;
    }

    public Alimento[] getJanta() {
        return janta;
    }

    public void setJanta(Alimento[] janta) {
        this.janta = janta;
    }

    public Alimento[] getOutros() {
        return outros;
    }

    public void setOutros(Alimento[] outros) {
        this.outros = outros;
    }

    public double getCafeLimite() {
        return cafeLimite;
    }

    public void setCafeLimite(double cafeLimite) {
        this.cafeLimite = cafeLimite;
    }

    public double getAlmocoLimite() {
        return almocoLimite;
    }

    public void setAlmocoLimite(double almocoLimite) {
        this.almocoLimite = almocoLimite;
    }

    public double getJantaLimite() {
        return jantaLimite;
    }

    public void setJantaLimite(double jantaLimite) {
        this.jantaLimite = jantaLimite;
    }

    public double getOutrosLimite() {
        return outrosLimite;
    }

    public void setOutrosLimite(double outrosLimite) {
        this.outrosLimite = outrosLimite;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }

    public int getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(int carboidrato) {
        this.carboidrato = carboidrato;
    }

    public int getGordura() {
        return gordura;
    }

    public void setGordura(int gordura) {
        this.gordura = gordura;
    }

    public int getCaloriasTotal() {
        return caloriasTotal;
    }

    public void setCaloriasTotal(int caloriasTotal) {
        this.caloriasTotal = caloriasTotal;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }
    

        

    
    
    
    
    
    
}
