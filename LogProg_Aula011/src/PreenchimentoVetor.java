import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[10];
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe, por favor, o valor do índice [" + i +"]: ");
			vetor[i] = leitor.nextInt();
		}
		leitor.close();
		
		//SAÍDA DE DADOS		
		System.out.println("");
		System.out.println("Os valores informados foram:");
		
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("Índice [" + i + "] = " + vetor[i]);
		}
	}
}
