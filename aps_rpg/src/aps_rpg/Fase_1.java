package aps_rpg;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import aps_rpg_Textos.Texto_Fase_01;
import aps_rpg_Textos.Texto_Fase_03;

public class Fase_1 extends Personagem_Principal{
	
		private Scanner escrever = new Scanner(System.in);
		private long delay = 4000L;
		public Fase_1(String nome) {
			super(nome);
			nome = this.nome;

		}

		public void pausaBreve(int valor) {
		    try {
		        Thread.sleep(valor); // Pausa por 2 segundo
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		 }
		}

		public int valor;

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
		public void escolha(int valor) {
			Texto_Fase_01 textoFase01 = new Texto_Fase_01(nome); 

	        if (valor == 1) {
	        	 this.a = true;
	             System.out.println(textoFase01.txt01);
	             pausaBreve(2000);
	             System.out.println("--------------------------");
                 System.out.println("Digite 0 para continuar...");
                 System.out.println("--------------------------");
	             int tecla1 = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
	             if (tecla1 == 0) {
	                 TimerTask task1 = new TimerTask() {
	                     public void run() {
	                    	 Timer timer = new Timer();
	        	             timer.schedule(new TimerTask() {
	        	                 @Override
	        	                 public void run() {
	        	                     System.out.println(textoFase01.txt02);	        	      	    	    	           	    	    	                 
	        	                 }
	        	                 
	        	             }, 3000); // 3000 milissegundos = 2 segundos
	        	           
	         
	                     }
	                     
	                 };
	                
	         
	                 long delay = 2000L; // 5 segundos em milissegundos
	     			 Timer timer = new Timer();
					timer.schedule(task1, delay);
	             } else {
	                 System.out.println("Você pressionou uma tecla diferente de 0. O programa será encerrado.");
	             }
	             // Atraso antes de mostrar o texto 02
	            
	        } else if (valor == 2) {
	            this.b = true;
	            Timer timer3 = new Timer();
	            timer3.schedule(new TimerTask() {
	                @Override
	                public void run() {
	                    System.out.println(textoFase01.txt03);

	                    // Intervalo antes de mostrar o texto 04
	                    Timer timer4 = new Timer();
	                    timer4.schedule(new TimerTask() {
	                        @Override
	                        public void run() {
	                            System.out.println(textoFase01.txt04);

	                            // Intervalo antes de mostrar o texto 05
	                            Timer timer5 = new Timer();
	                            timer5.schedule(new TimerTask() {
	                                @Override
	                                public void run() {
	                                    System.out.println(textoFase01.txt05);

	                                    // Intervalo antes de mostrar o texto 06
	                                    Timer timer6 = new Timer();
	                                    timer6.schedule(new TimerTask() {
	                                        @Override
	                                        public void run() {
	                                            System.out.println(textoFase01.txt06);

	                                            // Intervalo antes de mostrar o texto 07
	                                            Timer timer7 = new Timer();
	                                            timer7.schedule(new TimerTask() {
	                                                @Override
	                                                public void run() {
	                                                    System.out.println(textoFase01.txt07);
	                                                }
	                                            }, 3000); // Intervalo de 3 segundos entre o texto 06 e 07
	                                        }
	                                    }, 3000); // Intervalo de 3 segundos entre o texto 05 e 06
	                                }
	                            }, 3000); // Intervalo de 3 segundos entre o texto 04 e 05
	                        }
	                    }, 3000); // Intervalo de 3 segundos entre o texto 03 e 04
	                }
	            }, 3000); 
	        } else {
	            System.out.println("Opção inválida.");
	        }
	    }
	
		
		public void retornar() {
			System.out.println("Ao iniciar usa jornada "+ this.nome + ", você percebe algumas fontes de poluição.");
			pausaBreve(2000);
			long delay;
			System.out.println("Digite [1] para investigar os Esgotos Industriais.\nDigite [2] para investigar o Descarte irregular de lixo.");
			int escolhaF01 = escrever.nextInt();
			escolha(escolhaF01);
			if (escolhaF01 == 1) {
				pausaBreve(4000);
			}else if(escolhaF01 == 2) {
				pausaBreve(15000);
			}

			try {
	            Thread.sleep(this.delay);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			int tecla2 = 1;
		    while(tecla2 != 0 ) {
                 System.out.println("--------------------------");
                 System.out.println("Digite 0 para continuar...");
                 int tecla2a = Jogo.escrever.nextInt(); // Aguarda a entrada do usuário
                 System.out.println("--------------------------\n");
                 tecla2 = tecla2a;
             }
			
		}
}
