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
    private double cafe;
    private double almoco;
    private double janta;
    private double outros;
    private int proteina;
    private int carboidrato;
    private int gordura;
    private int caloriasTotal;
    
    public Refeicao(Dieta dieta)
    {
                //Definindo limites de KCAL para cada refeicao
                cafe = (dieta.getCaloriasdietatotal() * 0.25);
                almoco = (dieta.getCaloriasdietatotal()* 0.35);
                janta = (dieta.getCaloriasdietatotal()* 0.25);
                outros = (dieta.getCaloriasdietatotal()* 0.25);
        
        
    }
    
    
    
    
}
