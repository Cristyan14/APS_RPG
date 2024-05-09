package aps_rpg_Textos;

import aps_rpg.Personagem_Principal;

public class Texto_Fase_01 extends Personagem_Principal {
	public Texto_Fase_01(String nome) {
		super(nome);
		nome = this.nome;
	}

	public String txt01 = "--------------------------------------------"
			+ "\n Você "+ nome +", uma escada em uma fabrica proxíma a margem do rio e decide descer para investiga-la.\n"
			+ "Enquanto voce desce pelas escadas enferrujadas\n"
			+ "até as entranhas escuras da fabrica, você encontra evidências \n"
			+ "perturbadoras de negligência ambiental. Produtos químicos tóxicos poluem as águas, \n"
			+ "criaturas mutantes vagueiam pelos túneis e indícios de atividades criminosas são abundantes..";
	
	public String txt02 = "--------------------------------------------"
			+ "\n Você "+ nome+ " encontra uma pequena lata de ervilha e vê que na sua embalagem aponta para MegaCorporation,\n"
			+ " uma grande empresa de sua época que fabríca diversos tipos de produtos. A fabríca que você entrou na verdade \n"
			+ "é uma fabríca desativada da MegaCorporation, \n"
			+ "com isso você achou uma prova que pode incrimina-la futuramente! Meus parabens" + nome;
	
	
	public String txt03 = "--------------------------------------------\n" + nome 
			+ "Como o herói da nossa história, decide investigar o descarte\n irregular de lixo diretamente no rio, uma prática que tem causado danos\n significativos ao meio ambiente e à comunidade local.";
	
	public String txt04 = "--------------------------------------------\n"
			+ "À medida que você se aproxima do rio, o cheiro pútrido e a visão desoladora\b de lixo flutuando na água deixam claro que o problema é sério. Entre os\n detritos, você avista plásticos, garrafas quebradas, sacolas e até mesmo alguns produtos químicos suspeitos.";

	public String txt05 = "--------------------------------------------\n"
			+ "Ao examinar mais de perto, você encontra evidências que sugerem que o \ndescarte irregular é feito por moradores da região. Cartas, recibos e até \nmesmo fotos pessoais são encontradas misturadas ao lixo. Isso indica que os \npróprios habitantes locais estão contribuindo para a poluição do rio.";
	
	public String txt06 = "--------------------------------------------\n"
			+ "Enquanto você continua a investigação, é confrontado por um morador local que \bestá despejando mais lixo no rio. Ele parece surpreso ao vê-lo e tenta justificar\n suas ações, dizendo que não há outro lugar para descartar o lixo e que ele não tem escolha.\n Você percebe a frustração e a falta de recursos enfrentados por essas pessoas, mas também entende que ações\n individuais têm um impacto coletivo significativo no meio ambiente.";
	
	public String txt07 = "--------------------------------------------\n"
			+ "Com empatia, você explica os danos que o descarte irregular está causando ao rio, à vida selvagem e à saúde da comunidade.\n Você propõe soluções alternativas, como programas de reciclagem, limpeza coletiva e conscientização ambiental. \nJuntos, vocês começam a discutir maneiras de resolver o problema e trabalhar para um futuro mais limpo e sustentável para todos.";
}
