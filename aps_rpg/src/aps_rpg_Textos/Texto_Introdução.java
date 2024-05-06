package aps_rpg_Textos;

import aps_rpg.Personagem_Principal;

public class Texto_Introdução extends Personagem_Principal{


	public Texto_Introdução(String nome) {
		super(nome);
		nome = this.nome;
	}

	public String txt01 = " Você "+ nome +", como líder da ONG renomada em defesa do ambiente,\n "
			+ "está determinado a salvar o Rio Tietê da crise ambiental que assola São Paulo.\n "
			+ "Sua jornada começa em Salesópolis, onde a poluição atinge níveis alarmantes.\n "
			+ "Munido apenas com sua coragem e\n "
			+ "determinação, você parte sozinho em direção ao coração da crise.";
	
	public String txt02 = "No caminho, você enfrenta os primeiros obstáculos: grandes empresas poluidoras que fazem de tudo para deter seus esforços. Desviando de ataques e sabotagens, você finalmente chega às margens de Mogi das Cruzes, onde a poluição atinge seu ápice.";
	
	public String txt03 = "Aqui, a batalha se intensifica. Você enfrenta não apenas vilões corporativos, mas também criaturas mutantes que surgiram devido à contaminação do rio. Com habilidade e estratégia, você supera cada desafio, lutando pela preservação ambiental e pela saúde da cidade.";
	
	public String txt04 = "Conforme avança, você também encontra aliados improváveis: moradores locais que compartilham sua paixão pela natureza e estão dispostos a lutar ao seu lado. Juntos, vocês formam uma força imparável, determinada a restaurar a beleza natural do Rio Tietê.";
	
	public String txt05 = "À medida que as fases avançam, você enfrenta cinco desafios distintos, cada um mais perigoso que o anterior. Desde confrontos épicos com chefes de fase até missões de resgate de animais em perigo, sua jornada é uma verdadeira odisséia pela preservação do meio ambiente.";
	
	public String txt06 = "No final, após superar todos os obstáculos e derrotar os vilões que ameaçavam o Rio Tietê, você emerge triunfante. O rio começa lentamente a se recuperar, as águas se tornam mais claras e a vida aquática retorna.";
	
	public String txt07 = "Seu heroísmo inspira não apenas a população local, mas também o mundo inteiro. Sua jornada não é apenas uma aventura épica, mas também uma poderosa mensagem de esperança e perseverança na luta pela preservação ambiental.";

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

	public String getTxt07() {
		return txt07;
	}
	
	
}
