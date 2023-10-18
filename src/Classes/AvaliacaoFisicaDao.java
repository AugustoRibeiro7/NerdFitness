/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author gutom
 */
public class AvaliacaoFisicaDao {
    
    //vetor DAO
    private static AvaliacaoFisica Avaliacoes[] = new AvaliacaoFisica[10];
    
    //get vetor DAO
    public static AvaliacaoFisica getAvaliacoes(int i) {
        return Avaliacoes[i];
    }
    
    //MÉTODO PARA ARMAZENAR NO VETOR
    public static void armazenaDao(int id_pessoa, AvaliacaoFisica avaliacao)
    {
        AvaliacaoFisicaDao.Avaliacoes[id_pessoa] = avaliacao;
    }
}
