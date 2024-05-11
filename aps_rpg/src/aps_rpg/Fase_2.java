package aps_rpg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fase_2 {
    public void executarFase2() {
        System.out.println("=== Fase 2: Remoção de Obstruções ===");
        System.out.println("Você está enfrentando a gangue dos Grandes Roedores, que estão bloqueando o rio com suas obstruções.");
        System.out.println("Você precisa remover essas obstruções para restaurar o fluxo natural do rio.\n");

        int progresso = 0;
        int energia = 100;
        Scanner scanner = new Scanner(System.in);

        while (progresso < 100) {
            System.out.println("==============================");
            System.out.println("Progresso: " + progresso + "%");
            System.out.println("Energia: " + energia);
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Remover detritos (custo de energia: 10)");
            System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
            System.out.print("Escolha: ");
            System.out.print("\n");
            System.out.print("\n");

            // Verifica se há detritos flutuantes
            if (Math.random() < 0.6) {
                System.out.println("\nCuidado! Detritos flutuantes se aproximando!");
                System.out.println("Desvie deles para não perder energia.");
                System.out.println("[1] Tentar desviar");

                // Tenta desviar dos detritos
                int escolhaDesvio = 0;
                try {
                    escolhaDesvio = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.next(); // Limpa o buffer do scanner
                    continue;
                }

                if (escolhaDesvio == 1 && Math.random() < 0.5) {
                    System.out.println("Você conseguiu desviar dos detritos!");
                    System.out.println("==============================");
                    System.out.println("Progresso: " + progresso + "%");
                    System.out.println("Energia: " + energia);
                    System.out.println("\nEscolha sua ação:");
                    System.out.println("1. Remover detritos (custo de energia: 10)");
                    System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
                    System.out.print("Escolha: ");
                    System.out.print("\n");
                    System.out.print("\n");
                } else {
                    System.out.println("Você foi atingido pelos detritos!");
                    energia -= 10; // Reduz a energia perdida
                    System.out.println("==============================");
                    System.out.println("Progresso: " + progresso + "%");
                    System.out.println("Energia: " + energia);
                    System.out.println("\nEscolha sua ação:");
                    System.out.println("1. Remover detritos (custo de energia: 10)");
                    System.out.println("2. Enfrentar os Grandes Roedores (custo de energia: 30)");
                    System.out.print("Escolha: ");
                    System.out.print("\n");
                    System.out.print("\n");
                }
            }
            

            int escolhaAcao = 0;
            try {
                escolhaAcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpa o buffer do scanner
                continue;
            }

            switch (escolhaAcao) {
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
                        progresso += 40;
                        energia -= 30; // Ajusta a energia perdida
                    } else {
                        System.out.println("Você não tem energia suficiente para enfrentar os Grandes Roedores!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente.");
            }

            // Verifica se o jogador completou a fase
            if (progresso >= 100) {
                System.out.println("\nParabéns! Você removeu todas as obstruções e restaurou o fluxo do rio!");
                break;
            }

            // Verifica se o jogador ficou sem energia
            if (energia <= 0) {
                System.out.println("\nVocê ficou sem energia e não pode mais continuar.");
                System.out.println("Você falhou em sua missão de remover as obstruções do rio.");
                break;
            }
        }
    }
}