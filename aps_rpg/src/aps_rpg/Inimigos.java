package aps_rpg;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Inimigos{
	public int vidaInimigo;
    public String nomeInimigo;
    public int ataqueInimigo;
    
    public int getAtaqueInimigo() { // Encapsulamento
		return ataqueInimigo;
	}

	public void setAtaqueInimigo(int ataqueInimigo) { // Encapsulamento
		this.ataqueInimigo = ataqueInimigo;
	}
	
	public int getVidaInimigo() { // Encapsulamento
		return vidaInimigo;
	}

	public void setVidaInimigo(int vidaInimigo) { // Encapsulamento
		this.vidaInimigo = vidaInimigo;
	}

	public String getNomeInimigo() { // Encapsulamento
		return nomeInimigo;
	}

	public void setNomeInimigo(String nomeInimigo) { // Encapsulamento
		this.nomeInimigo = nomeInimigo;
	}

    public Inimigos() { // Método Construtor
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
    
    public static void pausaBreve() {
	    try { // Exceções
	        Thread.sleep(5000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
    
    public static void batalha(Personagem_Principal jogador) {
        Inimigos inimigo = new Inimigos();
        int vidaMaxInimigo = inimigo.vidaInimigo;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Um horripilante " + inimigo.nomeInimigo + " se aproxima!!!!");
        try { // Exceções
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000); // Espera por 1 segundo
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        while (true) {
            boolean correto = false;
            int tecla = 0;
    		while(!correto) {
    			try { //Exceções
    				 System.out.println("=============== B A T A L H A ===============\n");
    		            System.out.println(inimigo.nomeInimigo + "\nHP: " + inimigo.vidaInimigo + "/" + vidaMaxInimigo);
    		            System.out.println(jogador.nome + "\nHP: " + jogador.getVida() + "/" + jogador.getMaxVida());
    		            System.out.println("\nO que irá fazer?\n");
    		            System.out.println("[1] Atacar\n[2] Usar poção de cura\n[3] Pedir arrego\n");
    		            System.out.print("Digite: ");
    		            System.out.println("--------------------------");
    		            tecla = scanner.nextInt();
    		        
    		        
    		        if (tecla == 1 || tecla == 2 || tecla == 3) {
    		            correto = true;
    		        } else {
    		            System.out.println("--------------------------");
    		            System.out.println("Opção inválida!");
    		            System.out.println("--------------------------");
    		            pausaBreve();
    		        }
    		    } catch (InputMismatchException e) {
    		        System.out.println("--------------------------");
    		        System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
    		        System.out.println("--------------------------");
    		        pausaBreve();
    		        scanner.next(); // Limpa o buffer de entrada
    		    }}		

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
                pausaBreve();
                break; // Sai do loop da batalha
            } else {
                // Tecla inválida
                System.out.println("Opção inválida! Tente novamente.");
            }

            // Verifica se o jogador ou o inimigo foram derrotados
            if (jogador.getVida() <= 0) {
                System.out.println("Você foi derrotado por " + inimigo.nomeInimigo + "!");
                pausaBreve();
                System.out.println("A população oferece apoio moral e te enche de determinação...!");
                pausaBreve();
                System.out.println("Enquanto isso... "+inimigo.nomeInimigo+" aproveitou pra descansar e recuperar sua vida.");
                pausaBreve();
                System.out.println("Tente novamente e não deixe barato dessa vez!");
                jogador.setVida(80);
                inimigo.setVidaInimigo(vidaMaxInimigo);
                pausaBreve();
            } else if (inimigo.vidaInimigo <= 0) {
                System.out.println(jogador.getNome()+" derrotou " + inimigo.nomeInimigo + "!");
                break; // Sai do loop da batalha
            }

            // Espera por um momento antes de limpar o console
            try { // Exceções
                Thread.sleep(2000); // Espera por 2 segundos antes de continuar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

    }
}
