/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

/**
 *
 * @author Alunos
 */
rroz = new Alimento("Arroz", 2, 45, 1, 100);
        Alimento feijao = new Alimento("Feijão", 7, 20, 1, 100);
        Alimento batata = new Alimento("Batata", 2, 20, 0, 100);
        Alimento macarrão = new Alimento("Macarrão", 12, 25, 2, 100);
        Alimento pão = new Alimento("Pão", 9, 49, 2, 100);
        Alimento aipim = new Alimento("Aipim (Mandioca)", 1, 38, 0, 100);
        Alimento abóbora = new Alimento("Abóbora", 1, 7, 0, 100);
        Alimento banana = new Alimento("Banana", 1, 23, 0, 100);
        Alimento laranja = new Alimento("Laranja", 1, 8, 0, 100);
        Alimento abacaxi = new Alimento("Abacaxi", 0, 13, 0, 100);
        Alimento açaí = new Alimento("Açaí", 2, 8, 4, 100);
        Alimento manga = new Alimento("Manga", 0, 14, 0, 100);
        Alimento beterraba = new Alimento("Beterraba", 1, 10, 0, 100);
        Alimento milho = new Alimento("Milho", 3, 21, 2, 100);
        Alimento lentilha = new Alimento("Lentilha", 9, 20, 1, 100);
        
        //PROTEINAS
        Alimento frango = new Alimento("Frango", 27, 0, 3, 100);
        Alimento carneBoi = new Alimento("Carne de Boi", 31, 0, 3, 100);
        Alimento carnePorco = new Alimento("Carne de Porco", 27, 0, 12, 100);
        Alimento peixe = new Alimento("Peixe", 20, 0, 5, 100);
        Alimento camarão = new Alimento("Camarão", 20, 1, 1, 100);
        Alimento ovo = new Alimento("Ovo", 6, 1, 5, 100);
        Alimento queijo = new Alimento("Queijo", 25, 1, 33, 100);
        Alimento abacate = new Alimento("Abacate", 2, 9, 14, 100);
        Alimento amendoim = new Alimento("Amendoim", 25, 16, 49, 100);
        Alimento salmão = new Alimento("Salmão", 25, 0, 13, 100);
        Alimento atum = new Alimento("Atum", 30, 0, 1, 100);
        Alimento iogurte = new Alimento("Iogurte", 3, 4, 1, 100);
        
        
        //GORDURAS
        Alimento óleoDeCoco = new Alimento("Óleo de Coco", 0, 0, 100, 100);
        Alimento nozes = new Alimento("Nozes", 15, 14, 65, 100);
        Alimento sementeDeChia = new Alimento("Semente de Chia", 17, 43, 31, 100);
        Alimento azeiteDeOliva = new Alimento("Azeite de Oliva", 0, 0, 100, 100);
        Alimento bacon = new Alimento("Bacon", 13, 0, 42, 100);
        Alimento chocolateAmargo = new Alimento("Chocolate Amargo", 5, 46, 35, 100);
        Alimento maionese = new Alimento("Maionese", 0, 32, 75, 100);
        Alimento amêndoas = new Alimento("Amêndoas", 21, 22, 49, 100);
        Alimento cocoRalado = new Alimento("Coco Ralado", 3, 15, 66, 100);
        
        
        
        
    }
    
    //ADD MEMORY
 public static void armazenarAlimento(Alimento alimento)
    {
        int i;
        for(i=0; BancoDeAlimento[i] != null; i++){}
        
        if(i < BancoDeAlimento.length)
            BancoDeAlimento[i] = alimento;
        else
            System.out.println("Espaço cheio");
                    
    }

}public class AlimentoDao {
    
    
    //Adiconar Alimentos
    
    //Remover Alimentos
    
    //Popular Alimentos
    public void popular()
    {
        //CARBOIDRATOS
        Alimento arroz = new Alimento("Arroz", 2, 45, 1, 100);
        Alimento feijao = new Alimento("Feijão", 7, 20, 1, 100);
        Alimento batata = new Alimento("Batata", 2, 20, 0, 100);
        Alimento macarrão = new Alimento("Macarrão", 12, 25, 2, 100);
        Alimento pão = new Alimento("Pão", 9, 49, 2, 100);
        Alimento aipim = new Alimento("Aipim (Mandioca)", 1, 38, 0, 100);
        Alimento abóbora = new Alimento("Abóbora", 1, 7, 0, 100);
        Alimento banana = new Alimento("Banana", 1, 23, 0, 100);
        Alimento laranja = new Alimento("Laranja", 1, 8, 0, 100);
        Alimento abacaxi = new Alimento("Abacaxi", 0, 13, 0, 100);
        Alimento açaí = new Alimento("Açaí", 2, 8, 4, 100);
        Alimento manga = new Alimento("Manga", 0, 14, 0, 100);
        Alimento beterraba = new Alimento("Beterraba", 1, 10, 0, 100);
        Alimento milho = new Alimento("Milho", 3, 21, 2, 100);
        Alimento lentilha = new Alimento("Lentilha", 9, 20, 1, 100);
        
        //PROTEINAS
        Alimento frango = new Alimento("Frango", 27, 0, 3, 100);
        Alimento carneBoi = new Alimento("Carne de Boi", 31, 0, 3, 100);
        Alimento carnePorco = new Alimento("Carne de Porco", 27, 0, 12, 100);
        Alimento peixe = new Alimento("Peixe", 20, 0, 5, 100);
        Alimento camarão = new Alimento("Camarão", 20, 1, 1, 100);
        Alimento ovo = new Alimento("Ovo", 6, 1, 5, 100);
        Alimento queijo = new Alimento("Queijo", 25, 1, 33, 100);
        Alimento abacate = new Alimento("Abacate", 2, 9, 14, 100);
        Alimento amendoim = new Alimento("Amendoim", 25, 16, 49, 100);
        Alimento salmão = new Alimento("Salmão", 25, 0, 13, 100);
        Alimento atum = new Alimento("Atum", 30, 0, 1, 100);
        Alimento iogurte = new Alimento("Iogurte", 3, 4, 1, 100);
        
        
        //GORDURAS
        Alimento óleoDeCoco = new Alimento("Óleo de Coco", 0, 0, 100, 100);
        Alimento nozes = new Alimento("Nozes", 15, 14, 65, 100);
        Alimento sementeDeChia = new Alimento("Semente de Chia", 17, 43, 31, 100);
        Alimento azeiteDeOliva = new Alimento("Azeite de Oliva", 0, 0, 100, 100);
        Alimento bacon = new Alimento("Bacon", 13, 0, 42, 100);
        Alimento chocolateAmargo = new Alimento("Chocolate Amargo", 5, 46, 35, 100);
        Alimento maionese = new Alimento("Maionese", 0, 32, 75, 100);
        Alimento amêndoas = new Alimento("Amêndoas", 21, 22, 49, 100);
        Alimento cocoRalado = new Alimento("Coco Ralado", 3, 15, 66, 100);
        
        
        
        
    }
    


}
