package aps_rpg;
import java.util.Random;

public class Inimigos {
    
    public int ataqueInimigo;
    public int getAtaqueInimigo() {
		return ataqueInimigo;
	}

	public void setAtaqueInimigo(int ataqueInimigo) {
		this.ataqueInimigo = ataqueInimigo;
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

	public int vidaInimigo;
    public String nomeInimigo;

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
            "Sidney Sujismundo"
        };
        int n = rand.nextInt(inimigos.length);
        return inimigos[n];
    }
}
