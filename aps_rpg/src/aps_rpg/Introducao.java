package aps_rpg;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Introdução;

public class Introducao {
    private Scanner escrever;
	private Texto_Introdução textoIntroducao;
	private long delayp = 4000L; // 5 segundos em milissegundos
    Timer timer = new Timer();
	
	public Introducao(Scanner escrever, String nick) {
		this.escrever = escrever;
		textoIntroducao = new Texto_Introdução(nick);
	}
	
	public void iniciarIntroducao() {
        System.out.println("Bem Vindo caro jogador, seja bem-vindo(a) nesta jornada!");
        System.out.println("Digite seu nickname: ");
        String nick = Jogo.escrever.next();
        Personagem_Principal p1 = new Personagem_Principal(nick);
        System.out.println("Pressione 0 para continuar...");
        int tecla1 = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
        if (tecla1 == 0) {
            TimerTask task1 = new TimerTask() {
                public void run() {
                    iniciarTexto01();
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
		        	iniciarTexto02();
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
		        	iniciarTexto03();
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
		        	iniciarTexto04();
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
		        	iniciarTexto05();
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
		        	iniciarTexto06();
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
		        	iniciarTexto07();
		        }
		    };
		    long delay = 2000L; // 5 segundos em milissegundos

		    timer.schedule(task7, delay);


		} else {
		    System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
		}
		
        // Restante do código...
    }
	
	public void iniciarTexto01() {
		System.out.println("Fase 1 - Jornada pelo Rio Tietê");
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt01());
	}
	
	public void iniciarTexto02() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt02());
	}
	
	public void iniciarTexto03() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt03());
	}
	
	public void iniciarTexto04() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt04());
	}
	
	public void iniciarTexto05() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt05());
	}
	
	public void iniciarTexto06() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt06());
	}
	
	public void iniciarTexto07() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt07());
	}
}
