package aps_rpg;

import aps_rpg_Textos.Texto_Introdução;

public class Fase_1 {
	private Texto_Introdução textoIntroducao;
	
	public Fase_1(String nick) {
		textoIntroducao = new Texto_Introdução(nick);
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
