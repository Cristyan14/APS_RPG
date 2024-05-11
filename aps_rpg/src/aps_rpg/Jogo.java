package aps_rpg;

import java.util.Scanner;


public class Jogo {
    public static Scanner escrever = new Scanner(System.in);

	public static void main(String[] args) {
		

		
				System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
		        System.out.println("Digite seu nickname: ");
		        String nick = escrever.next();

		        Personagem_Principal p = new Personagem_Principal(nick);
		        /* Inicio Introdução
				// Fim Introdução*/
				
				// Inicio FASE - 1
		        Fase_1 fase1 = new Fase_1(nick); // Iniciar Fase 1 comentado
				fase1.escolha(3); // Iniciar Fase 1 comentado

				// Fim FASE - 1
				
				
				// Inicio FASE - 2 
				Fase_2 fase2 = new Fase_2();
				fase2.executarFase2();
				
				// Fim FASE - 2
				
				
				// Inicio FASE - 3
				Fase_3 fase3 = new Fase_3(nick); // Iniciar Fase 3 comentado
				 fase3.retornar(p); // Iniciar Fase 3 comentado
				// Fim FASE - 3
				
				
				// Inicio Fase - 4
				Fase_4 fase4 = new Fase_4(nick);
				fase4.retornar(p);// Iniciar Fase 4(batalha) comentado
				// Fim Fase - 4
				
				
				// Inicio Fase - 5
				Fase_5 fase5 = new  Fase_5(nick);
				fase5.IniciarFase5();
				
				// Fim Fase - 5
		
	}
}




        

