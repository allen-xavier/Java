/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Pizza extends Massas {

	Scanner entrada = new Scanner(System.in);

	public String tipoMolho() {
		System.out.println("Qual o tipo de molho para sua Pizza?" + "\n");
		System.out.println("[1] Molho de Tomate");
		System.out.println("[2] Molho Bolonhesa");
		System.out.println("[3] Sem Molho");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			molho = "Molho de Tomate";
			return molho;
		case 2:
			molho = "Molho Bolonhesa";
			return molho;
		case 3:
			molho = "Sem Molho";
			return molho;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return tipoMolho();
		}
	}

	public String saborPizza() {
		String sabor;
		System.out.println("Qual o sabor para sua Pizza?" + "\n");
		System.out.println("[1] Calabresa");
		System.out.println("[2] Mussarela");
		System.out.println("[3] Portuguesa");
		System.out.println("[4] Frango c/ Catupiry");
		System.out.println("[5] Palmito");
		System.out.println("[6] A Moda");
		int escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			sabor = "Calabresa";
			return sabor;
		case 2:
			sabor = "Mussarela";
			return sabor;
		case 3:
			sabor = "Portuguesa";
			return sabor;
		case 4:
			sabor = "Frango c/ Catupiry";
			return sabor;
		case 5:
			sabor = "Palmito";
			return sabor;
		case 6:
			sabor = "A Moda";
			return sabor;
		default:
			System.out.println("Favor Escolher uma opção válida" + "\n");
			return saborPizza();
		}

	}

}
