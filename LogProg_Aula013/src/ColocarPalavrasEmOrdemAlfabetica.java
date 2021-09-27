import java.util.Scanner;

public class ColocarPalavrasEmOrdemAlfabetica {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		String[] vetor = new String[3];
		
		String temp = "";
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Informe o vetor da posição [" + i + "]: ");
			vetor[i] = leitor.next();
		}
		
		leitor.close();
				
		
		
		
		
		// LOG
		for (int k = 0 ; k < vetor.length - 1; k++) {
			System.out.print(vetor[k] + ", ");
		}
		// LOG
		
		
		
		
		
		System.out.println(vetor[vetor.length - 1]);
				
		//PROCESSAMENTO
		for (int i = 0 ; i < vetor.length - 1 ; i++) {
			for (int j = (i + 1) ; j < vetor.length ; j++) {
				if (vetor[i].compareTo(vetor[j]) > 0) {
					temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				
				
				
				// LOG
				for (int k = 0 ; k < vetor.length - 1; k++) {
					System.out.print(vetor[k] + ", ");
				}
				System.out.println(vetor[vetor.length - 1]);
				// LOG
				
				
				
				
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
