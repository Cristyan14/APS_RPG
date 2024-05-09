	package aps_rpg;
	import java.util.Random;
	import java.util.Scanner;
	
	public class Inimigos_Peixes{
		public int vidaPeixe;
		public String nomePeixe;
		public int ataquePeixe;
	    
	    public int getAtaquePeixe() {
			return ataquePeixe;
		}

		public void setAtaquePeixeo(int ataquePeixe) {
			this.ataquePeixe = ataquePeixe;
		}
		
		public int getVidaPeixe() {
			return vidaPeixe;
		}

		public void setVidaPeixe(int vidaPeixe) {
			this.vidaPeixe = vidaPeixe;
		}

		public String getNomePeixe() {
			return nomePeixe;
		}

		public void setNomePeixe(String nomePeixe) {
			this.nomePeixe = nomePeixe;
		}

	    public Inimigos_Peixes() {
	        Random rand = new Random();
	        this.nomePeixe = escolherNome(rand);
	        this.ataquePeixe = 6 + rand.nextInt(5); // Gera um número entre 6 e 10
	        this.vidaPeixe = 20 + rand.nextInt(31); // Gera um número entre 20 e 50
	    }

	    private String escolherNome(Random rand) {
	        String[] inimigos = {
	            "Salmão Sarnento",
	            "Truta Tóxica", 
	            "Piranha Podre",
	            "Peixe-beta Com 3 Olhos",
	            "Pacu Poluidor",
	            "Linguado Letal",
	            "Tilápia Teimosa",
	            "Dourado Deformado",
	            "Siri Crackudo",
	            "Peixe-palhaço Sem Graça",
	            "Sardinha Que Queria Ser Tubarão",
	            "Peixe-boi Maldito",
	            "Baiacu Bombado",
	            "Bagre Biruta",
	            "Molusco Mutante"
	        };
	        int n = rand.nextInt(inimigos.length);
	        return inimigos[n];
	    }
	    
	    public static void pausaBreve() {
		    try {
		        Thread.sleep(5000); // Pausa por 2 segundo
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
	    
	    public static void batalha(Personagem_Principal jogador) {
	    	Inimigos_Peixes inimigo = new Inimigos_Peixes();
	        int vidaMaxInimigo = inimigo.vidaPeixe;
	        Scanner scanner = new Scanner(System.in);
	        Random rand = new Random();

	        System.out.println("Das profundesas... " + inimigo.nomePeixe + " emerge!!!!");
	        try {
	            for (int i = 5; i > 0; i--) {
	                Thread.sleep(1000); // Espera por 1 segundo
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }

	        while (true) {
	            System.out.println("=============== B A T A L H A ===============\n");
	            System.out.println(inimigo.nomePeixe + "\nHP: " + inimigo.vidaPeixe + "/" + vidaMaxInimigo);
	            System.out.println(jogador.nome + "\nHP: " + jogador.getVida() + "/" + jogador.getMaxVida());
	            System.out.println("\nO que irá fazer?\n");
	            System.out.println("[1] Bater com a vara de pesca\n[2] Usar poção de cura\n[3] Nadar pra longe\n");
	            int tecla = scanner.nextInt();

	            if (tecla == 1) {
	                // Ataque
	                int danoJogador = 7 + rand.nextInt(9); // Dano aleatório entre 7 e 15
	                inimigo.vidaPeixe -= danoJogador; // Dá o dano no inimigo
	                if (inimigo.vidaPeixe < 0) {
	                    inimigo.vidaPeixe = 0; // Evita vida negativa
	                }

	                int danoInimigo = 6 + rand.nextInt(5); // Dano aleatório entre 6 e 10
	                jogador.setVida(jogador.getVida() - danoInimigo); // Dá o dano no jogador
	                if (jogador.getVida() < 0) {
	                    jogador.setVida(0); // Evita vida negativa
	                }

	                System.out.println(jogador.nome + " bate com a vara em " + inimigo.nomePeixe+" e dá "+danoJogador+" de dano!");
	                if (inimigo.vidaPeixe > 0) {
	                	System.out.println("...mas você leva uma mordida de volta!!! Perdeu " + danoInimigo+" de vida.");
	                }
	            } else if (tecla == 2) {
	                // Usar poção de cura
	                jogador.usarPocao();
	                if (jogador.getVida() > 80) {
	                	jogador.setVida(80);
	                }
	                int danoInimigo = 6 + rand.nextInt(5); // Dano aleatório entre 6 e 10
	                jogador.setVida(jogador.getVida() - danoInimigo); // Dá o dano no jogador
	                if (jogador.getVida() < 0) {
	                    jogador.setVida(0); // Evita vida negativa
	                }
	                System.out.println("Enquanto isso... "+inimigo.nomePeixe+" te deu uma mordida tóxica, lhe tirando "+danoInimigo+" de vida...");
	            } else if (tecla == 3) {
	                // Pedir arrego
	                System.out.println(jogador.nome + " pede arrego pro peixe e nada pra longe!");
	                pausaBreve();
	                break; // Sai do loop da batalha
	            } else {
	                // Tecla inválida
	                System.out.println("Opção inválida! Tente novamente.");
	            }

	            // Verifica se o jogador ou o inimigo foram derrotados
	            if (jogador.getVida() <= 0) {
	                System.out.println("Você foi derrotado por " + inimigo.nomePeixe + "!");
	                pausaBreve();
	                System.out.println("A população oferece apoio moral e te enche de determinação...!");
	                pausaBreve();
	                System.out.println("Enquanto isso... "+inimigo.nomePeixe+"aproveitou pra comer algas e recuperar sua vida.");
	                pausaBreve();
	                System.out.println("Tente novamente e não deixe barato dessa vez!");
	                jogador.setVida(80);
	                inimigo.setVidaPeixe(vidaMaxInimigo);
	                pausaBreve();
	            } else if (inimigo.vidaPeixe <= 0) {
	                System.out.println(jogador.getNome()+" derrotou " + inimigo.nomePeixe + "!");
	                break; // Sai do loop da batalha
	            }

	            // Espera por um momento antes de limpar o console
	            try {
	                Thread.sleep(2000); // Espera por 2 segundos antes de continuar
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }

	    }
	}
