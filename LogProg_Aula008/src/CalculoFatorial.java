import java.util.Scanner;

public class CalculoFatorial {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int numeroDeRepeticoes = 0;
		double fatorial = 1;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o número para o cálculo da fatorial: ");
		numeroDeRepeticoes = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = numeroDeRepeticoes ; i > 0 ; i--) {
			fatorial = fatorial * i;			
		}
		//SAÍDA DE DADOS
		System.out.println(numeroDeRepeticoes + "! = " + fatorial);
	}
}