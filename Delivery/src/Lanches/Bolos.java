/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Bolos extends Lanche{
	protected String massa;
	protected String recheio;
	protected String cobertura;
	private int tempoBolos = 10;
	Scanner entrada = new Scanner(System.in);

	public int getTempoBolos() {
		return tempoBolos;
	}

	public String getTipoMassa() {
		String tipoMassa;
		System.out.println("Qual o tipo de Massa Deseja Escolher?" + "\n");
		System.out.println("[1] Chocolate");
		System.out.println("[2] Cenoura");
		System.out.println("[3] Baunilha");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			tipoMassa = "Chocolate";
			return tipoMassa;
		case 2:
			tipoMassa = "Cenoura";
			return tipoMassa;
		case 3:
			tipoMassa = "Baunilha";
			return tipoMassa;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return getTipoMassa();
		}
	}
	
	
	public String getTipoRecheio() {
		String tipoRecheio;
		System.out.println("Qual o Recheio para seu Bolo Deseja Escolher?" + "\n");
		System.out.println("[1] Chocolate");
		System.out.println("[2] Beijinho");
		System.out.println("[3] Prestígio");
		System.out.println("[4] Brigadeiro");
		System.out.println("[5] Chocolate Branco");
		System.out.println("[6] Frutas");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			tipoRecheio = "Chocolate";
			return tipoRecheio;
		case 2:
			tipoRecheio = "Beijinho";
			return tipoRecheio;
		case 3:
			tipoRecheio = "Prestígio";
			return tipoRecheio;
		case 4:
			tipoRecheio = "Brigadeiro";
			return tipoRecheio;
		case 5:
			tipoRecheio = "Chocolate Branco";
			return tipoRecheio;
		case 6:
			tipoRecheio = "Frutas";
			return tipoRecheio;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return getTipoRecheio();
		}
	}
	
	public String getTipoCobertura() {
		String tipoCobertura;
		System.out.println("Qual o tipo de Cobertura Deseja Escolher?" + "\n");
		System.out.println("[1] Chocolate");
		System.out.println("[2] Ganache");
		System.out.println("[3] Chantily");
		System.out.println("[4] Brigadeiro");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			tipoCobertura = "Chocolate";
			return tipoCobertura;
		case 2:
			tipoCobertura = "Ganache";
			return tipoCobertura;
		case 3:
			tipoCobertura = "Chantily";
			return tipoCobertura;
		case 4:
			tipoCobertura = "Brigadeiro";
			return tipoCobertura;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return getTipoCobertura();
		}
	}
	
}
