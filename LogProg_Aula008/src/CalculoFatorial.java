import java.util.Scanner;

public class CalculoFatorial {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		int numeroDeRepeticoes = 0;
		double fatorial = 1;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o n�mero para o c�lculo da fatorial: ");
		numeroDeRepeticoes = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = numeroDeRepeticoes ; i > 0 ; i--) {
			fatorial = fatorial * i;			
		}
		//SA�DA DE DADOS
		System.out.println(numeroDeRepeticoes + "! = " + fatorial);
	}
}