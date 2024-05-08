package aps_rpg;

import java.util.Scanner;


public class Jogo {
    public static Scanner escrever = new Scanner(System.in);

	public static void main(String[] args) {
		

		// Inicio Introdução
		System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
        System.out.println("Digite seu nickname: ");
        String nick = escrever.next();
        Personagem_Principal jogador = new Personagem_Principal(nick);
 
        Introducao introducao = new Introducao(escrever, nick);
        introducao.iniciarIntroducao();
		// Fim Introdução
		
		// Inicio FASE - 1
        Fase_1 fase1 = new Fase_1(nick);
		System.out.println("Ao iniciar usa jornada "+ nick + ", você percebe algumas fontes de poluição.");
		System.out.println("Digite [1] para investigar os Esgotos Industriais.\nDigite [2] para investigar o Descarte irregular de lixo.");
		int escolhaF01 = escrever.nextInt();
		fase1.escolha(escolhaF01);
		
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

//===================================================
// TIRAR DE COMENTÁRIO PARA PODER TESTAR O COMBATE!!!
//===================================================

/*package aps_rpg;

import java.util.Scanner;


public class Jogo {
    public static Scanner escrever = new Scanner(System.in);

	public static void main(String[] args) {
		

		// Inicio Introdução
		System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
        System.out.println("Digite seu nickname: ");
        String nick = escrever.next();
        Personagem_Principal jogador = new Personagem_Principal(nick);
 
        Inimigos.batalha(jogador);
	}
}
*/
