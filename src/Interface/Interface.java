/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Classes.PessoaDao;
import Classes.Pessoa;

import java.util.Scanner;


/**
 *
 * @author gutom
 */
public class Interface {
    Scanner scan = new Scanner(System.in);
    
    //construtor
    public Interface()
    {
        tela_inicial();
    }
    
    
    
    
    //METODO PARA CRIAR PESSOAS
    public void criaPessoa()
    {
        //cria o novo usuario
        Pessoa p = new Pessoa();
        
        System.out.print("Nome: ");
        p.setNome(scan.nextLine());  
        
        System.out.print("Sexo (masc ou fem): ");
        p.setSexo(scan.nextLine());
            
        System.out.print("Data de nascimento: ");
        p.setNascimento(scan.nextLine());
        
        System.out.print("Login: ");
        p.setLogin(scan.nextLine());

        System.out.print("Senha: ");
        p.setSenha(scan.nextLine());
         
        //funçao verefica se a conta ja existe
        if(PessoaDao.verifica_usuario(p.getLogin(), p.getSenha()) == 1 || PessoaDao.verifica_usuario(p.getSenha(), p.getSenha()) == 2)
        {
            //avisa a existencia do usuario
            System.out.println("Conta já cadastrada!");
            
            //exclui objeto
            p = null;
        }
        else
        {
            System.out.println("confirma");
            //armazenar na memoria
            PessoaDao.armazenarPessoa(p);
        }
        
    }
    
    //METODO PARA GERAR A AVALIAÇÃO FISICA
    private void avaliacao_fisica()
    {
        System.out.println("""
                           ==Bem vindo a sua Avaliação Fisica==
                             \n Forneça as seguintes informações:
                                                             """);
        System.out.print("Idade: ");
        
        System.out.print("Peso: ");
        
        System.out.print("Altura: ");
        
        System.out.print("Pescoço: ");
        
        System.out.print("Cintura: ");
        
        System.out.print("Quadril: ");
    }
    
    
    
    //METODO PARA RODAR A INTERFACE DA PLATAFORMA
    private void tela_inicial()
    {
        int x;
        do
        {
            System.out.println("""
                           Login (0) 
                           Cadastrar (1)
                           Fechar programa (2)""");
            x = Integer.parseInt(scan.nextLine());

            switch (x) {
                case 0:
                    System.out.print("Login: ");
                    String user = scan.nextLine();
                    
                    System.out.print("Senha: ");
                    String senha = scan.nextLine();
                    
                    if(PessoaDao.verifica_usuario(user, senha) != 2)
                    {
                        System.out.println("Usuário não encontrado!");
                    }
                    else
                    {
                        System.out.println("Usuário Logado!");
                    }   
                    break;
                case 1:
                    criaPessoa();
                    break;
                case 2:
                    System.out.println("Programa Encerrado");
                    break;
            }
        }while(x != 2);
        
    }
    
    
}
