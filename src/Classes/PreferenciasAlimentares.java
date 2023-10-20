/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author Lukas
 */
public class PreferenciasAlimentares {
    private int id;
    
    private Alimento[] fontesProteina;
    private Alimento[] fontesCarboidrato;
    private Alimento[] fontesGordura;
    private int contadorProteina;
    private int contadorCarboidrato;
    private int contadorGordura;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    
    private int tamanhoMaximo = 10;

    public PreferenciasAlimentares(int tamanhoMaximo, int idUsuario) {
        //data de criação
         setDataCriacao(LocalDate.now());
         
         this.id = idUsuario;
        fontesProteina = new Alimento[tamanhoMaximo];
        fontesCarboidrato = new Alimento[tamanhoMaximo];
        fontesGordura = new Alimento[tamanhoMaximo];
        contadorProteina = 0;
        contadorCarboidrato = 0;
        contadorGordura = 0;
    }

    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }

    public void adicionarAlimento(Alimento alimento) {
        atualizarDataModificacao();
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
        atualizarDataModificacao();
        if (contadorProteina < fontesProteina.length) {
            fontesProteina[contadorProteina] = alimento;
            contadorProteina++;
        }
    }

    public void adicionarAlimentoFonteCarboidrato(Alimento alimento) {
        atualizarDataModificacao();
        if (contadorCarboidrato < fontesCarboidrato.length) {
            fontesCarboidrato[contadorCarboidrato] = alimento;
            contadorCarboidrato++;
        }
    }

    public void adicionarAlimentoFonteGordura(Alimento alimento) {
        atualizarDataModificacao();
        if (contadorGordura < fontesGordura.length) {
            fontesGordura[contadorGordura] = alimento;
            contadorGordura++;
        }
    }
    
    
    //Metodo para mostrar os alimentos registrados nas preferencias
     public void mostrarAlimentosNasFontes() {
        System.out.println("Fonte de Proteína:");
        for (int i = 0; fontesProteina[i] != null && i < contadorProteina; i++) {
            Alimento alimento = fontesProteina[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }

        System.out.println("Fonte de Carboidrato:");
        for (int i = 0; fontesCarboidrato[i] != null && i < contadorCarboidrato; i++) {
            Alimento alimento = fontesCarboidrato[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }

        System.out.println("Fonte de Gordura:");
        for (int i = 0; fontesGordura[i] != null && i < contadorGordura; i++) {
            Alimento alimento = fontesGordura[i];
            System.out.println("Nome: " + alimento.getNome());
            System.out.println("Proteína: " + alimento.getProteina());
            System.out.println("Carboidrato: " + alimento.getCarboidrato());
            System.out.println("Gordura: " + alimento.getGordura());
            System.out.println();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    private void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

        
}
