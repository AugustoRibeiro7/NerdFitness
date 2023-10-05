/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nerdfitness;

import java.util.Scanner;

/**
 *
 * @author gutom
 */
public class Interface {
    Scanner scan = new Scanner(System.in);
    
    
    public void criaPessoa()
    {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
         
        //funçao verefica se ja tem o nome
        
        
        
    }
    
    public boolean verefica_usuario(String nome)
    {
        for(int i=0; !nome.equals(PessoaDao.clientes[i]) || i != PessoaDao.clientes.length-1; i++)
        {
            
        }
    }
}
