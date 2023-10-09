/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    
    public boolean verifica_usuario(String nome)
    {
        /*
        laço sem codigo pois ele segue a logica de rodar se o nome for diferente do
        vetor que armazena a informação, então se for igual, o laço para e ele é pego pelo if,
        ja se nao for, ele roda ate o final e retorna false
        */
        
        int i;
        for(i=0; PessoaDao.clientes[i] != null && !nome.equals(PessoaDao.clientes[i].getNome()) && i < PessoaDao.clientes.length; i++){}
        
        if (PessoaDao.clientes[i] != null)
        {
            if(nome.equals(PessoaDao.clientes[i].getNome()))
                return true;
        }
        return false;
    }
    
    
    public void criaPessoa()
    {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
         
        //funçao verefica se ja tem o nome
        if(verifica_usuario(nome))
        {
            //avisa a existencia do usuario
            System.out.println("Usuário já existente!");
        }
        else
        {
            //cria o novo usuario
            Pessoa p = new Pessoa();
            p.setNome(nome);
            
            System.out.print("Sexo: ");
            p.setSexo(scan.nextLine());
            
            //recebendo datas
            
            System.out.print("Data de nascimento: ");
            p.setNascimento(scan.nextLine());
            
            
            System.out.print("Login: ");
            p.setLogin(scan.nextLine());
            
            System.out.print("Senha: ");
            p.setSenha(scan.nextLine());
            
            //armazenar na memoria
            PessoaDao.armazenarPessoa(p);
        }
        
    }
    
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
                    System.out.print("usuario: ");
                    String user = scan.nextLine();
                    if(!verifica_usuario(user))
                    {
                        System.out.println("Usuário já cadastrado");
                    }
                    else
                    {
                        //vereficar senha
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
