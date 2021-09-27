import java.util.Scanner;

public class TrianguloDeAsteriscos {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int baseTriangulo = 0;
		int temp = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe a base do triângulo: ");
		baseTriangulo = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO E SAÍDA DE DADOS
		//NORMAL
		for (int i = 1 ; i != baseTriangulo + 1 ; i++) {
			for (int j = 0 ; j != i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//ESPELHADO
		for (int i = baseTriangulo ; i != 0 ; i--) {
			for (int j = 1 ; j != i ; j++) {
				System.out.print(" ");
			}
			temp++;
			for (int x = 0; x != temp ; x++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		System.out.println("");
		
		//INVERTIDO
		for (int i = baseTriangulo ; i != 0 ; i--) {
			for (int j = 0 ; j != i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}