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
		Fase_1 fase01 = new Fase_1(nick);
		long delayp = 4000L; // 5 segundos em milissegundos
		System.out.println("Pressione 0 para continuar...");
		int tecla1 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla1 == 0) {
		    TimerTask task1 = new TimerTask() {
		    	 public void run() {
			            fase01.iniciarTexto01();
			        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task1, delay);
		
	
		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		    
		}
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println("Pressione 0 para continuar...");
		int tecla2 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla2 == 0) {
		    TimerTask task2 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto02();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task2, delay);

		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Pressione 0 para continuar...");
		int tecla3 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla3 == 0) {
		    TimerTask task3 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto03();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task3, delay);


		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Pressione 0 para continuar...");
		int tecla4 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla4 == 0) {
		    TimerTask task4 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto04();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task4, delay);

		
		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Pressione 0 para continuar...");
		int tecla5 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla5 == 0) {
		    TimerTask task5 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto05();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task5, delay);

		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Pressione 0 para continuar...");
		int tecla6 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla6 == 0) {
		    TimerTask task6 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto06();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task6, delay);

	
		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		try {
            Thread.sleep(delayp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Pressione 0 para continuar...");
		int tecla7 = escrever.nextInt(); // Aguarda a entrada do usuário
		if (tecla7 == 0) {
		    TimerTask task7 = new TimerTask() {
		        public void run() {
		        	fase01.iniciarTexto07();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task7, delay);


		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
		escrever.close();
	}
}
