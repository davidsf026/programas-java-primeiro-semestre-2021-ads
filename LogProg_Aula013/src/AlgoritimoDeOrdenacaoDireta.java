import java.util.Scanner;

public class AlgoritimoDeOrdenacaoDireta {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[5];
		
		int temp = 0;
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe o vetor da posição [" + i + "]: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		for (int k = 0 ; k < vetor.length - 1; k++) {
			System.out.print(vetor[k] + ", ");
		}
		System.out.println(vetor[vetor.length - 1]);
		
		//PROCESSAMENTO
		for (int i = 0 ; i < vetor.length - 1 ; i++) {
			for (int j = (i + 1) ; j < vetor.length ; j++) {
				if (vetor[i] > vetor[j]) {
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				for (int k = 0 ; k < vetor.length - 1; k++) {
					System.out.print(vetor[k] + ", ");
				}
				System.out.println(vetor[vetor.length - 1]);
			}
		}
		
		//SAÍDA DE DADOS
		System.out.println("\n" + "Resultado: ");
		for (int i = 0 ; i < vetor.length - 1; i++) {
			System.out.print(vetor[i] + ", ");
		}
		System.out.print(vetor[vetor.length - 1]);
	}
}