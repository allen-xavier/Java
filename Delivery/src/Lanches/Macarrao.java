/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Macarrao extends Massas{
	Scanner entrada = new Scanner(System.in);

	public String tipoMolho() {
		System.out.println("Qual o tipo de molho para seu Macarr�o?" + "\n");
		System.out.println("[1] Molho de Tomate");
		System.out.println("[2] Molho Bolonhesa");
		System.out.println("[3] Molho Branco");
		System.out.println("[4] Molho 4 Queijos");
		System.out.println("[5] Alho e �leo");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			molho = "Molho de Tomate";
			return molho;
		case 2:
			molho = "Molho Bolonhesa";
			return molho;
		case 3:
			molho = "Molho Branco";
			return molho;
		case 4:
			molho = "Molho 4 Queijos";
			return molho;
		case 5:
			molho = "Alho e �leo";
			return molho;
		default:
			System.out.println("Favor Escolher uma op��o v�lida" + "\n");
			return tipoMolho();
		}
	}

	public String tipoMacarr�o() {
		String tipo;
		System.out.println("Qual o tipo do Macarr�o?" + "\n");
		System.out.println("[1] Espaguete");
		System.out.println("[2] Penney");
		System.out.println("[3] Parafuso");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			tipo = "Espaguete";
			return tipo;
		case 2:
			tipo = "Penney";
			return tipo;
		case 3:
			tipo = "Parafuso";
			return tipo;
		default:
			System.out.println("Favor Escolher uma op��o v�lida" + "\n");
			return tipoMacarr�o();
		}

	}
}
