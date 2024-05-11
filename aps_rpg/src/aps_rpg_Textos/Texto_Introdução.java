package aps_rpg_Textos;

import aps_rpg.Personagem_Principal;

public class Texto_Introdução extends Personagem_Principal{


	public Texto_Introdução(String nome) {
		super(nome);
		nome = this.nome;
	}

	public String txt01 = "------------Bem Vindo(a) "+nome+"!------------\n"
			+ " Você, como líder da ONG renomada em defesa do ambiente,\n."
			+ "está determinado(a) a salvar o Rio Tietê da crise ambiental que assola São Paulo.\n "
			+ "Sua jornada começa em Salesópolis, onde a poluição atinge níveis alarmantes.\n "
			+ "Munido apenas com sua coragem e\n "
			+ "determinação, você parte sozinho em direção ao coração da crise.";
	
	public String txt02 = "No caminho, você ira enfrentar os mais diversos inimigos e puzzles, com o intuito de concientizar a população,"
			+ "\neliminar os animais mutantes que assolam o rio e acabar com os planos da MegaCorporation.";

	
	public String txt03 = "Boa sorte caro jogador, sua jornada será longa, desejo a você toda sorte e acima de tudo cuidado...";
	
	public String getTxt01() {
		return txt01;
	}

	public String getTxt02() {
		return txt02;
	}

	public String getTxt03() {
		return txt03;
	}


	
}
