package aps_rpg;

import java.util.Random;
import java.util.Scanner;


public class teste {
	private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {
        inicializarTabuleiro();
        exibirTabuleiro();

        Scanner scanner = new Scanner(System.in);
        boolean jogoAcabou = false;

        while (!jogoAcabou) {
            System.out.print("Jogador " + jogadorAtual + ", faça sua jogada (linha coluna): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (fazerJogada(linha, coluna)) {
                exibirTabuleiro();
                if (verificarVitoria()) {
                    System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (verificarEmpate()) {
                    System.out.println("Empate!");
                    jogoAcabou = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    private static void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != '-') {
            return false;
        }
        tabuleiro[linha][coluna] = jogadorAtual;
        return true;
    }

    private static boolean verificarVitoria() {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
            if (tabuleiro[0][i] != '-' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] != '-' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }
        return false;
    }

    private static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }}



        

