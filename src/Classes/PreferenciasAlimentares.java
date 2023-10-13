/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Lukas
 */
public class PreferenciasAlimentares {
    
    private Alimento[] fontesProteina;
    private Alimento[] fontesCarboidrato;
    private Alimento[] fontesGordura;
    private int contadorProteina;
    private int contadorCarboidrato;
    private int contadorGordura;
    
    private int tamanhoMaximo = 10;

    public PreferenciasAlimentares(int tamanhoMaximo) {
        fontesProteina = new Alimento[tamanhoMaximo];
        fontesCarboidrato = new Alimento[tamanhoMaximo];
        fontesGordura = new Alimento[tamanhoMaximo];
        contadorProteina = 0;
        contadorCarboidrato = 0;
        contadorGordura = 0;
    }


    public void adicionarAlimento(Alimento alimento) {
        if (alimento.getProteina() >= alimento.getCarboidrato() && alimento.getProteina() >= alimento.getGordura()) {
            adicionarAlimentoFonteProteina(alimento);
        } else if (alimento.getCarboidrato() >= alimento.getProteina() && alimento.getCarboidrato() >= alimento.getGordura()) {
            adicionarAlimentoFonteCarboidrato(alimento);
        } else {
            adicionarAlimentoFonteGordura(alimento);
        }
    }

    // Métodos para adicionar alimentos nas fontes de proteína, carboidrato e gordura
    public void adicionarAlimentoFonteProteina(Alimento alimento) {
        if (contadorProteina < fontesProteina.length) {
            fontesProteina[contadorProteina] = alimento;
            contadorProteina++;
        }
    }

    public void adicionarAlimentoFonteCarboidrato(Alimento alimento) {
        if (contadorCarboidrato < fontesCarboidrato.length) {
            fontesCarboidrato[contadorCarboidrato] = alimento;
            contadorCarboidrato++;
        }
    }

    public void adicionarAlimentoFonteGordura(Alimento alimento) {
        if (contadorGordura < fontesGordura.length) {
            fontesGordura[contadorGordura] = alimento;
            contadorGordura++;
        }
    }
    
    
    //Metodo para mostrar os alimentos registrados nas preferencias
     public void mostrarAlimentosNasFontes() {
        System.out.println("Fonte de Proteína:");
        for (int i = 0; i < contadorProteina; i++) {
            Alimento alimento = fontesProteina[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }

        System.out.println("Fonte de Carboidrato:");
        for (int i = 0; i < contadorCarboidrato; i++) {
            Alimento alimento = fontesCarboidrato[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }

        System.out.println("Fonte de Gordura:");
        for (int i = 0; i < contadorGordura; i++) {
            Alimento alimento = fontesGordura[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }
    }
    
    
}
