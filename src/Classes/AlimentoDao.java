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
    
    //CONSTRUTOR
    public AlimentoDao()
    {
        populaAlimentos();
    }
    
    //METODO PARA PRE-INSERIR ALGUNS ALIMENTOS NO ARMAZENAMENTO
    private void populaAlimentos()
    {
        //nome,proteina,carboidrato,gordura
        new Alimento("Feijao",4.3, 14, 0.5);
        new Alimento("Arroz", 2.2, 28.2, 0.6);
        new Alimento("Frango", 20.8, 0, 2.3);
        new Alimento("Batata", 2.02, 17.49, 0.15);
        new Alimento("Cenoura", 0.93, 9.58, 0.24);
        new Alimento("Ovo", 12.6, 1.1, 9.5);
        new Alimento("Abacate", 2, 8.5, 14.7);
        new Alimento("Iogurte", 3.5, 4.7, 3.3);
        new Alimento("Abacaxi", 0.5, 9, 0.2);
        new Alimento("Picanha", 27, 0, 36);
        new Alimento("Maça", 0.5, 14, 0.2);
        new Alimento("Pão Integral", 12, 49, 2.5);
        new Alimento("Camarao", 24, 0, 1.1);
        new Alimento("Queijo Cheddar", 25, 1.3, 33);
        new Alimento("Leite", 3.4, 5, 1);
        new Alimento("Suco de Laranja", 0.8, 8.2, 0.2);
    }
    
    
    //Armazenador de alimentos
       private static Alimento bd_alimento[] = new Alimento[30];
       
       
       
    //Armazenar alimento
    public static void guardarAlimentos(Alimento alimento)
    {
        
        AlimentoDao.bd_alimento[alimento.getId()-1]=alimento;
    }
    
    //GET

    public static Alimento getBd_alimento(int posicao) {
        return bd_alimento[posicao];
    }
    
    //METODO BUSCA
    public static int buscaAlimento(String nomeAlimento)
    {
        int i;
        for(i=0; bd_alimento[i] != null && !nomeAlimento.equals(bd_alimento[i].getNome()) && i < bd_alimento.length; i++){}
        
        if (bd_alimento[i] != null)
        {
            if(nomeAlimento.equals(bd_alimento[i].getNome()))
            {
                 return i;
            }
        }
        return -1;
    }
    

    
}



