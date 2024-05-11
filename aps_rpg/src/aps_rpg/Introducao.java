package aps_rpg;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Introdução;

public class Introducao extends Personagem_Principal {
    private Scanner escrever;
	private Texto_Introdução textoIntroducao;
	private long delayp = 4000L; // 5 segundos em milissegundos
    Timer timer = new Timer();
	
	public Introducao(Scanner escrever, String nick) {
		super(nick);
		this.escrever = escrever;
		textoIntroducao = new Texto_Introdução(nick);
	}
	
	public void iniciarIntroducao() {
		int tecla1a = 1;
		
		while(tecla1a != 0) {
			System.out.println("--------------------------");
	        System.out.println("Digite 0 para continuar...");
	        System.out.println("--------------------------");
	        tecla1a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
		}
		int tecla1 = tecla1a;
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
        
        
        int tecla2a = 1;
		while(tecla2a != 0) {
			System.out.println("--------------------------");
	        System.out.println("Digite 0 para continuar...");
	        System.out.println("--------------------------");
	        tecla2a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
		}
		int tecla2 = tecla2a;
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
		int tecla3a = 1;
		while(tecla3a != 0) {
			System.out.println("--------------------------");
	        System.out.println("Digite 0 para continuar...");
	        System.out.println("--------------------------");
	        tecla3a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
		}
		int tecla3 = tecla3a;
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
		
		finalizar();
		
    }
	
	public void iniciarTexto01() {
		System.out.println(textoIntroducao.getTxt01());
		System.out.println("------------------------------");
	}
	
	public void iniciarTexto02() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt02());
		System.out.println("------------------------------");
	}
	
	public void iniciarTexto03() {
		System.out.println("------------------------------");
		System.out.println(textoIntroducao.getTxt03());
		System.out.println("------------------------------");
	}
	
	public void finalizar() {
		int tecla2 = 1;
	    while(tecla2 != 0 ) {
             System.out.println("--------------------------");
             System.out.println("Digite 0 para continuar...");
             int tecla2a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
             System.out.println("--------------------------\n");
             tecla2 = tecla2a;
         }
	}

	

}