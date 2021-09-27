import java.util.Scanner;

public class Revisao2 {
	public static void main (String [] args) {
		
		// DECLARAÇÃO DE VARÁVEIS E OBJETOS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double soma = 0;
		double sub = 0;
		double mult = 0;
		double div = 0;
		double rest = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Escreva o primeiro número: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Escreva o segundo número: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
				
		// PROCESSAMENTO DE DADOS
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		rest = n1 % n2;
		
		// IMPRESSÃO DE DADOS
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + sub);
		System.out.println("Multiplicação = " + mult);
		System.out.println("Divisão = " + div);
		System.out.println("Resto = " + rest);
		
		
	}
}
