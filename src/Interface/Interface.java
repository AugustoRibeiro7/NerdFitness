/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Classes.AvaliacaoFisica;
import Classes.AvaliacaoFisicaDao;
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
            
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        p.setNascimento(scan.nextLine());
        
        System.out.print("Usuario: ");
        p.setLogin(scan.nextLine());

        System.out.print("Senha: ");
        p.setSenha(scan.nextLine());
         
        //funçao verefica se a conta ja existe
        if(PessoaDao.verifica_usuario(p.getLogin(), p.getSenha()) != 0)
        {
            //avisa a existencia do usuario
            System.out.println("Conta já cadastrada!");
            
            //exclui objeto
            p = null;
        }
        else
        {
            System.out.println("Usuario cadastrado!");
            //armazenar na memoria
            PessoaDao.armazenarPessoa(p);
        }
        
    }
    
    //METODO PARA GERAR A AVALIAÇÃO FISICA
    private void avaliacao_fisica(Pessoa usuario)
    {
        System.out.println("""
                           ==Bem vindo a sua Avaliação Fisica==
                             \n Forneça as seguintes informações:
                                                             """);
        
        System.out.print("Peso (kg): ");
        double peso = Double.parseDouble(scan.nextLine());
        
        System.out.print("Altura(cm): ");
        double altura = Double.parseDouble( scan.nextLine());
        
        System.out.print("Pescoço(cm): ");
        double pescoco = Double.parseDouble(scan.nextLine());
        
        System.out.print("Cintura(cm): ");
        double cintura = Double.parseDouble(scan.nextLine());
        
        System.out.print("Quadril(cm): ");
        double quadril = Double.parseDouble(scan.nextLine());
        
        System.out.print("""
                           Com que frequencia voce pratica esportes?
                           1 - sedentário (pouco ou nenhum exercício)
                           2 - levemente ativo (exercício leve 1 a 3 dias por semana)
                           3 - moderadamente ativo (exercício moderado 6 a 7 dias por semana)
                           4 - muito ativo (exercício intenso todos os dias ou exercício duas vezes ao dia)
                           5 - extra ativo (exercício muito difícil, treinamento ou trabalho físico)
                         
                           Escolha a opcao..: """);
        int taxa = Integer.parseInt(scan.nextLine());
        
        //criar objeto ja recebendo todos os valores no construtor
        AvaliacaoFisica avaliacao = new AvaliacaoFisica(usuario, peso, altura, pescoco, cintura, quadril, taxa);
        
        //chamar método para guardar avaliacao no DAO
         AvaliacaoFisicaDao.armazenaDao((int) usuario.getId(), avaliacao);
                
    }
    
    private void gerar_dietas()
    {
        System.out.println("""
                           Digite o objetivo da sua dieta entre as opções:"
                            DIMINUIR O PESO
                            MANTER O PESO
                            AUMENTAR O PESO
                            Digite aqui: """);
        String objetivo = scan.nextLine();
    }
    
    
    
    //METODO PARA RODAR A INTERFACE DA PLATAFORMA
    private void tela_inicial()
    {
        int x;
        do
        {
            System.out.print("""
                           Login (0) 
                           Cadastrar (1)
                           Fechar programa (2)
                             
                             Escolha sua opcao: """);
            x = Integer.parseInt(scan.nextLine());

            switch (x) {
                case 0:
                    System.out.print("usuario: ");
                    String user = scan.nextLine();
                    
                    System.out.print("Senha: ");
                    String senha = scan.nextLine();
                    
                    int i = PessoaDao.verifica_usuario(user, senha);
                    
                    if(i < 1) //nao logado
                    {
                        System.out.println("Usuário não encontrado!");
                    }
                    else //logado
                    {
                        System.out.println("Usuário Logado!");
                        
                        //recebendo usuario logado
                        Pessoa usuario_log = PessoaDao.getClientes(i); 
                        
                        int opc;
                        do
                        {
                            System.out.println("=====NERDFITNESS===== \n");
                            
                            System.out.print("""
                           Avaliação Fisica (0) 
                           Gerar Dieta (1)
                           Sair da conta (2)
                                             
                            Escolha sua opcao: """);
                            opc = Integer.parseInt(scan.nextLine());
                            
                            switch (opc) {
                                case 0:
                                    avaliacao_fisica(usuario_log);
                                    break;
                                case 1:
                                    if(AvaliacaoFisicaDao.getClientes((int) usuario_log.getId()) == null)
                                    {
                                        System.out.println("Erro! Realize a Avaliacao Fisica primeiro.");
                                    }
                                    else
                                    {
                                        System.out.println("Dieta Gerada!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Usuario desconectado!");
                                    break;
                                
                            }
                        }while(opc != 2);
                        
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
