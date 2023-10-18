/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Lukas
 */
public class AlimentoDao {
    
    
    //Armazenador de alimentos
       private static Alimento bd_alimento[] = new Alimento[10];
       
       
       
    //Armazenar alimento
    public static void guardarAlimentos(Alimento alimento)
    {
        //AvaliacaoFisicaDao.Avaliacoes[id_pessoa] = avaliacao;
        AlimentoDao.bd_alimento[alimento.getId()]=alimento;
    }

    
}



