package aps_rpg;

public class Personagem_Principal {
	public String nome;
	public int idade;
	public int ataque;
	public int defesa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	@Override
	public String toString() {
		return "Seja bem vindo(a) "+nome;
	}
	public Personagem_Principal(String nome) {
		super();
		this.nome = nome;

	}
	
	

	
}
