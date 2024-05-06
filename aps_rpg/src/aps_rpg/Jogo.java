package aps_rpg;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Introdução;

public class Jogo {
	public static void main(String[] args) {


		Scanner escrever = new Scanner(System.in);
		Timer timer = new Timer();
		System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
		System.out.println("Digite seu nickname: ");
		String nick = escrever.next();
		
		Personagem_Principal p1 = new Personagem_Principal(nick);
		Texto_Introdução textoIntroducao = new Texto_Introdução(nick);
		
		System.out.println("Pressione 0 para continuar...");
		int tecla = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla == 0) {
		    TimerTask task = new TimerTask() {
		        public void run() {
		            System.out.println(textoIntroducao.getTxt01());
		        }
		    };
		    long delay = 5000L; // 5 segundos em milissegundos

		    timer.schedule(task, delay);

		    System.out.println(p1);
		    System.out.println(textoIntroducao);
		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
	}
}
