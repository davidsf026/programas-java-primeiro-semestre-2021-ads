import java.util.Scanner;

public class QuadradoPerfeito {
	private static final int TAMANHO_DO_QUADRADO = 3;
	
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int[] [] quadrado = new int[TAMANHO_DO_QUADRADO] [TAMANHO_DO_QUADRADO];
		
		int soma = 0;
		int temp = 0;
		
		boolean magico = true;
		
		//ENTRADA DE DADOS
		for (int l = 0 ; l < quadrado.length ; l++) {
			for (int c = 0 ; c < quadrado.length ; c++) {
				System.out.print("Informe o valor da posição [" + l + "] [" + c + "]: ");
				quadrado[l] [c] = leitor.nextInt();				
			}
		}
		
		leitor.close();
		
		//DIAGONAL PRINCIPAL
		for (int i = 0 ; i < TAMANHO_DO_QUADRADO ; i++) {
			soma = soma + quadrado[i] [i];			
		}
		
		//DIAGONAL SECUNDÁRIA
		for (int i = 0 ; i < TAMANHO_DO_QUADRADO ; i++) {
			temp = temp + quadrado[i] [TAMANHO_DO_QUADRADO - i - 1];
			}
		
		if (soma != temp) {
			magico = false;
		}
		
		//HORIZONTAL
		for (int l = 0 ; l < quadrado.length ; l++) {
			if (temp != soma) {
				magico = false;
				break;
			}
			temp = 0;
			for (int c = 0 ; c < quadrado.length ; c++) {
				temp = quadrado[l] [c] + temp;
			}
		}
		
		//VERTICAL
		for (int c = 0 ; c < quadrado.length ; c++) {
			if (temp != soma) {
				magico = false;
				break;
			}
			temp = 0;
			for (int l = 0 ; l < quadrado.length ; l++) {
				temp = quadrado[l] [c] + temp;
			}
		}
		
		//SAÍDA DE DADOS
		if (magico == true) {
			System.out.println("Parabéns, você encontrou um quadrado mágico!");
		}
		
		else {
			System.out.println("Esse não é um quadrado mágico!");
		}
	}
}
