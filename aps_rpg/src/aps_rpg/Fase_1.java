package aps_rpg;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Fase_01;
import aps_rpg_Textos.Texto_Fase_03;

public class Fase_1 extends Personagem_Principal{ // Herança
	
		private Scanner escrever = new Scanner(System.in);
		private long delay = 4000L;
		public Fase_1(String nome) { // Método Construtor
			super(nome);
			nome = this.nome;

		}
		private static String escolherFrase() {
	        String[] inimigos = {
	            "FLORESTA",
	            "POLUIÇAO",
	            "RECICLAGEM",
	            "SUSTENTABILIDADE",
	            "ECOSSISTEMA"
	        };
	        Random random = new Random();
	        return inimigos[random.nextInt(inimigos.length)];
		}

		public void pausaBreve(int valor) {
		    try {
		        Thread.sleep(valor); // Pausa por 2 segundo
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		 }
		}
		
		public void forca() {
	     
	        boolean vencer_forca = false;
	        while(vencer_forca != true) {
	        	String palavraChave = escolherFrase();
	   	        String letrasUsadas = "";
	   	        String palavraAdivinhada = "";
		        int MAX_TENTATIVAS = 20;
	
		        for (int tentativas = 0; tentativas < palavraChave.length(); tentativas++) {
		            palavraAdivinhada += "_";
		        }
	
		        for (int tentavivas = 0; tentavivas < MAX_TENTATIVAS; tentavivas++) {
		        	System.out.println("----------------------");
		            System.out.printf("Rodada %d. Até agora adivinhada: %s. Qual a sua próxima letra?%n", tentavivas, palavraAdivinhada);
		            System.out.print("Digite: ");
		            char letraTentada = escrever.next().toUpperCase().charAt(0);
		            if (letrasUsadas.indexOf(letraTentada) >= 0) {
		                System.out.printf("Você já tentou a letra %c.%n", letraTentada);
		            } else {
		                letrasUsadas += letraTentada;
	
		                if (palavraChave.indexOf(letraTentada) >= 0) {
		                    palavraAdivinhada = "";
		                    for (int j = 0; j < palavraChave.length(); j++) {
		                        palavraAdivinhada += letrasUsadas.indexOf(palavraChave.charAt(j)) >= 0 ? palavraChave.charAt(j) : "_";
		                    }
	
		                    if (palavraAdivinhada.contains("_")) {
		                        System.out.printf("Muito bom! %s existe na palavra. Ainda tem letras escondidas%n", letraTentada);
		                    } else {
		                        System.out.printf("Parabéns! A palavra adivinhada era '%s'%n", palavraAdivinhada);
		                        pausaBreve(4000);
		                        vencer_forca = true;
		                        break;
		                        
		                    }
		                } else {
		                    System.out.printf("Infelizmente a letra %c não existe na palavra.%n", letraTentada);
		                }
		            }
		        }
	        

	        if (!palavraAdivinhada.equals(palavraChave)) {
	            System.out.println("Foram 10 tentativas... Você perdeu! Não desista!");
	            pausaBreve(4000);
	            System.out.println("Você terá mais uma chance, o meio ambiente precisa de você!!!");
	            pausaBreve(4000);
	          
	        }
	        }
	        }

		public int valor = 3;

		public boolean a = false;
		public boolean b = false;
		private long delayp;
		public boolean getA() {
			return a;
		}
		public void setA(boolean a) {
			this.a = a;
		}
		public boolean getB() {
			return b;
		}
		public void setB(boolean b) {
			this.b = b;
		}
		
		
		 public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
		public int verificar() {
			int tecla = 1;
  		  	while(tecla != 0 ) {                   
  		  	System.out.println("--------------------------");
            System.out.print("Digite 0 para continuar: ");          
            int teclaa = Jogo.escrever.nextInt();
            System.out.println("--------------------------"); // Aguarda a entrada do usuário
                 if(teclaa == 0) {
              	   tecla = teclaa;
                 }                   
                  
               }
  		  	return tecla;
		}
		public void jogarDados(int valor) {

				if(valor == 1) {
					boolean vencer = false;		                	
		        	while(vencer != true) {
		        		Random r = new Random();
		            	int valorNPC = r.nextInt(6) + 1;
		            	int valorJogador = r.nextInt(6) + 1;
		            	int valorNPC2 = r.nextInt(6) + 1;
		            	int valorJogador2 = r.nextInt(6) + 1;
		            	int somaJogador = valorJogador + valorJogador2;
		            	int somaNPC = valorNPC + valorNPC2;
		        		if(somaJogador > somaNPC) {
		        			System.out.println("Seus dados foram de: " + valorJogador + " e " + valorJogador2);
		        			pausaBreve(2000);
		        			System.out.println("...");
		        			System.out.println("...");
		        			System.out.println("O dados do Morador foram de: " + valorNPC + " e " + valorNPC2);
		        			pausaBreve(2000);
		        			System.out.println("Meus Parabéns!! Você venceu!!!");
		        			vencer = true;
		        			verificar();
		        			break;
		        		}else if(valorNPC > somaJogador) {
		        			System.out.println("Seus dados foram de: " + valorJogador + " e " + valorJogador2);
		        			pausaBreve(2000);
		        			System.out.println("...");
		        			System.out.println("...");
		        			System.out.println("O dados do Morador foram de: " + valorNPC + " e " + valorNPC2);
		        			pausaBreve(2000);
		        			System.out.println("Você perdeu!! Tente denovo não desista!!!");
		        			verificar();
		        		}else {
		        			System.out.println("Seus dados foram de: " + valorJogador + " e " + valorJogador2);
		        			pausaBreve(2000);
		        			System.out.println("...");
		        			System.out.println("...");
		        			System.out.println("O dados do Morador foram de: " + valorNPC + " e " + valorNPC2);
		        			pausaBreve(2000);
		        			System.out.println("Quaaassee!!!! Tenta denovo!!!!!!");
		        			verificar();
		        		}}}
		        else {
				       System.out.println("--------------------------");
				       System.out.println("Xiiiiiiiiii! Você correu!!!");
				       pausaBreve(4000);
				       verificar();
				       pausaBreve(4000);				    
				        }		        	
        	}
		        
		
		
		public void escolha() {	
				boolean correto = false;
				int valor = 3;
				Texto_Fase_01 textoFase01 = new Texto_Fase_01(nome); 
				while(valor != 1 && valor != 2) {
					System.out.println("----------------------- Fase 01 -----------------------");
					System.out.println("Ao iniciar usa jornada "+ this.nome + ", você percebe algumas fontes de poluição.");
					pausaBreve(4000);
					while(!correto) {
					try {
				        System.out.println("Digite [1] para investigar os Esgotos Industriais.");
				        System.out.println("Digite [2] para investigar o Descarte irregular de lixo.");
				        System.out.println("----------------------------------------------");
				        System.out.print("Digite: ");
				        pausaBreve(2000);
				        
				        valor = escrever.nextInt();
				        
				        if (valor == 1 || valor == 2) {
				            correto = true;
				        } else {
				            System.out.println("--------------------------");
				            System.out.println("Opção inválida!");
				            System.out.println("--------------------------");
				            pausaBreve(2000);
				        }
				    } catch (InputMismatchException e) {
				        System.out.println("--------------------------");
				        System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
				        System.out.println("--------------------------");
				        pausaBreve(2000);
				        escrever.next(); // Limpa o buffer de entrada
				    }}
					
				if(valor == 1) {
						this.a = true;		        
				        System.out.println(textoFase01.txt01);
				        pausaBreve(2000);
				        int tecla = verificar();		        
				        if (tecla == 0) {		        
		                    System.out.println(textoFase01.txt02);
		                    pausaBreve(5000);	
		                    verificar();               
				        	pausaBreve(5000);	
			                System.out.println(textoFase01.txt08);
			                pausaBreve(2000);
			                forca();
			                verificar();
			               
			            
			        }/* Até Aqui Referente a primeira escolha.*/
				}else if(valor == 2) {
						this.b = true;
			            System.out.println(textoFase01.txt03);
		                verificar();
		                pausaBreve(4000);
		                System.out.println(textoFase01.txt04);
		                verificar();
		                pausaBreve(4000);
		                System.out.println(textoFase01.txt05);
		                verificar();
		                pausaBreve(4000);
		                System.out.println(textoFase01.txt06);
		                boolean valorCorreto = false;
		                while(!valorCorreto) {
		                	System.out.println(textoFase01.txt06);
		                	 int usuarioOP = escrever.nextInt();
				                if(usuarioOP == 1) {
				                	jogarDados(usuarioOP);
				                	break;
				                }else if(usuarioOP == 2) {
				                	jogarDados(usuarioOP);
				                	break;
				                }else {
				                	System.out.println("--------------------------");
				                	System.out.println("Opção inválida!");
				                	pausaBreve(4000);
				                }
		                }
		               
		             
		   
		          
					}}}}
			
			
			
		
	         
	        
			
	    
	
		

	
		
		

