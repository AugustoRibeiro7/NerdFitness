/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import classes.Pessoa;

/**
 *
 * @author gutom
 */
public class PessoaDao {
    
    
    public PessoaDao()
    {
        populaPessoas();
    }
    
    private void populaPessoas()
    {
        Pessoa p1 = new Pessoa();
        p1.setNome("Admin");
        p1.setLogin("adm");
        p1.setSenha("123");
        p1.setNascimento("20/05/2000");
        p1.setSexo("masc");
        p1.setTipoUsuario("comum");
        armazenarPessoa(p1);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Luk");
        p2.setLogin("Dragon");
        p2.setSenha("peixe");
        p2.setNascimento("01/01/1985");
        p2.setSexo("masc");
        p2.setTipoUsuario("atleta");
        armazenarPessoa(p2);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Silvia");
        p3.setLogin("Silvia");
        p3.setSenha("abc");
        p3.setSexo("fem");
        p3.setNascimento("30/12/1995");
        p3.setTipoUsuario("comum");
        armazenarPessoa(p3);
    }
    
    
    private static Pessoa clientes[] = new Pessoa[10];

    public static Pessoa getClientes(int i) {
        return clientes[i];
    }
    
    
    
    public static void armazenarPessoa(Pessoa p)
    {
        int i;
        for(i=0; clientes[i] != null; i++){}
        
        if(i < clientes.length)
        {
            System.out.println("Usuario cadastrado!");
            clientes[i] = p;
        }  
        else
            System.out.println("Espaço cheio");
                    
    }
    
    
    public static int verifica_usuario(String login, String senha)
    {
        /*
        laço sem codigo pois ele segue a logica de rodar se o nome for diferente do
        vetor que armazena a informação, então se for igual, o laço para e ele é pego pelo if,
        ja se nao for, ele roda ate o final e retorna false
        */
        
        int i;
        for(i=0; PessoaDao.clientes[i] != null && !login.equals(PessoaDao.clientes[i].getLogin()) && i < PessoaDao.clientes.length; i++){}
        
        if (PessoaDao.clientes[i] != null)
        {
            if(login.equals(PessoaDao.clientes[i].getLogin()))
            {
                if(senha.equals(PessoaDao.clientes[i].getSenha()))
                {
                    return i;
                }
                return -1;
            }
        }
        return -2;
    }
}

  