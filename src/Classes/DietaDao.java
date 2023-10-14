/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Lukas
 */
public class DietaDao {
    
       //Armazenador de alimentos
       private static Dieta bd_dieta[] = new Dieta[10];
       
       
       
    //Armazenar dieta
    public static void guardardieta(Dieta dieta)
    {
        //AvaliacaoFisicaDao.Avaliacoes[id_pessoa] = avaliacao;
        DietaDao.bd_dieta[dieta.getId()]=dieta;
    }

    
    
}
