/**
 * 
 */
package Lanches;

import java.util.Scanner;

/**
 * @author Allen Xavier
 *
 */
public class Sanduiche extends Lanche{
	private  String ingredientes[] = new String[10];
    private  int tempoSanduiche = 15;
    private  int qtdItems;
    Scanner entrada = new Scanner(System.in);
    
    public int getTempoSanduiche() {
		return tempoSanduiche;
	}
    
    public int adicionarIngredientes() {
    	System.out.printf("Quais ingredientes você deseja para o Sanduiche? (Máx 10)" + "\n");
    	System.out.printf("Preço por ingrediente (R$2,00)" + "\n");
		for (int i = 0; i < ingredientes.length; i++) {
			ingredientes[i] = entrada.nextLine();
		if(ingredientes[i].equals("")) {
			if (i == 0) {
				System.out.printf("Como não foi escolhido nenhum ítem o Pedido não foi realizado" + "\n");
				qtdItems = 0;
				entrada.nextLine();
				break;
			}
			else {
				qtdItems = i;
				break;
			}   
		}
		}
		return qtdItems;
		}
    
    
}

