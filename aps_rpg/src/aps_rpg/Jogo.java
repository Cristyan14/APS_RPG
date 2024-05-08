package aps_rpg;

import java.util.Scanner;


public class Jogo {
    public static Scanner escrever = new Scanner(System.in);

	public static void main(String[] args) {
		

		// Inicio Introdução
		System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
        System.out.println("Digite seu nickname: ");
        String nick = escrever.next();
 

		// Fim FASE - 1
		
		// Inicio FASE - 2
		
		
		
		
		
		// Fim FASE - 2
		
		
		// Inicio FASE - 3
		Fase_3 fase3 = new Fase_3(nick);
		fase3.retornar();
		
		
		
		
		// Fim FASE - 2
		escrever.close();
	}
}
