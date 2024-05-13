package aps_rpg_Textos;

import aps_rpg.Personagem_Principal;

public class Texto_Fase_03  extends Personagem_Principal{
	
	public Texto_Fase_03(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public String txt01 = "----------------------- Fase 03 -----------------------"
			+ "\nApós uma longa jornada, você "+nome+ " irá começar a restauração da vida aquática no rio.\nAo começar sua navegação você"
			+ "se depara com um Cardume Voraz de peixes \nmutantes que foram jogados pela MegaCorporation como seus animais de testes.";
	
	public String txt02 ="Há duas possibilides para você enfrentar esse cardume\n"
			+ "Digite [1] para tentar pesca-los com sua vara de pesca lendária\n"
			+ "Digite [2] para Luta corpo a corpo"
			+ "\n--------------------------------------------";
	
	public String txt03 = "--------------------------------------------"
			+ "\nAo optar por pescar, o jogador decide sua vara de pesca lendária, que seu sensei lhe deu.";
			
		
	public String txt05 = "--------------------------------------------"
			+ "\nAo escolher a luta corpo a corpo, você assume uma abordagem mais direta para enfrentar o Cardume Voraz. \nVocê lembra dos ensinamento do seu Mestre e decidi os aplicar nessa situação."
			+ "\nLá, você se depara com uma grande quantidade de peixes te esperando. ";
	
	public String txt06 = "--------------------------------------------"
			+ "\nDigite [1] para golpear o cardume usando suas mãos.\n"
			+ "Digite [2] para golpear o cardume usando uma espada de ferro.\n"
			+ "--------------------------------------------";
	
	public String txt07 = "--------------------------------------------"
			+ "\n...Porém, algums peixes rebeldes que haviam saído do cardume observam o que você fez.\n"
			+ "E eles não parecem muito contentes...";
	
	public String txt08 = "--------------------------------------------"
			+ "\n"+nome+" vê duas sombras do fundo de rio se aproximando...\n";
	
	public String txt09 = "--------------------------------------------"
			+ "\nUfa! Essa foi por pouco... "+nome+" derrota os peixes tóxicos restantes, livrando a vida aquática do rio das mais\n"
			+ "aterrorizantes espécies de predadores injustos."
			+ "\n--------------------------------------------";
	

	public String getTxt01() {
		return txt01;
	}

	public String getTxt02() {
		return txt02;
	}

	public String getTxt03() {
		return txt03;
	}


	public String getTxt05() {
		return txt05;
	}

	public String getTxt06() {
		return txt06;
	}
	
	
}
