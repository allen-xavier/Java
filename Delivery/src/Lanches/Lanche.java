/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public abstract class Lanche {
	private double preco;
	private int tempoPorKm = 10;
    private  int distancia = 0;
    Scanner entrada = new Scanner(System.in);

	public void retornoPedido(int distancia, int tempoPreparo, double custoInicial) {
		preco = custoInicial + (distancia * 1.50);
		int minutos = (distancia * tempoPorKm) + tempoPreparo;
		int horas = minutos / 60; 
		int minutosok = minutos % 60;
		
		System.out.printf("Valor Total de seu pedido: R$%.2f" + "\n", preco);
		
		if (horas>0) {
			System.out.printf("Previs�o de Entrega: %dh:%02dm", horas, minutosok);
		}
		else {
			System.out.printf("Previs�o de Entrega: %02dm", minutosok);
		}
	}
	
	public int distancia() {
    	System.out.printf("Qual a dist�ncia em KM at� o Restaurante?" + "\n");
    	System.out.printf("Custo do Frete: R$1,50 por KM" + "\n");
		distancia = entrada.nextInt();
		return distancia;
    }
	
}
