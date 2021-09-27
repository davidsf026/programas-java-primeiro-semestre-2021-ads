import java.util.Scanner;

public class DetectorNumerosPrimos {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int numeroDoUsuario = 0;
		int testePrimo = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o número: ");
		numeroDoUsuario = leitor.nextInt();
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = numeroDoUsuario - 1 ; (i - 1) > 0 ; --i) {
			testePrimo = numeroDoUsuario;
			testePrimo = testePrimo % i;
			
			if (testePrimo == 0) {
				System.out.println("Não é primo");
				break;
			}
		}
		if (testePrimo != 0) {
			System.out.println("É primo");
		}
	}
}
