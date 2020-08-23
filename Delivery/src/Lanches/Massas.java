/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Massas extends Lanche {
	protected String molho;
	private int tempoMassas = 30;
	Scanner entrada = new Scanner(System.in);

	public int getTempoMassas() {
		return tempoMassas;
	}

	public int getTipoMassa() {
		System.out.println("Qual o tipo de Massa Deseja Escolher?" + "\n");
		System.out.println("[1] Macarrão");
		System.out.println("[2] Pizza");
		System.out.println("[3] Lasanha");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			return escolha;
		case 2:
			return escolha;
		case 3:
			return escolha;
		default:
			System.out.printf("Opção inválida, digite uma opção correta!" + "\n");
			return getTipoMassa();
		}
	}
}
