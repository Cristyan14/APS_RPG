package aps_rpg;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


import aps_rpg_Textos.Texto_Fase_03;

public class Fase_3 extends Personagem_Principal { // Herança
	public Fase_3(String nome) { // Método Construtor
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
	
	
	public boolean getEscolhaA() { // Encapsulamento
		return escolhaA;
	}

	public void setEscolhaA(boolean escolhaA) { // Encapsulamento
		this.escolhaA = escolhaA;
	}

	public boolean getEscolhaB() { // Encapsulamento
		return escolhaB;
	}

	public void setEscolhaB(boolean escolhaB) { // Encapsulamento
		this.escolhaB = escolhaB;
	}
	
	public void pausaBreve() {
	    try { // Exceções
	        Thread.sleep(2000); // Pausa por 2 segundo
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	public int verificar() {
		int tecla = 1;
		  	while(tecla != 0 ) {                   
		  		System.out.println("--------------------------");
	             System.out.print("Digite 0 para continuar: ");          
	             int teclaa = Jogo.escrever.nextInt();
	             System.out.println("--------------------------");// Aguarda a entrada do usuário
             if(teclaa == 0) {
          	   tecla = teclaa;
             }                   
              
           }
		  	return tecla;
	}
	
	public void retornar(Personagem_Principal jogador) {
		System.out.println(texto_fase_03.txt01);
		 pausaBreve();
		 verificar();
		 pausaBreve();
		boolean correto = false;
		while(!correto) {
			try {
			System.out.println(texto_fase_03.txt02);
		        System.out.print("Digite: ");
		        opcao = escrever.nextInt();
		        pausaBreve();
		        
		        
		        if (opcao == 1 || opcao == 2) {
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
		        escrever.next(); // Limpa o buffer de entrada
		    }}		
		pausaBreve();	
		Escolha(opcao);
		pausaBreve();
		boolean vencer = false;
	

			if(this.opcao == 1) {
				System.out.println(texto_fase_03.txt03);
				 pausaBreve();
				while(vencer != true) {
					int valor= r.nextInt(5) + 1;
					int valorJogador = r.nextInt(5) + 1;
					 pausaBreve();
					if(escolhaA == true) {				
						if(valorJogador > valor) {
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("Você venceu!!! O Grande Cardume de peixes foi vencido pela sua vara de pesca lendária, que você havia ganhado de seu antigo Sensei\n O Grande Mestre Oogway do Tiête!");

							pausaBreve();
							verificar();
							 pausaBreve();
							 System.out.println(texto_fase_03.txt07);
							 pausaBreve();
							 verificar();
							 pausaBreve();
							 pausaBreve();
							 System.out.println(texto_fase_03.txt08);
							 pausaBreve();
							 verificar();
							 pausaBreve();
							 Inimigos_Peixes.batalha(jogador);
							 System.out.println(texto_fase_03.txt09);
							 pausaBreve();
							 vencer = true;
						}else if(valorJogador == valor) {
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("...");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("O cardume de peixes segura a linha do seu anzol e te puxa pra água.");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("Moradores pulam na água para te ajudar!!!");
							verificar();
							 pausaBreve();
						}else {
							System.out.println("--------------------------------------------");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("...");
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("Você perdeu, sua vara de pesca se enroscou em um grande carro que estava no rio.");
							pausaBreve();
							System.out.println("--------------------------------------------");
							System.out.println("Um morador local te ajuda. Tente denovo!!!!!");
							verificar();
							 pausaBreve();
						}
					}
				}
			}else if(this.opcao == 2) {
				System.out.println(texto_fase_03.txt05);
				pausaBreve();
				verificar();
				pausaBreve();

				boolean correto1 = false;
				while(!correto1) {
					try {// Exceções
						System.out.println(texto_fase_03.txt06);
				        System.out.print("Digite: ");
				        opcao = escrever.nextInt();
				        pausaBreve();
				        
				        
				        if (opcao == 1 || opcao == 2) {
				            correto1 = true;
				        } else {
				            System.out.println("--------------------------");
				            System.out.println("Opção inválida!");
				            pausaBreve();
				        }
				    } catch (InputMismatchException e) {
				        System.out.println("--------------------------");
				        System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
				        pausaBreve();
				        escrever.next(); // Limpa o buffer de entrada
				    }}		
				pausaBreve();
				Escolha(opcao);
					int valor= r.nextInt(5) + 1;
					int valorJogador = r.nextInt(5) + 1;
					if(escolhaB == true) {
						if(this.opcao == 1) {
							if(valorJogador > valor) {
								System.out.println("--------------------------------------------");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("--------------------------------------------");
								System.out.println("Após longos golpes que você aprendeu com o Mestre Shifu Ecológico, você derrota o cardume de peixes!!");
								pausaBreve();
								verificar();
								 pausaBreve();
								 System.out.println(texto_fase_03.txt07);
								 pausaBreve();
								 verificar();
								 pausaBreve();
								 pausaBreve();
								 System.out.println(texto_fase_03.txt08);
								 pausaBreve();
								 verificar();
								 pausaBreve();
								 Inimigos_Peixes.batalha(jogador);
								 System.out.println(texto_fase_03.txt09);
								 pausaBreve();
								 vencer = true;
								 verificar();
				
							}else if(valorJogador == valor) {
								System.out.println("--------------------------------------------");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("--------------------------------------------");
								System.out.println("Seu braço fica preso em um pedaço de cano que estava na boca do peixe!!");
								 pausaBreve();
								System.out.println("--------------------------------------------");
								System.out.println("Um pescador pula na água para te ajudar!");
								pausaBreve();
								verificar();
								pausaBreve();
							}else {
								System.out.println("--------------------------------------------");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("...");
								pausaBreve();
								System.out.println("--------------------------------------------");
								System.out.println("Suas mãos foram envenadas, pois você as furou em um espinho venenoso!");
								pausaBreve();
								System.out.println("--------------------------------------------");
								System.out.println("Uma moradora local lhe concede uma poção anti-veneno");
								pausaBreve();
								verificar();
								pausaBreve();
							}
					
						}else if(this.opcao == 2) {
							boolean vencerOP2 = false;
							while(!vencerOP2) {							
								int valora= r.nextInt(5) + 11;
								int valorJogadora= r.nextInt(5) + 11;
								if(valorJogadora > valora) {
									System.out.println("--------------------------------------------");
									pausaBreve();
									System.out.println("...");
									pausaBreve();
									System.out.println("...");
									pausaBreve();
									System.out.println("--------------------------------------------");
									System.out.println("Utilizando sua espada de ferro, entregue por seus ancestrais, você consegue os derrotar!");
									pausaBreve();
									verificar();
									 pausaBreve();
									 System.out.println(texto_fase_03.txt07);
									 pausaBreve();
									 verificar();
									 pausaBreve();
									 pausaBreve();
									 System.out.println(texto_fase_03.txt08);
									 pausaBreve();
									 verificar();
									 pausaBreve();
									 Inimigos_Peixes.batalha(jogador);
									 Inimigos_Peixes.batalha(jogador);
									 System.out.println(texto_fase_03.txt09);
									 pausaBreve();
									 vencerOP2 = true;
								}else if(valorJogadora == valora) {
									System.out.println("--------------------------------------------");
									pausaBreve();
									System.out.println("...");
									pausaBreve();
									System.out.println("...");
									pausaBreve();
									System.out.println("--------------------------------------------");
									System.out.println("Sua espada quase quebra!!");
									 pausaBreve();
									 System.out.println("--------------------------------------------");
									System.out.println("Um morador que é ferreiro te ajuda!");
									pausaBreve();
									verificar();
									pausaBreve();
								}else {
									 pausaBreve();
										pausaBreve();
										System.out.println("--------------------------------------------");
										System.out.println("...");
										pausaBreve();
										System.out.println("...");
										pausaBreve();
									System.out.println("--------------------------------------------");
									System.out.println("Os peixes conseguem tomar sua espada!!!!");
									System.out.println("--------------------------------------------");
									 pausaBreve();
									System.out.println("Um morador que é mergulhador consegue a recuperar!!");
	
									pausaBreve();
									verificar();
									pausaBreve();
								}
							}
						}else {
							System.out.println("--------------------------------------------");
							System.out.println("Valor invalido! Tente novamente");
							System.out.println("--------------------------------------------");
							 pausaBreve();
						}
		}
		
				
			}
		}
		
	
	}
	
	


