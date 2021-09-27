import java.util.Scanner;

public class PreenchimentoVetorInverso {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int[] vetorInverso = new int[5];
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe, por favor, o valor do índice [" + i +"]: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		//PROCESSAMENTO				
		for (int i = (vetor.length - 1) ; i >= 0 ; i--) {
			 vetorInverso[vetorInverso.length - 1 - i] = vetor[i];
		}
		
		//SAÍDA DE DADOS
		for (int i = 0 ; i < vetorInverso.length ; i++) {
			System.out.println("Índice [" + i + "] = " + vetorInverso[i]);
		}
	}
}
