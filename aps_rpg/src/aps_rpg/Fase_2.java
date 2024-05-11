package aps_rpg;

import java.util.InputMismatchException;
import java.util.Scanner;

import aps_rpg_Textos.Texto_Fase_01;
import aps_rpg_Textos.Texto_Fase_02;

public class Fase_2 extends Personagem_Principal {
	
	public Fase_2(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	Texto_Fase_02 texto_Fase_02 = new Texto_Fase_02(nome);
	
	public int verificar() {
		int tecla = 1;
		  	while(tecla != 0 ) {                   
             System.out.println("--------------------------");
             System.out.println("Digite 0 para continuar...");          
             System.out.println("--------------------------");
             int teclaa = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
             if(teclaa == 0) {
          	   tecla = teclaa;
             }                   
              
           }
		  	return tecla;
	}
	public void pausaBreve() {
	    try {
	        Thread.sleep(2000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
    public void executarFase2() {
    	System.out.println(texto_Fase_02.txt01);
    	pausaBreve();
        verificar();
        pausaBreve();
        System.out.println(texto_Fase_02.txt02);
        pausaBreve();
        verificar();
        pausaBreve();
        System.out.println(texto_Fase_02.txt03);
        pausaBreve();
        verificar();
        pausaBreve();        

        int progresso = 0;
        int energia = 100;
        Scanner scanner = new Scanner(System.in);
        
        while (progresso < 100) {
            System.out.println("=============== D E S A F I O ===============");
            System.out.println("Progresso: " + progresso + "%");
            System.out.println("Energia: " + energia);
            System.out.println("Escolha sua ação:");
            System.out.println("1. Remover detritos (custo de energia: 10)");
            System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
            System.out.print("Escolha: ");

            // Verifica se há detritos flutuantes
            if (Math.random() < 0.6) {
            	System.out.println("--------------------------");
                System.out.println("Cuidado! Detritos flutuantes se aproximando!");
                System.out.println("--------------------------");
                pausaBreve();
                System.out.println("--------------------------");
                System.out.println("Desvie deles para não perder energia.");
                System.out.println("--------------------------");
                pausaBreve();
                System.out.println("--------------------------");
                System.out.println("[1] Tentar desviar");
                System.out.println("--------------------------");

                // Tenta desviar dos detritos
                int escolhaDesvio = 0;
                try {
                    escolhaDesvio = scanner.nextInt();
                } catch (InputMismatchException e) {
                	System.out.println("--------------------------");
                    System.out.println("Por favor, insira um número válido.");
                    System.out.println("--------------------------");
                    scanner.next(); // Limpa o buffer do scanner
                    continue;
                }

                if (escolhaDesvio == 1 && Math.random() < 0.5) {
                	System.out.println("--------------------------");
                    System.out.println("Você conseguiu se desviar dos detritos!");
                    System.out.println("--------------------------");
                    pausaBreve();
                    System.out.println("=============== D E S A F I O ===============");
                    System.out.println("Progresso: " + progresso + "%");
                    System.out.println("Energia: " + energia);
                    System.out.println("\nEscolha sua ação:");
                    System.out.println("1. Remover detritos (custo de energia: 10)");
                    System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
                    System.out.print("Escolha: ");

                } else {
                	System.out.println("--------------------------");
                    System.out.println("Você foi atingido pelos detritos!");
                    System.out.println("--------------------------");
                    pausaBreve();
                    energia -= 10; // Reduz a energia perdida
                    System.out.println("=============== D E S A F I O ===============");
                    System.out.println("Progresso: " + progresso + "%");
                    System.out.println("Energia: " + energia);
                    System.out.println("\nEscolha sua ação:");
                    System.out.println("1. Remover detritos (custo de energia: 10)");
                    System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
                    System.out.print("Escolha: ");

                }
            }
            

            int escolhaAcao = 0;
            try {
                escolhaAcao = scanner.nextInt();
            } catch (InputMismatchException e) {
            	 pausaBreve();
                 System.out.println("--------------------------");
                System.out.println("Por favor, insira um número válido.");
                System.out.println("--------------------------");
                scanner.next(); // Limpa o buffer do scanner
                continue;
            }

            switch (escolhaAcao) {
                case 1:
                    if (energia >= 10) {
                        progresso += 10;
                        pausaBreve();
                        System.out.println("--------------------------");
                        System.out.println("Você removeu os detritos com sucesso!");
                        System.out.println("--------------------------");
                        pausaBreve();
                        energia -= 10;
                    } else {
                    	pausaBreve();
                    	System.out.println("--------------------------");
                        System.out.println("Você não tem energia suficiente para realizar esta ação!");
                        System.out.println("--------------------------");
                        pausaBreve();
                    }
                    break;
                case 2:
                    if (energia >= 30) {
                    	pausaBreve();
                    	System.out.println("--------------------------");
                        System.out.println("Você está enfrentando os Grandes Roedores!");
                        System.out.println("--------------------------");
                        pausaBreve();
                        progresso += 40;
                        energia -= 30; // Ajusta a energia perdida
                    } else {
                    	pausaBreve();
                    	System.out.println("--------------------------");
                        System.out.println("Você não tem energia suficiente para enfrentar os Grandes Roedores!");
                        System.out.println("--------------------------");
                        pausaBreve();
                    }
                    break;
                default:
                	pausaBreve();
                	System.out.println("--------------------------");
                    System.out.println("Escolha inválida! Tente novamente.");
                    System.out.println("--------------------------");
                    pausaBreve();
            }

            // Verifica se o jogador completou a fase
            if (progresso >= 100) {
            	System.out.println("--------------------------");
                System.out.println("Parabéns! Você removeu todas as obstruções e restaurou o fluxo do rio!");
                System.out.println("--------------------------");
                pausaBreve();
                System.out.println(texto_Fase_02.txt04);
                pausaBreve();
                verificar();
                pausaBreve();
                System.out.println(texto_Fase_02.txt05);
                pausaBreve();
                verificar();
                pausaBreve();
                break;
            }

            // Verifica se o jogador ficou sem energia
            if (energia <= 0) {
            	pausaBreve();
            	System.out.println("--------------------------");
                System.out.println("Você ficou sem energia e não pode mais continuar.");
                System.out.println("--------------------------");
                pausaBreve();
                System.out.println("--------------------------");
                System.out.println("Você falhou em sua missão de remover as obstruções do rio.");
                System.out.println("--------------------------");
                verificar();
                pausaBreve();
                break;
            }
            
        }
    }
}