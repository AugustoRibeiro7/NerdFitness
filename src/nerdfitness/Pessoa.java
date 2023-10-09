/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

import java.time.LocalDate;

/**
 *
 * @author gutom
 */
public class Pessoa {
    
    
    // ID E QUANTIDADE DE CONTAS
    private static long quant_pessoas;
    private long id;
    
    //VARIAVEIS PARA OS DADOS DE PESSOA
     private String nome;
     private String sexo;
     private LocalDate nascimento;
     private String login;
     private String senha;
     private String tipoUsuario;
     private LocalDate dataCriacao;
     private LocalDate dataModificacao;
     
     // CONSTRUTOR
     public Pessoa()
     {
         //controle do id
         Pessoa.quant_pessoas++;
        this.id = Pessoa.quant_pessoas;
        
        //data de criação
        this.dataCriacao = LocalDate.now();
     }         
     
     //GET PARA PEGAR O ID

    public long getId() {
        return id;
    }
    
    //GET PARA PEGAR A QUANTIDADE DE CONTAS CRIADAS

    public static long getQuant_pessoas() {
        return quant_pessoas;
    }
    
    //GETS E SETS DAS VARIAVEIS DE PESSOA

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    
    
    
    
    
}
