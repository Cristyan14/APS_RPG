package aps_rpg;

import java.util.Scanner;

public class Fase_2 {
	public void executarFase2() {
	     System.out.println("=== Fase 2: Remoção de Obstruções ===");
	     System.out.println("Você está enfrentando a gangue dos Grandes Roedores, que estão bloqueando o rio com suas obstruções.");
	     System.out.println("Você precisa remover essas obstruções para restaurar o fluxo natural do rio.");

	     int progresso = 0;
	     int energia = 100; 
	     Scanner scanner = new Scanner(System.in);
	     
	     while (progresso < 100) {
	         System.out.println("\nProgresso: " + progresso + "%");
	         System.out.println("Energia: " + energia);

	         if (Math.random() < 0.3) { 
	             System.out.println("\nCuidado! Detritos flutuantes se aproximando!");
	             System.out.println("Desvie deles para não perder energia.");
	             if (Math.random() < 0.5) { 
	                 System.out.println("Você conseguiu desviar dos detritos!");
	             } else {
	                 System.out.println("Você foi atingido pelos detritos!");
	                 energia -= 20; 
	             }
	         }

	         System.out.println("\nEscolha sua ação:");
	         System.out.println("1. Remover detritos (custo de energia: 10)");
	         System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
	         System.out.print("Escolha: ");
	         int escolha = scanner.nextInt();

	         switch (escolha) {
	             case 1:
	                 
	                 if (energia >= 10) {
	                    
	                     progresso += 10;
	                     System.out.println("Você removeu os detritos com sucesso!");
	                     energia -= 10;
	                 } else {
	                     System.out.println("Você não tem energia suficiente para realizar esta ação!");
	                 }
	                 break;
	             case 2:
	                 if (energia >= 30) {
	                     System.out.println("Você está enfrentando os Grandes Roedores!");
	                     if (Math.random() < 0.7) { 
	                         System.out.println("Você derrotou os Grandes Roedores!");
	                         progresso += 40;
	                     } else {
	                         System.out.println("Os Grandes Roedores foram muito fortes, você foi derrotado!");
	                         energia -= 20;
	                     }
	                     energia -= 30; 
	                 } else {
	                     System.out.println("Você não tem energia suficiente para enfrentar os Grandes Roedores!");
	                 }
	                 break;
	             default:
	                 System.out.println("Escolha inválida! Tente novamente.");
	         }

	         if (progresso >= 100) {
	             System.out.println("\nParabéns! Você removeu todas as obstruções e restaurou o fluxo do rio!");
	             break;
	         }

	         if (energia <= 0) {
	             System.out.println("\nVocê ficou sem energia e não pode mais continuar.");
	             System.out.println("Você falhou em sua missão de remover as obstruções do rio.");
	             break;
	         }
	     }
	 }

}
