import java.util.Scanner;

public class Revisao {
	public static void main (String [] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0, n2 = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Digite o primeiro número: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO E SAÍDA DE DADOS
		System.out.println("O resultado da soma é: " + (n1 + n2));
		System.out.println("O resultado da subtração é: " + (n1 - n2));
		System.out.println("O resultado da multiplicação é: " + n1 * n2);
		System.out.println("O resultado da divisão é: " + n1 / n2);
		System.out.println("O resultado do resto  é: " + n1 % n2);
	}
}