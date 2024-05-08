package aps_rpg;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Fase_3 extends Personagem_Principal {
	public Fase_3(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private Scanner escrever = new Scanner(System.in);
	Random r = new Random();
	public int opcao;
	private boolean escolhaA = false;
	private boolean escolhaB = false;

	private String txt01 = "Após uma longa jornada, você "+nome+ " irá começar a restauração da vida aquática no rio.\nAo começar sua navegação você"
			+ "se depara com um Cardume Voraz de peixes \nmutantes que foram jogados pela MegaCorporation como seus animais de testes.";
	
	private String txt02 = "Há duas possibilides para você enfrentar esse cardume\n"
			+ "Digite [1] para Pescar\n"
			+ "Digite [2] para Luta corpo a corpo";
	
	private String txt03 = "Ao optar por pescar, o jogador decide utilizar técnicas de pesca sustentável para lidar com o Cardume Voraz. "
			+ "\nArmado com uma vara de pesca e um conhecimento aprimorado sobre as espécies nativas, o jogador parte em seu barco para o meio do Rio Tietê.";
	
	private String txt04 = "Digite [1] para iniciar o seu duelo contra o cardume na pesca!.";
	
	private String txt05 = "Ao escolher a luta corpo a corpo, você assume uma abordagem mais direta para enfrentar o Cardume Voraz. \nEquipado com um traje de mergulho e equipamentos de combate subaquático, o jogador mergulha nas águas turbulentas do Rio Tietê. "
			+ "\nLá, você se depara com os peixes invasores em seu próprio ambiente. ";
	
	private String txt06 = "Digite [1] para golpear o cardume usando suas maõs\n"
			+ "Digite [2] para golpear o cardume usando uma tronco de Eucalipto que você encontrou nas margens do rio";
	public void Escolha(int opcao) {
		if (opcao == 1) {
			this.escolhaA = true;
			
		}else if (opcao == 2) {
			this.escolhaB = true;
		}else {
			System.out.println("Opção inválida.");
		}
	}
	
	
	


	public void Vencedor() {
		
	}

	public boolean getEscolhaA() {
		return escolhaA;
	}

	public void setEscolhaA(boolean escolhaA) {
		this.escolhaA = escolhaA;
	}

	public boolean getEscolhaB() {
		return escolhaB;
	}

	public void setEscolhaB(boolean escolhaB) {
		this.escolhaB = escolhaB;
	}
	
	public void retornar() {
		System.out.println(txt01);
		System.out.println(txt02);
		this.opcao = escrever.nextInt();
		Escolha(opcao);
		boolean vencer = false;
		if(this.opcao == 1) {
			while(vencer != true) {
				int valor= r.nextInt(5) + 1;
				int valorJogador = r.nextInt(5) + 1;
				if(escolhaA == true) {
					System.out.println(txt03);
					System.out.println(txt04);
					this.opcao = escrever.nextInt();
					Escolha(opcao);
					if(valorJogador > valor) {
						System.out.println("Você venceu!!!");
						vencer = true;
					}else if(valorJogador == valor) {
						System.out.println("Quase!!! Tente novamente!!");
					}else {
						System.out.println("Você perdeu :( \nTente denovo! Não desista!");
					}
				}
			}
		}else if(this.opcao == 2) {
			while(vencer != true) {
				int valor= r.nextInt(5) + 11;
				int valorJogador = r.nextInt(5) + 11;
				if(escolhaB == true) {
					System.out.println(txt05);
					System.out.println(txt06);
					this.opcao = escrever.nextInt();
					Escolha(opcao);
					if(this.opcao == 1) {
						if(valorJogador > valor) {
							System.out.println("Você venceu!!!");
							vencer = true;
						}else if(valorJogador == valor) {
							System.out.println("Quase!!! Tente novamente!!");
						}else {
							System.out.println("Você perdeu :( \nTente denovo! Não desista!");
						}
						vencer = true;
					}else if(this.opcao == 2) {
						if(valorJogador > valor) {
							System.out.println("Você venceu!!!");
							vencer = true;
						}else if(valorJogador == valor) {
							System.out.println("Quase!!! Tente novamente!!");
						}else {
							System.out.println("Você perdeu :( \nTente denovo! Não desista!");
						}
					}else {
						System.out.println("Valor invalido! Tente novamente");
					}
				}
			}
		}
		
	
	}
	
	
	
}
