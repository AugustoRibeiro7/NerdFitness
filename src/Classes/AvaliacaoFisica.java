/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static java.lang.String.format;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author gutom
 */
public class AvaliacaoFisica {
    
    // ID E QUANTIDADE DE CONTAS
    private static long quant_pessoas;
    private long id;
    
    //VARIAVEIS PARA OS DADOS DA AVALIAÇÃO FISICA
    private Pessoa usuario;
    private double peso, altura, pescoco, cintura, quadril;
    private double IMC, taxaAtivade, TMB, BF, massa_gorda, massa_magra;
    private int idade;
    private LocalDate dataCriacao, dataModificacao;
    
    
    //CONSTRUTOR
    public AvaliacaoFisica(Pessoa usuario, double peso, double altura, double pescoco, double cintura, double quadril, int taxa_ativade)
    {
        //controle do id
         AvaliacaoFisica.quant_pessoas++;
        this.id = AvaliacaoFisica.quant_pessoas;
        
        //data de criação
         setDataCriacao(LocalDate.now());
         
         //chamar métodos
         setUsuario(usuario);
         setIdade(usuario.getNascimento());
         setPeso(peso);
         setAltura(altura);
         setPescoco(pescoco);
         setCintura(cintura);
         setQuadril(quadril);
         calcula_IMC();
         calcula_taxaAtividade(taxa_ativade);
         calcula_TMB(usuario.getSexo());
         calcula_BF(usuario.getSexo());
         calcula_massaGorda();
         calcula_massaMagra();
         
         //metodo para gerar relatorio
         gerar_relatorio();
    }
    
    //GET PARA PEGAR O ID

    public long getId() {
        return id;
    }
    
    //GET PARA PEGAR A QUANTIDADE DE CONTAS CRIADAS

    public static long getQuant_pessoas() {
        return quant_pessoas;
    }
    
    //Atualizar data de modificação
    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDate.now();
    }
    
    
    //METODOS
    
    private void calcula_IMC()
    {
        this.IMC = this.peso / ((this.altura / 100) * (this.altura / 100));
        atualizarDataModificacao();
    }
    
    private void calcula_taxaAtividade(int taxa)
    {
        atualizarDataModificacao();
        switch (taxa) {
            case 1:
                this.taxaAtivade = 1.2; //Sedentários
                break;
            case 2:
                this.taxaAtivade = 1.375; //Levemente ativo
                break;
            case 3:
                this.taxaAtivade = 1.55; //Moderadamente ativo
                break;
            case 4:
                this.taxaAtivade = 1.725; //Altamente ativo
                break;
            case 5:
                this.taxaAtivade =  1.9; //Extremamente ativo
                break;
        }
    }
    
    private void calcula_TMB(String sexo)
    {
        atualizarDataModificacao();
        if("masc".equals(sexo))
        {
            this.TMB = this.taxaAtivade * (66 + ((13.7 * this.peso) + ( 5 * this.altura) - (6.8 * this.idade)));
        }
        else
        {
            this.TMB = this.taxaAtivade * (655 + ((9.6 * this.peso) + (1.8 * this.altura) - (4.7 * this.idade)));
        }
    }
    
    private void calcula_BF(String sexo) //valor do percentual de gordura
    {
        atualizarDataModificacao();
        if("masc".equals(sexo))
        {
            this.BF = 86.010 * Math.log10(this.cintura - this.pescoco) - 70.041 * Math.log10(this.altura) + 36.76;
        }
        else
        {
            this.BF = 163.205 * Math.log10(this.cintura + this.quadril - this.pescoco) - 97.684 * Math.log10(this.altura) - 78.387;

        }
    }
    
    private void calcula_massaGorda()
    {
        atualizarDataModificacao();
        this.massa_gorda = this.peso * (this.BF/100);
    }
    
    private void calcula_massaMagra()
    {
        atualizarDataModificacao();
        this.massa_magra = this.peso - this.massa_gorda;
    }
    
    //GETERS DOS METODOS

    public double getIMC() {
        return IMC;
    }

    public double getTaxaAtivade() {
        return taxaAtivade;
    }

    public double getTMB() {
        return TMB;
    }

    public double getBF() {
        return BF;
    }

    public double getMassa_gorda() {
        return massa_gorda;
    }

    public double getMassa_magra() {
        return massa_magra;
    }
    
    
    //GETERS E SETERS DOS DADOS DO USUARIO

    public Pessoa getUsuario() {
        return usuario;
    }

    private void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
        atualizarDataModificacao();
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        atualizarDataModificacao();
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
        atualizarDataModificacao();
    }

    public double getPescoco() {
        return pescoco;
    }

    private void setPescoco(double pescoco) {
        this.pescoco = pescoco;
        atualizarDataModificacao();
    }

    public double getCintura() {
        return cintura;
    }

    private void setCintura(double cintura) {
        this.cintura = cintura;
        atualizarDataModificacao();
    }

    public double getQuadril() {
        return quadril;
    }

    private void setQuadril(double quadril) {
        this.quadril = quadril;
        atualizarDataModificacao();
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(LocalDate nasc) {
        Period diferenca_tempo = Period.between(nasc, LocalDate.now());
        this.idade = diferenca_tempo.getYears();
        atualizarDataModificacao();
    }
    
    //GETERS E SETERS DAS DATAS DE CRIAÇÁO E MODIFICAÇÃO
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    private void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }
    
    //To String

    @Override
    public String toString() {
        
        return "AvaliacaoFisica atual: " + "IMC= " + format("%.2f", IMC) + ", TMB= " + format("%.2f",TMB) + ", BF= " + format("%.2f",BF) + ", massa_gorda= " + format("%.2f",massa_gorda) + ", massa_magra= " + format("%.2f",massa_magra) + '.';
    }
    
    
    //MÉTODO PARA GERAR RELATORIO FINAL DA AVALIAÇÃO
    public void gerar_relatorio()
    {
        //salvando textos que serão muito utilizados em variaveis
        String ideal = "Voce está com um valor de gordura corporal IDEAL!";
        String bom = "Voce está com um valor de gordura corporal Bom!";
        String normal = "Voce está com um valor de gordura corporal Normal!";
        String elevado = "Voce está com um valor de gordura corporal Elevado!";
        String muito_elevado = "Voce está com um valor de gordura corporal Muito Elevado!";
        
        // mostrando o relatorio
        System.out.println(toString());
        if(this.idade <= 29)
        {
            if(this.usuario.getSexo() == "masc")
            { 
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -11%");
                    
                    if(this.BF < 11)
                        System.out.println(ideal);
                    else if(this.BF <= 13 && this.BF >= 11)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 11% a 13%");
                    
                    if(this.BF <= 13 && this.BF >= 11)
                        System.out.println(ideal);
                }
                if(this.BF <= 20 && this.BF >= 14)
                    System.out.println(normal);
                else if(this.BF <= 23 && this.BF >= 21)
                    System.out.println(elevado);
                else if(this.BF > 23)
                    System.out.println(muito_elevado);
                
                
            }
            else
            {
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -16%");
                    
                    if(this.BF < 16)
                        System.out.println(ideal);
                    else if(this.BF <= 19 && this.BF >= 16)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 16% a 19%");
                    
                    if(this.BF <= 19 && this.BF >= 16)
                        System.out.println(ideal);
                }
                if(this.BF <= 28 && this.BF >= 20)
                    System.out.println(normal);
                else if(this.BF <= 31 && this.BF >= 29)
                    System.out.println(elevado);
                else if(this.BF  > 31)
                    System.out.println(muito_elevado);
            }
        }
        else if(idade <= 39)
        {
            if(this.usuario.getSexo() == "masc")
            { 
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -12%");
                    
                    if(this.BF < 12)
                        System.out.println(ideal);
                    else if(this.BF <= 14 && this.BF >= 12)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 12% a 14%");
                    
                    if(this.BF <= 14 && this.BF >= 12)
                        System.out.println(ideal);
                }
                if(this.BF <= 21 && this.BF >= 15)
                    System.out.println(normal);
                else if(this.BF <= 24 && this.BF >= 22)
                    System.out.println(elevado);
                else if(this.BF > 24)
                    System.out.println(muito_elevado);
                
                
            }
            else
            {
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -17%");
                    
                    if(this.BF < 17)
                        System.out.println(ideal);
                    else if(this.BF <= 20 && this.BF >= 17)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 17% a 20%");
                    
                    if(this.BF <= 20 && this.BF >= 19)
                        System.out.println(ideal);
                }
                if(this.BF <= 29 && this.BF >= 21)
                    System.out.println(normal);
                else if(this.BF <= 32 && this.BF >= 30)
                    System.out.println(elevado);
                else if(this.BF  > 32)
                    System.out.println(muito_elevado);
            }
        }
        else if(idade <= 49)
        {
            if(this.usuario.getSexo() == "masc")
            { 
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -14%");
                    
                    if(this.BF < 14)
                        System.out.println(ideal);
                    else if(this.BF <= 16 && this.BF >= 14)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 14% a 16%");
                    
                    if(this.BF <= 16 && this.BF >= 14)
                        System.out.println(ideal);
                }
                if(this.BF <= 23 && this.BF >= 17)
                    System.out.println(normal);
                else if(this.BF <= 26 && this.BF >= 24)
                    System.out.println(elevado);
                else if(this.BF > 26)
                    System.out.println(muito_elevado);
                
                
            }
            else
            {
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -18%");
                    
                    if(this.BF < 18)
                        System.out.println(ideal);
                    else if(this.BF <= 21 && this.BF >= 18)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 18% a 21%");
                    
                    if(this.BF <= 21 && this.BF >= 18)
                        System.out.println(ideal);
                }
                if(this.BF <= 30 && this.BF >= 22)
                    System.out.println(normal);
                else if(this.BF <= 31 && this.BF >= 33)
                    System.out.println(elevado);
                else if(this.BF  > 33)
                    System.out.println(muito_elevado);
            }
        }
        else //a partir de 50
        {
            if(this.usuario.getSexo() == "masc")
            { 
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -15%");
                    
                    if(this.BF < 15)
                        System.out.println(ideal);
                    else if(this.BF <= 17 && this.BF >= 15)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 15% a 17%");
                    
                    if(this.BF <= 17 && this.BF >= 15)
                        System.out.println(ideal);
                }
                if(this.BF <= 24 && this.BF >= 18)
                    System.out.println(normal);
                else if(this.BF <= 27 && this.BF >= 25)
                    System.out.println(elevado);
                else if(this.BF > 27)
                    System.out.println(muito_elevado);
                
                
            }
            else
            {
                if("atleta".equals(usuario.getTipoUsuario()))
                {
                    System.out.println("Valor de gordura corporal ideal para atleta: -19%");
                    
                    if(this.BF < 19)
                        System.out.println(ideal);
                    else if(this.BF <= 22 && this.BF >= 19)
                        System.out.println(bom);
                }
                else
                {
                    System.out.println("Valor de gordura corporal ideal: 19% a 22%");
                    
                    if(this.BF <= 22 && this.BF >= 19)
                        System.out.println(ideal);
                }
                if(this.BF <= 31 && this.BF >= 23)
                    System.out.println(normal);
                else if(this.BF <= 34 && this.BF >= 32)
                    System.out.println(elevado);
                else if(this.BF  > 34)
                    System.out.println(muito_elevado);
            }
        }
    }
    
}

 