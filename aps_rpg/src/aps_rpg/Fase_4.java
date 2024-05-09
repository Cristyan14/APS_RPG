package aps_rpg;

import aps_rpg_Textos.Texto_Fase_04;

public class Fase_4 extends Personagem_Principal{

	public Fase_4(String nome) {
		super(nome);
	}
	
	Texto_Fase_04 texto_fase_04 = new Texto_Fase_04(nome);
	
	public void pausaBreve() {
	    try {
	        Thread.sleep(5000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public void retornar(Personagem_Principal jogador) {
		System.out.println(texto_fase_04.txt01);
		pausaBreve();
		System.out.println(texto_fase_04.txt02);
		pausaBreve();
		System.out.println(texto_fase_04.txt03);
		pausaBreve();
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		System.out.println(texto_fase_04.pausaDramatica);
		pausaBreve();
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		Inimigos.batalha(jogador);
		pausaBreve();
		System.out.println(texto_fase_04.txt04);
		pausaBreve();
		System.out.println(texto_fase_04.txt05);
		pausaBreve();
		System.out.println(texto_fase_04.txt06);
		pausaBreve();
		System.out.println(texto_fase_04.txt07);
	}
	

	}
	
	

