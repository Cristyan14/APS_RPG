package aps_rpg;
import java.util.Random;
import java.util.Scanner;

public class Inimigos{
	public int vidaInimigo;
    public String nomeInimigo;
    
    public int ataqueInimigo;
    public int getAtaqueInimigo() {
		return ataqueInimigo;
	}

	public void setAtaqueInimigo(int ataqueInimigo) {
		this.ataqueInimigo = ataqueInimigo;
	}
	
	public static void clearConsole() {
	    try {
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
	        }
	    } catch (final Exception e) {
	        System.out.println("Erro ao limpar o console: " + e.getMessage());
	    }
	}

	public int getVidaInimigo() {
		return vidaInimigo;
	}

	public void setVidaInimigo(int vidaInimigo) {
		this.vidaInimigo = vidaInimigo;
	}

	public String getNomeInimigo() {
		return nomeInimigo;
	}

	public void setNomeInimigo(String nomeInimigo) {
		this.nomeInimigo = nomeInimigo;
	}

    public Inimigos() {
        Random rand = new Random();
        this.nomeInimigo = escolherNome(rand);
        this.ataqueInimigo = 6 + rand.nextInt(5); // Gera um número entre 6 e 10
        this.vidaInimigo = 20 + rand.nextInt(31); // Gera um número entre 20 e 50
    }

    private String escolherNome(Random rand) {
        String[] inimigos = {
            "Capitão Lixão",
            "Borra-botas", 
            "Estagiário da MegaCorporation",
            "Barão do Esgoto",
            "Fernando Fétido",
            "Rato Mutante do Tietê",
            "Sidney Sujismundo",
            "Maluco Aleatório Que Detesta o Meio Ambiente",
            "Filho de Alguém da Máfia",
            "Zé Esgoto, o Poderoso",
            "Tonho da Canalização",
            "Bruno Trambiqueiro",
            "João Malcheiroso",
            "César Corrupto",
            "Leandro Lodo"
        };
        int n = rand.nextInt(inimigos.length);
        return inimigos[n];
    }
    
    public static void batalha(Personagem_Principal jogador) {
        Inimigos inimigo = new Inimigos();
        int vidaMaxInimigo = inimigo.vidaInimigo;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Um horripilante " + inimigo.nomeInimigo + " se aproxima!!!!");
        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000); // Espera por 1 segundo
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        while (true) {
            clearConsole();
            System.out.println("=============== B A T A L H A ===============\n");
            System.out.println(inimigo.nomeInimigo + "\nHP: " + inimigo.vidaInimigo + "/" + vidaMaxInimigo);
            System.out.println(jogador.nome + "\nHP: " + jogador.getVida() + "/" + jogador.getMaxVida());
            System.out.println("\nO que irá fazer?\n");
            System.out.println("[1] Atacar\n[2] Usar poção de cura\n[3] Pedir arrego\n");
            int tecla = scanner.nextInt();

            if (tecla == 1) {
                // Ataque
                int danoJogador = 7 + rand.nextInt(9); // Dano aleatório entre 7 e 15
                inimigo.vidaInimigo -= danoJogador; // Dá o dano no inimigo
                if (inimigo.vidaInimigo < 0) {
                    inimigo.vidaInimigo = 0; // Evita vida negativa
                }

                int danoInimigo = 6 + rand.nextInt(5); // Dano aleatório entre 6 e 10
                jogador.setVida(jogador.getVida() - danoInimigo); // Dá o dano no jogador
                if (jogador.getVida() < 0) {
                    jogador.setVida(0); // Evita vida negativa
                }

                System.out.println(jogador.nome + " lança uma porrada em " + inimigo.nomeInimigo+" e dá "+danoJogador+" de dano!");
                if (inimigo.vidaInimigo > 0) {
                	System.out.println("...e ele devolve!!! Perdeu " + danoInimigo+" de vida.");
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
                System.out.println("Enquanto isso... "+inimigo.nomeInimigo+" aproveitou e te tacou uma pedra, lhe tirando "+danoInimigo+" de vida...");
            } else if (tecla == 3) {
                // Pedir arrego
                System.out.println(jogador.nome + " desiste da batalha e pede arrego!");
                break; // Sai do loop da batalha
            } else {
                // Tecla inválida
                System.out.println("Opção inválida! Tente novamente.");
            }

            // Verifica se o jogador ou o inimigo foram derrotados
            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado por " + inimigo.nomeInimigo + "!");
                break; // Sai do loop da batalha
            } else if (inimigo.vidaInimigo <= 0) {
                System.out.println(jogador.getNome()+" derrotou " + inimigo.nomeInimigo + "!");
                jogador.setVida(80);
                break; // Sai do loop da batalha
            }

            // Espera por um momento antes de limpar o console
            try {
                Thread.sleep(2000); // Espera por 2 segundos antes de continuar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        scanner.close(); // Fecha o scanner
    }
}
