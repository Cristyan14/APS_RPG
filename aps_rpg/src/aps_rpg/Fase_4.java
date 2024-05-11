package aps_rpg;

import aps_rpg_Textos.Texto_Fase_04;

public class Fase_4 extends Personagem_Principal{

	public Fase_4(String nome) {
		super(nome);
	}
	
	Texto_Fase_04 texto_fase_04 = new Texto_Fase_04(nome);
	
	public void pausaBreve() {
	    try {
	        Thread.sleep(3000); 
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	public int verificar() {
		int tecla = 1;
		  	while(tecla != 0 ) {                   
             System.out.println("--------------------------");
             System.out.println("Digite 0 para continuar...");          
             System.out.println("--------------------------");
             int teclaa = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
             if(teclaa == 0) {
          	   tecla = teclaa;
             }                   
              
           }
		  	return tecla;
	}
	public void retornar(Personagem_Principal jogador) {
		System.out.println(texto_fase_04.txt01);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt02);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt03);
		pausaBreve();
		verificar();
		pausaBreve();;
		System.out.println("--------------------------");
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		System.out.println("--------------------------");
		pausaBreve();
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt04);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt05);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt06);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_04.txt07);
	}
	

	}
	
	

