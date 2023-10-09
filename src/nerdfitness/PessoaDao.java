/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

/**
 *
 * @author gutom
 */
public class PessoaDao {
    
    
    public PessoaDao()
    {
        populaPessoas();
    }
    
    public void populaPessoas()
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
    
    
    static Pessoa clientes[] = new Pessoa[10];
    public static void armazenarPessoa(Pessoa p)
    {
        int i;
        for(i=0; clientes[i] != null; i++){}
        
        if(i < clientes.length)
            clientes[i] = p;
        else
            System.out.println("Espaço cheio");
                    
    }
}
