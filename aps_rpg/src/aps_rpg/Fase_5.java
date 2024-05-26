package aps_rpg;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import aps_rpg_Textos.Texto_Fase_05;

public class Fase_5 extends Personagem_Principal{ // Herança

	public Fase_5(String nome) { // Método Construtor
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	private Scanner escrever = new Scanner(System.in);
	public boolean EscolhaA;
	public boolean EscolhaB;
	Texto_Fase_05 texto_fase_05 = new Texto_Fase_05(nome);
	
	
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
	             System.out.print("Digite 0 para continuar: ");          
	             int teclaa = Jogo.escrever.nextInt();
	             System.out.println("--------------------------");// Aguarda a entrada do usuário
             if(teclaa == 0) {
          	   tecla = teclaa;
             }                   
              
           }
		  	return tecla;
	}
	
	public void Perguntas() {
		int pontuacao = 0;
        boolean vencer = false;
        int perguntas = 5;
        String[] respostasCorretas = {"c", "b", "a", "b", "c"};
        int contadorPerguntas = 0;
        
        while (!vencer) {
            if (pontuacao >= 3) {
            	System.out.println("--------------------------");
                System.out.println("Você venceu!");
     
                pausaBreve();
                verificar();
                vencer = true;
            } else if (contadorPerguntas == perguntas) {
                System.out.println("--------------------------");
                System.out.println("Você não conseguiu acertar as perguntas o suficiente. Você perdeu!");
                pausaBreve();             
                break; 
            }else {
                System.out.println(obterTextoPergunta(contadorPerguntas));
                System.out.print("Resposta: ");
                String op = escrever.next().toLowerCase();
                if(!op.equalsIgnoreCase("a") && !op.equalsIgnoreCase("b") && !op.equalsIgnoreCase("c")) {
                	System.out.println("--------------------------");
                	System.out.println("Opção inválida. Por favor, escolha entre A, B ou C.");
                	pausaBreve();
                }else {                	
  	                if (op.equalsIgnoreCase(respostasCorretas[contadorPerguntas])) {
  	                	System.out.println("--------------------------");
  	                    System.out.println("Você acertou!");
  	                    pausaBreve();
  	                    pontuacao += 1;
  	                } else {
  	                	System.out.println("--------------------------");
  	                    System.out.println("Resposta incorreta!");
  	                    pausaBreve();                  
  	                }
  	                contadorPerguntas++;
  	                pausaBreve();
                }
	              
            }
        }
    }
	public String obterTextoPergunta(int contador) {
        switch (contador) {
            case 0:
                return texto_fase_05.txt04;
            case 1:
                return texto_fase_05.txt05;
            case 2:
                return texto_fase_05.txt06;
            case 3:
                return texto_fase_05.txt07;
            case 4:
                return texto_fase_05.txt08;
            default:
            	System.out.println("--------------------------");
                return "Fim do jogo!\n--------------------------";              
        }
    }
	
	public void Escolha(int opcao) {
		while(opcao != 1 || opcao != 2) {
			if (opcao == 1) {
				this.EscolhaA = true;
				Perguntas();
				pausaBreve();
				break;
			}else if (opcao == 2) {
				this.EscolhaB = true;
				break;
			}else {
				System.out.println("--------------------------");
				System.out.println("Opção inválida.");
				System.out.println("--------------------------");
				pausaBreve();
			}
		}
	
	}


	public boolean getEscolhaA() { // Encapsulamento
		return EscolhaA;
	}


	public void setEscolhaA(boolean escolhaA) { // Encapsulamento
		EscolhaA = escolhaA;
	}


	public boolean getEscolhaB() { // Encapsulamento
		return EscolhaB;
	}


	public void setEscolhaB(boolean escolhaB) { // Encapsulamento
		EscolhaB = escolhaB;
	}
	
	

		
	public void IniciarFase5() {
		boolean correto = false;
		
		System.out.println(texto_fase_05.txt01);
		pausaBreve();
		verificar();
		pausaBreve();
		System.out.println(texto_fase_05.txt02);
		pausaBreve();
		while(!correto) {
			try {//Exceções
				System.out.println(texto_fase_05.txt03);
		        System.out.print("Digite: ");
		        int valor = escrever.nextInt();
		        pausaBreve();
		        
		        
		        if (valor == 1 || valor == 2) {
		        	Escolha(valor);
		            correto = true;
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
		System.out.println(texto_fase_05.txt09);
		pausaBreve();
		System.out.println(texto_fase_05.txt10);
		pausaBreve();
		System.out.println(texto_fase_05.txt11);
		pausaBreve();
		System.out.println(texto_fase_05.txt12);
		pausaBreve();
		System.out.println(texto_fase_05.txt13);
		pausaBreve();
		System.out.println(texto_fase_05.txt14);
		pausaBreve();
		System.out.println("FIM");
		System.out.println("--------------------------");

	}
	
	
	

	
}
