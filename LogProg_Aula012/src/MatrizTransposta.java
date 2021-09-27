import java.util.Scanner;

public class MatrizTransposta {
	private static final int LINHAS = 3;
	private static final int COLUNAS = 2;
	
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int[] [] matrizOriginal = new int [LINHAS] [COLUNAS];
		int[] [] matrizTransposta = new int [COLUNAS] [LINHAS];
		
		for (int l = 0 ; l < matrizOriginal.length ; l++) {
			for (int c = 0 ; c < matrizOriginal[l].length ; c++) {
				System.out.print("Informe o valor da posição [" + l + "] [" + c + "]: ");
				matrizOriginal[l] [c] = leitor.nextInt();
				matrizTransposta[c] [l] = matrizOriginal[l] [c];
			}			
		}
		leitor.close();
		
		for (int l = 0 ; l < matrizOriginal.length ; l++) {
			System.out.println("\n");
			for (int c = 0 ; c < matrizOriginal[l].length ; c++) {
				System.out.print(matrizOriginal[l] [c] + "\t");
			}
		}
		
		System.out.println("\n");
		
		for (int l = 0 ; l < matrizTransposta.length ; l++) {
			System.out.println("\n");
			for (int c = 0 ; c < matrizTransposta[l].length ; c++) {
				System.out.print(matrizTransposta[l] [c] + "\t");				
			}
		}
	}
}
