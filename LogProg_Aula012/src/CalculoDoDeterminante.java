import java.util.Scanner;

public class CalculoDoDeterminante {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int matriz [] [] = new int [3] [3];
		
		int determinante = 0;
		
		//ENTRADA DE DADOS
		for (int l = 0 ; l < matriz.length ; l++ ) { //LINHA
			for (int c = 0 ; c < matriz[l].length ; c++) { //COLUNA
				System.out.print("Informe o valor da posição [" + l + "] [" + c + "]: ");
				matriz [l] [c] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		determinante = ((matriz [0] [0] * matriz [1] [1] * matriz [2] [2]) + (matriz [0] [1] * matriz [1] [2] * matriz [2] [0]) + (matriz [0] [2] * matriz [1] [0] * matriz [2] [1])) + (((matriz [0] [1] * matriz [1] [0] * matriz [2] [2]) + (matriz [0] [0] * matriz [1] [2] * matriz [2] [1]) + (matriz [0] [2] * matriz [1] [1] * matriz [2] [0]) ) * (-1));

		//SAÍDA DE DADOS
		System.out.print("\n");
		System.out.print(matriz [0] [0] + "\t");
		System.out.print(matriz [0] [1] + "\t");
		System.out.print(matriz [0] [2] + "\t");
		System.out.println("\n");
		System.out.print(matriz [1] [0] + "\t");
		System.out.print(matriz [1] [1] + "\t");
		System.out.print(matriz [1] [2] + "\t");
		System.out.println("\n");
		System.out.print(matriz [2] [0] + "\t");
		System.out.print(matriz [2] [1] + "\t");
		System.out.print(matriz [2] [2] + "\t");
		System.out.println("\n");
		System.out.println("Valor do Determinate: " + determinante);
	}
}
