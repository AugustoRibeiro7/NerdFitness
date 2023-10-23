/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import classes.Alimento;
import classes.Dieta;

/**
 *
 * @author gutom
 */
public class RefeicaoAlimento {
    
    private Alimento[] alimentos = new Alimento[10];
    private int alimentoCont;
    private String nomeRefeicao;
    private Dieta dieta;
    
    private double cafeLimite;
    private double almocoLimite;
    private double jantaLimite;
    private double outrosLimite;
    
    private int proteina;
    private int carboidrato;
    private int gordura;
    private int calorias;

    //CONSTRUTOR
    public RefeicaoAlimento() {
        this.calorias = 0;
    }
    

    //METODO PARA DEFINIR OS LIMITES DE NUTRIENTES DAS REFEIÇÕES BASEADO NA DIETA
    public void definirLimite(Dieta dieta)
    {
        this.dieta = dieta;
        
        //Definindo limites de KCAL para cada refeicao
        cafeLimite = (this.dieta.getCaloriasdietatotal() * 0.25);
        almocoLimite = (this.dieta.getCaloriasdietatotal()* 0.35);
        jantaLimite = (this.dieta.getCaloriasdietatotal()* 0.25);
        outrosLimite = (this.dieta.getCaloriasdietatotal()* 0.25);
    }
    
    
    //METODO PARA DICIONAR OS ALIMENTOS DA REFEICAO
    public void adicionarAlimento(Alimento alimento, String tipoRefeicao) {
        this.nomeRefeicao = tipoRefeicao;
        //definir o limite baseado no tipo da refeição
        double limite;
        limite = switch (nomeRefeicao) {
            case "cafe" -> cafeLimite;
            case "almoco" -> almocoLimite;
            case "janta" -> jantaLimite;
            default -> outrosLimite;
        };
        
        //adicionar alimento se nao tiver atingido o  limite do vetor e o limite da dieta
        if (alimentoCont < alimentos.length && calorias > limite-alimento.getCalorias()) {
            //receber alimento
            alimentos[alimentoCont] = alimento;
            
            //adicionar os valores nutricionais do alimento
            proteina += alimento.getProteina();
            carboidrato += alimento.getCarboidrato();
            gordura += alimento.getGordura();
            calorias += alimento.getCalorias();
            
            //subir o contador
            alimentoCont++;
        }
        else
        {
            System.out.println("Nao e possivel adicionar mais alimentos nesta refeicao");
        }
    }
    
    //GETERS

    public Alimento[] getAlimentos() {
        return alimentos;
    }

    public String getNomeRefeicao() {
        return nomeRefeicao;
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
    
    //GETERS LIMITE

    public double getCafeLimite() {
        return cafeLimite;
    }

    public double getAlmocoLimite() {
        return almocoLimite;
    }

    public double getJantaLimite() {
        return jantaLimite;
    }

    public double getOutrosLimite() {
        return outrosLimite;
    }
    
    
    
}
