/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Pessoa;

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
        p1.setNome("Harry");
        p1.setLogin("Potter");
        p1.setNascimento("20/05/2000");
        p1.setSexo("masculino");
        p1.setSenha("934");
        armazenarPessoa(p1);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("WIsley");
        p2.setLogin("Carro");
        p2.setSenha("Voador");
        p1.setNascimento("01/01/2001");
        p2.setSexo("feminino");
        armazenarPessoa(p2);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Josoares");
        p3.setLogin("Jo");
        p3.setSenha("123");
        p1.setSexo("masculino");
        p1.setNascimento("30/12/1995");
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
            clientes[i] = p;
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
        return 0;
    }
}

  