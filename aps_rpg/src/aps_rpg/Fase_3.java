package aps_rpg;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Fase_03;

public class Fase_3 extends Personagem_Principal {
	public Fase_3(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	Texto_Fase_03 texto_fase_03 = new Texto_Fase_03(nome);
	private Scanner escrever = new Scanner(System.in);
	Random r = new Random();
	public int opcao;
	private boolean escolhaA = false;
	private boolean escolhaB = false;

	
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
	
	public void pausaBreve() {
	    try {
	        Thread.sleep(2000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public void retornar() {
		System.out.println(texto_fase_03.txt01);
		 pausaBreve();
		System.out.println(texto_fase_03.txt02);
		 pausaBreve();
		this.opcao = escrever.nextInt();
		Escolha(opcao);
		boolean vencer = false;
		if(this.opcao == 1) {
			System.out.println(texto_fase_03.txt03);
			 pausaBreve();
			while(vencer != true) {
				int valor= r.nextInt(5) + 1;
				int valorJogador = r.nextInt(5) + 1;
				if(escolhaA == true) {
				
					System.out.println(texto_fase_03.txt04);
					 pausaBreve();
					this.opcao = escrever.nextInt();
					Escolha(opcao);
					if(valorJogador > valor) {
						System.out.println("Você venceu!!!");
						vencer = true;
						 pausaBreve();
					}else if(valorJogador == valor) {
						System.out.println("Quase!!! Tente novamente!!");
						 pausaBreve();
					}else {
						System.out.println("Você perdeu :( \nTente denovo! Não desista!");
						 pausaBreve();
					}
				}
			}
		}else if(this.opcao == 2) {
			System.out.println(texto_fase_03.txt05);
			pausaBreve();
			while(vencer != true) {
				int valor= r.nextInt(5) + 11;
				int valorJogador = r.nextInt(5) + 11;
				if(escolhaB == true) {

					System.out.println(texto_fase_03.txt06);
					this.opcao = escrever.nextInt();
					Escolha(opcao);
					if(this.opcao == 1) {
						if(valorJogador > valor) {
							System.out.println("Você venceu!!!");
							 pausaBreve();
							vencer = true;
						}else if(valorJogador == valor) {
							System.out.println("Quase!!! Tente novamente!!");
							 pausaBreve();
						}else {
							System.out.println("Você perdeu :( \nTente denovo! Não desista!");
							 pausaBreve();
						}
						vencer = true;
					}else if(this.opcao == 2) {
						if(valorJogador > valor) {
							System.out.println("Você venceu!!!");
							 pausaBreve();
							vencer = true;
						}else if(valorJogador == valor) {
							System.out.println("Quase!!! Tente novamente!!");
							 pausaBreve();
						}else {
							System.out.println("Você perdeu :( \nTente denovo! Não desista!");
							 pausaBreve();
						}
					}else {
						System.out.println("Valor invalido! Tente novamente");
						 pausaBreve();
					}
				}
			}
		}
		
	
	}
	
	
	
}
