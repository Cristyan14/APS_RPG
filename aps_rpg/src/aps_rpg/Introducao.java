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
		this.setEscrever(escrever);
		textoIntroducao = new Texto_Introdução(nick);
	}
	public void pausaBreve() {
	    try {
	        Thread.sleep(2000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	public int verificar() {
		int tecla = 1;
		  	while(tecla != 0 ) {                   
             System.out.println("Digite 0 para continuar...");          
             System.out.print("--------------------------");
             int teclaa = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
             if(teclaa == 0) {
          	   tecla = teclaa;
             }                   
              
           }
		  	return tecla;
	}
	public void iniciarIntroducao() {
		iniciarTexto01();
		verificar();
		pausaBreve();
		iniciarTexto02();
		verificar();
		pausaBreve();
		iniciarTexto03();
		verificar();
		pausaBreve();
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
             System.out.println("--------------------------");             System.out.println("--------------------------\n");
             pausaBreve();
             int tecla2a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
             tecla2 = tecla2a;
         }
	}

	public Scanner getEscrever() {
		return escrever;
	}

	public void setEscrever(Scanner escrever) {
		this.escrever = escrever;
	}

	

}