package aps_rpg;

import java.util.Random;

public class Personagem_Principal {
    public String nome;
    private int ataque;
    private int vida;
    private int maxVida;
    
    public Personagem_Principal(String nome) { // Método Construtor
        this.nome = nome;
        this.ataque = 7 + new Random().nextInt(9); // Gera um número entre 7 e 15
        this.vida = 80;
        this.setMaxVida(80);
    }
    
    public String getNome() { // Encapsulamento
		return nome;
	}


	public void setNome(String nome) { // Encapsulamento
		this.nome = nome;
	}


	public int getAtaque() { // Encapsulamento
		return ataque;
	}


	public void setAtaque(int ataque) { // Encapsulamento
		this.ataque = ataque;
	}


	public int getVida() { // Encapsulamento
		return vida;
	}


	public void setVida(int vida) { // Encapsulamento
		this.vida = vida; 
	}
	
	public int getMaxVida() { // Encapsulamento
		return maxVida;
	}

	public void setMaxVida(int maxVida) { // Encapsulamento
		this.maxVida = maxVida;
	}

    public void usarPocao() {
        Random rand = new Random();
        boolean recuperouVida = rand.nextDouble() < 0.8; // 80% de chance de recuperar vida
        if (recuperouVida) {
            vida += 20;
            System.out.println(nome + " usou uma poção e recuperou 20 de vida!");
        } else {
            System.out.println(nome + " usou uma poção, mas não conseguiu recuperar vida....");
        }
    }

    @Override
    public String toString() {
        return "Seja bem vindo(a) " + nome;
    }

}

	
