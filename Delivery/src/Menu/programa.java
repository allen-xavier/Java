/**
 * 
 */
package Menu;

import java.util.Scanner;

import Lanches.Bolos;
import Lanches.Lasanha;
import Lanches.Macarrao;
import Lanches.Massas;
import Lanches.Pizza;
import Lanches.Sanduiche;

/**
 * @author Allen Xavier
 *
 */
public class programa {

	public static void main(String[] args) {
		int tempo;
		String sabor;
		String molho;
		int distancia;
		Scanner entradaMain = new Scanner(System.in);
		System.out.println("Menu Delivery" + "\n");
		System.out.println("Qual o tipo de Lanche que Deseja Escolher?" + "\n");
		System.out.println("[1] Sanduiche");
		System.out.println("[2] Massas");
		System.out.println("[3] Bolos");
		System.out.println("[0] Sair");
		int escolha = entradaMain.nextInt();
		switch (escolha) {
		case 1:
			Sanduiche Sanduba = new Sanduiche();
			tempo = Sanduba.getTempoSanduiche();
			double ingredientes = Sanduba.adicionarIngredientes();
			if (ingredientes > 0) {
				ingredientes *= 2;
				distancia = Sanduba.distancia();
				System.out.println("Seu pedido: Sanduiche com está sendo preparado!" + "\n");
				Sanduba.retornoPedido(distancia, tempo, ingredientes);
			} else {
				main(args);
			}
			entradaMain.reset();
			entradaMain.close();
			break;
		case 2:
			Massas tipoMassa = new Massas();
			int tipo = tipoMassa.getTipoMassa();
			switch (tipo) {
			case 1:
				double custoMacarrao = 25.00;
				Macarrao macarrao = new Macarrao();
				tempo = macarrao.getTempoMassas();
				sabor = macarrao.tipoMacarrão();
				molho = macarrao.tipoMolho();
				distancia = macarrao.distancia();
				System.out.println("Seu pedido: Macarrão " + sabor + " ao " + molho + " está sendo preparado!" + "\n");
				macarrao.retornoPedido(distancia, tempo, custoMacarrao);
				break;
			case 2:
				double custoPizza = 20.00;
				Pizza pizza = new Pizza();
				tempo = pizza.getTempoMassas();
				sabor = pizza.saborPizza();
				molho = pizza.tipoMolho();
				distancia = pizza.distancia();
				System.out.println("Seu pedido: Pizza " + sabor + " ao " + molho + " está sendo preparado!" + "\n");
				pizza.retornoPedido(distancia, tempo, custoPizza);
				break;
			case 3:
				double custoLasanha = 60.00;
				Lasanha lasanha = new Lasanha();
				tempo = lasanha.getTempoMassas();
				sabor = lasanha.tipoLasanha();
				distancia = lasanha.distancia();
				System.out.println("Seu pedido: Lasanha de " + sabor + " está sendo preparado!" + "\n");
				lasanha.retornoPedido(distancia, tempo, custoLasanha);
				break;
			default:
				System.out.println("Ocorreu um Erro inesperado!!" + "\n");
				break;
			}
			break;
		case 3:
			double custoBolo = 40.00;
			Bolos bolo = new Bolos();
			tempo = bolo.getTempoBolos();
			sabor = bolo.getTipoMassa();
			String recheio = bolo.getTipoRecheio();
			String cobertura = bolo.getTipoCobertura();
			distancia = bolo.distancia();
			System.out.println("Seu pedido: Bolo de " + sabor + " com recheio de " + recheio +" e cobertura de " + cobertura +" está sendo preparado!" + "\n");
			bolo.retornoPedido(distancia, tempo, custoBolo);
			break;
		case 0:
			System.out.println("Obrigado e Volte Sempre!!");
			break;
		default:
			System.out.println("Escolha uma opção válida!!");
			main(args);
		}
	}

};