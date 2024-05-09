package aps_rpg;

import java.util.Scanner;

import aps_rpg_Textos.Texto_Fase_05;

public class Fase_5 extends Personagem_Principal{

	public Fase_5(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	private Scanner escrever = new Scanner(System.in);
	public boolean EscolhaA;
	public boolean EscolhaB;
	Texto_Fase_05 texto_fase_05 = new Texto_Fase_05(nome);
	
	
	public void pausaBreve() {
	    try {
	        Thread.sleep(5000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public void Escolha(int opcao) {
		while(opcao != 1 || opcao != 2) {
			if (opcao == 1) {
				this.EscolhaA = true;
				System.out.println(texto_fase_05.txt03);
				pausaBreve();
				System.out.println(texto_fase_05.txt04);
				pausaBreve();
				break;
			}else if (opcao == 2) {
				this.EscolhaB = true;
				System.out.println(texto_fase_05.txt05);
				pausaBreve();
				System.out.println(texto_fase_05.txt06);
				pausaBreve();
				System.out.println(texto_fase_05.txt07);
				pausaBreve();
				break;
			}else {
				System.out.println("Opção inválida.");
			}
		}
	
	}


	public boolean getEscolhaA() {
		return EscolhaA;
	}


	public void setEscolhaA(boolean escolhaA) {
		EscolhaA = escolhaA;
	}


	public boolean getEscolhaB() {
		return EscolhaB;
	}


	public void setEscolhaB(boolean escolhaB) {
		EscolhaB = escolhaB;
	}
	
	public void IniciarFase5() {
		System.out.println(texto_fase_05.txt01);
		pausaBreve();
		System.out.println(texto_fase_05.txt02);
		int opcao = escrever.nextInt();
		pausaBreve();
		Escolha(opcao);
		pausaBreve();
	}
	
	
	

	
}
