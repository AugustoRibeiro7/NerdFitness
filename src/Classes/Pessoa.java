/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
     
     //formato para datas
     private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
     // CONSTRUTOR
     public Pessoa()
     {
         //controle do id
         Pessoa.quant_pessoas++;
        this.id = Pessoa.quant_pessoas;
        
        //data de criação
         setDataCriacao(LocalDate.now());
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
    
    //GETS E SETS DAS VARIAVEIS DE PESSOA

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        atualizarDataModificacao();
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        atualizarDataModificacao();
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        atualizarDataModificacao();
        this.nascimento = LocalDate.parse(nascimento, dtf);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        atualizarDataModificacao();
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        atualizarDataModificacao();
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        atualizarDataModificacao();
        this.tipoUsuario = tipoUsuario;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        atualizarDataModificacao();
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }
    
    
    
    
    
}
