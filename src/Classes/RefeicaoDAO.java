/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Lukas
 */
public class RefeicaoDAO {
    
    private static Refeicao bd_refeicao[] = new Refeicao[10];
           
    //Armazenar dieta
    public static void guardarRefeicao(Refeicao r,int id)
    {
        //AvaliacaoFisicaDao.Avaliacoes[id_pessoa] = avaliacao;
        //Bucar o erro do tipo 
        RefeicaoDAO.bd_refeicao[r.getId()] = r;
    }
           
    
}
