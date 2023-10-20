/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Lukas
 */
public class PreferenciaalimentarDao {
      
    //Armazenador de alimentos
       private static PreferenciasAlimentares bd_preferencias[] = new PreferenciasAlimentares[10];
       
       
       
    //Armazenar alimento
    public static void armazenaPreferencia(PreferenciasAlimentares p )
    {
        //AvaliacaoFisicaDao.Avaliacoes[id_pessoa] = avaliacao;
        PreferenciaalimentarDao.bd_preferencias[p.getId()]=p;
        
    }

    
    //GET

    public static PreferenciasAlimentares getBd_preferencias(int posicao) {
        return bd_preferencias[posicao];
    }
    
    
}
