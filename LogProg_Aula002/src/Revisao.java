import java.util.Scanner;

public class Revisao {
	public static void main (String [] args) {
		// DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0, n2 = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO E SA�DA DE DADOS
		System.out.println("O resultado da soma �: " + (n1 + n2));
		System.out.println("O resultado da subtra��o �: " + (n1 - n2));
		System.out.println("O resultado da multiplica��o �: " + n1 * n2);
		System.out.println("O resultado da divis�o �: " + n1 / n2);
		System.out.println("O resultado do resto  �: " + n1 % n2);
	}
}