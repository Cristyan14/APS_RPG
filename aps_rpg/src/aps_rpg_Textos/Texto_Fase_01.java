package aps_rpg_Textos;

import aps_rpg.Personagem_Principal;

public class Texto_Fase_01 extends Personagem_Principal {
	public Texto_Fase_01(String nome) {
		super(nome);
		nome = this.nome;
	}

	public String txt01 = "----------------------- Fase 01 -----------------------"
			+ "\n Você "+ nome +", uma escada em uma fabrica proxíma a margem do rio em uma floresta tenebrosa e decide descer para investiga-la.\n"
			+ "Enquanto voce desce pelas escadas enferrujadas\n"
			+ "até as entranhas escuras da fabrica, você encontra evidências \n"
			+ "perturbadoras de negligência ambiental acabando com a sustentabilidade da região. Produtos químicos tóxicos poluem as águas, \n"
			+ "criaturas mutantes vagueiam pelos túneis e indícios de atividades criminosas são abundantes..";
	
	public String txt02 = "--------------------------------------------"
			+ "\n Você "+ nome+ " encontra diversas latas de ervilhas e vê que em suas embalagens aponta para MegaCorporation,\n"
			+ " uma grande empresa quem vem gerando grande poluição ao meio ambiente, destruindo o ecossistema.\nA fabríca que você entrou na verdade \n"
			+ "é uma fabríca desativada da MegaCorporation, e percebe "
			+ "não é mais feita reciclagem do lixo. ";
	
	public String txt08 = "--------------------------------------------\n"
			+ "Você, ao tentar sair da fábrica, se depara com um terrivél jogo da forca!! Onde você deve adivinhar uma palavra chave para fugir\n"
			+ "Ao olhar na parede, vê uma dica deixada por outro herói que diz que a palavra chave é relacionado ao meio ambiente\n"
			+ "E que foi escrita em um dos dois textos anteriores!\n"
			+ "OBS:(Não precisa ter acentuação, somente caracteres, sem números.)";
	
	
	public String txt03 = "--------------------------------------------\n" + nome 
			+ "Como o herói da nossa história, decide investigar o descarte\n irregular de lixo diretamente no rio, uma prática que tem causado danos\n significativos ao meio ambiente e à comunidade local.";
	
	public String txt04 = "--------------------------------------------\n"
			+ "À medida que você se aproxima do rio, o cheiro pútrido e a visão desoladora\b de lixo flutuando na água deixam claro que o problema é sério. Entre os\n detritos, você avista plásticos, garrafas quebradas, sacolas e até mesmo alguns produtos químicos suspeitos.";

	public String txt05 = "--------------------------------------------\n"
			+ "Você então, percebe que um grupo de moradores estão jogando lixo naquele momento\n"
			+ "E então decidi os confrontar!";
	public String txt06 = "--------------------------------------------\n"
			+ "Um morador, que gosta muito de jogar dados, diz que se você o vence-lô eles irão parar.\n"
			+ "Digite [1] para aceitar\n"
			+ "Digite [2] para recusar";
}
