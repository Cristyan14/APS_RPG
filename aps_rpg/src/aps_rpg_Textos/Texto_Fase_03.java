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
	
	public String txt02 = "Há duas possibilides para você enfrentar esse cardume\n"
			+ "Digite [1] para Pescar\n"
			+ "Digite [2] para Luta corpo a corpo";
	
	public String txt03 = "Ao optar por pescar, o jogador decide utilizar técnicas de pesca sustentável para lidar com o Cardume Voraz. "
			+ "\nArmado com uma vara de pesca e um conhecimento aprimorado sobre as espécies nativas, o jogador parte em seu barco para o meio do Rio Tietê.";
	
	public String txt04 = "Digite [1] para iniciar o seu duelo contra o cardume na pesca!.";
	
	public String txt05 = "Ao escolher a luta corpo a corpo, você assume uma abordagem mais direta para enfrentar o Cardume Voraz. \nEquipado com um traje de mergulho e equipamentos de combate subaquático, o jogador mergulha nas águas turbulentas do Rio Tietê. "
			+ "\nLá, você se depara com os peixes invasores em seu próprio ambiente. ";
	
	public String txt06 = "Digite [1] para golpear o cardume usando suas maõs\n"
			+ "Digite [2] para golpear o cardume usando uma tronco de Eucalipto que você encontrou nas margens do rio";

	public String getTxt01() {
		return txt01;
	}

	public String getTxt02() {
		return txt02;
	}

	public String getTxt03() {
		return txt03;
	}

	public String getTxt04() {
		return txt04;
	}

	public String getTxt05() {
		return txt05;
	}

	public String getTxt06() {
		return txt06;
	}
	
	
}
