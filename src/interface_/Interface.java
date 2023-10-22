/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_;

import classes.Alimento;
import classes.AlimentoDao;
import classes.AvaliacaoFisica;
import classes.AvaliacaoFisicaDao;
import classes.Dieta;
import classes.DietaDao;
import classes.PessoaDao;
import classes.Pessoa;
import classes.PreferenciaalimentarDao;
import classes.PreferenciasAlimentares;

import java.util.Scanner;



public class Interface {
    
    //scan para receber os dados
    Scanner scan = new Scanner(System.in);
    
    //construtor
    public Interface()
    {
        tela_inicial();
    }
    
    
    
    
    // ====== METODO PARA CRIAR PESSOAS ==========
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
        
        System.out.print("Tipo de usuário (atleta ou comum): ");
        p.setTipoUsuario(scan.nextLine());
        
        System.out.print("Usuario: ");
        p.setLogin(scan.nextLine());

        System.out.print("Senha: ");
        p.setSenha(scan.nextLine());
         
        //funçao verefica se a conta ja existe
        if(PessoaDao.verifica_usuario(p.getLogin(), p.getSenha()) != 2)
        {
            //avisa a existencia do usuario
            System.out.println("Conta já cadastrada!");
            
            //exclui objeto
            p = null;
        }
        else
        {
            //armazenar na memoria
            PessoaDao.armazenarPessoa(p);
        }
        
    }
    
    // ===== METODO PARA GERAR A AVALIAÇÃO FISICA ==============
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
    
    //=========== DIETAS ================
    
    private void calculo_dieta(Pessoa pessoa, AvaliacaoFisica avaliacao)
    {
        System.out.println("""
                           Digite o objetivo da sua dieta entre as opções:"
                            DIMINUIR O PESO
                            MANTER O PESO
                            AUMENTAR O PESO
                            Digite aqui: """);
        String objetivo = scan.nextLine();
        
        int tipo;
        do
        {
            System.out.println("""
                           Digite o objetivo da sua dieta entre as opções:"
                            1 - EQUILIBRADA
                            2- LOW CARB
                            3 - CETOGÊNICA
                            Digite aqui: """);
            tipo = Integer.parseInt(scan.nextLine());
            
        }while(tipo > 3 || tipo < 1);
        
        System.out.print("Quantas refeições por dia voce gostaria de fazer..: ");
        int quant_refeicoes = Integer.parseInt(scan.nextLine());
        
        //CRIAR OBJETO DIETA
        Dieta dieta = new Dieta(objetivo, tipo, pessoa, avaliacao, quant_refeicoes);
    }
    
    private void preferencias(int idUsuario)
    {
        System.out.print("""
                Voce gostaria de escolher alguns alimentos de sua preferencia para ter na dieta?"
                (sim) ou (nao)...: """);
        String escolha = scan.nextLine();
        
        if(escolha.equals("sim"))
        {
            System.out.print("Quantos alimentos gostaria de escolher?..: ");
            int quant = Integer.parseInt(scan.nextLine());
            
            PreferenciasAlimentares preferencias = new PreferenciasAlimentares(quant, idUsuario);
            
            //laço para receber os alimentos
            for(int i=0; i < quant; i++)
            {
                String opc="sim";
                do
                {
                    opc = "sim";
                    System.out.print("Digite o nome do alimento..; ");
                    String nome = scan.nextLine();

                    int num = AlimentoDao.buscaAlimento(nome);
                    
                    
                    if(num < 0) //Não há o alimento armazenado previamente
                    {
                        //verificando se o usuario deseja armazenar o novo alimento ou nao
                        System.out.print("Não há este alimento em nosso banco de dados, gostaria de adiciona-lo? (sim) ou (nao)...: ");
                        opc = scan.nextLine();
                          
                        if(opc.equals("sim")) //realizar o armazenamento do novo alimento
                        {
                            System.out.print("Digite quantas gramas de proteínas o/a "+nome+" tem em uma porção de 100g..: ");
                            double proteina = Double.parseDouble(scan.nextLine());
                            
                            System.out.print("Digite quantas gramas de carboidratos o/a "+nome+" tem em uma porção de 100g..: ");
                            double carboidrato = Double.parseDouble(scan.nextLine());
                            
                            System.out.print("Digite quantas gramas de gourdura o/a "+nome+" tem em uma porção de 100g..: ");
                            double gordura= Double.parseDouble(scan.nextLine());
                            
                            //alimento novo criado
                            Alimento novoAlimento = new Alimento(nome, proteina, carboidrato, gordura);
                            
                            //alimento salvo nas preferencias do usuario
                            preferencias.adicionarAlimento(novoAlimento);
                            System.out.println("Alimento adicionado no armazenamento e salvo em suas preferencias");
                        }
                    }
                    else //O alimento já está previamente armazenado
                    {
                        //alimento salvo nas preferencias do usuario
                        preferencias.adicionarAlimento(AlimentoDao.getBd_alimento(num));
                        System.out.println("Alimento salvo em suas preferencias");
                    }
                }while(opc.equals("nao")); //condição para o usuario escolher outro alimento, caso não queira adicionar o novo
            }
            
            //SALVAR PREFERENCIA NO DAO
            PreferenciaalimentarDao.armazenaPreferencia(preferencias);
            
            //MOSTRAR PREFERENCIAS
            PreferenciaalimentarDao.getBd_preferencias(idUsuario).mostrarAlimentosNasFontes();
        }

    }
    
    private void calculo_refeicao()
    {
        
    }
    
    
    private void gerar_dietas(Pessoa pessoa, AvaliacaoFisica avaliacao)
    {
        calculo_dieta(pessoa, avaliacao);
        preferencias((int) pessoa.getId());
        
        
    }
    
    
    
    //==== METODO PARA RODAR A INTERFACE DA PLATAFORMA =================
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
                    
                    if(i < 0) //nao logado
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
                                    if(AvaliacaoFisicaDao.getAvaliacoes((int) usuario_log.getId()) == null)
                                    {
                                        System.out.println("Erro! Realize a Avaliacao Fisica primeiro.");
                                    }
                                    else
                                    {
                                        gerar_dietas(usuario_log, AvaliacaoFisicaDao.getAvaliacoes((int) usuario_log.getId()));
                                        
                                        
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
