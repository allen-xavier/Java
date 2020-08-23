/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Lasanha extends Massas{
	Scanner entrada = new Scanner(System.in);

	public String tipoLasanha() {
		System.out.println("Qual o tipo de Lasanha?" + "\n");
		System.out.println("[1] Bolonhesa");
		System.out.println("[2] Frango");
		System.out.println("[3] 4 Queijos");
		System.out.println("[4] Molho ao Sugo");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			molho = "Bolonhesa";
			return molho;
		case 2:
			molho = "Frango";
			return molho;
		case 3:
			molho = "4 Queijos";
			return molho;
		case 4:
			molho = "Molho ao Sugo";
			return molho;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return tipoLasanha();
		}

	}
}
