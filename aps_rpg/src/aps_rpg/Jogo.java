package aps_rpg;

import java.util.Scanner;


public class Jogo {
    public static Scanner escrever = new Scanner(System.in);

	public static void main(String[] args) {
		

		// Inicio Introdução
		System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
        System.out.println("Digite seu nickname: ");
        String nick = escrever.next();

        Personagem_Principal p = new Personagem_Principal(nick);
        Introducao introducao = new Introducao(escrever, nick);
        introducao.iniciarIntroducao();
		// Fim Introdução
		
		// Inicio FASE - 1
        Fase_1 fase1 = new Fase_1(nick);
		

		fase1.retornar();

		// Fim FASE - 1
		
		// Inicio FASE - 2 Renato Está Fazendo
		
		
		
		
		
		// Fim FASE - 2
		
		
		// Inicio FASE - 3
		Fase_3 fase3 = new Fase_3(nick);
		fase3.retornar();
		
		
		
		
		// Fim FASE - 3
		
		
		// Inicio Fase - 4
		
		Inimigos.batalha(p);
		// Fim Fase - 4
		
		
		// Inicio Fase - 5
		
		
		
		// Fim Fase - 5
		escrever.close();
	}
}




        

