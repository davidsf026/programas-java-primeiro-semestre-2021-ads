import java.util.Scanner;

public class Revisao3 {
	public static void main (String [] args) {
	
		// DECLARA��O DE VARI�VEIS E OBJETOS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double soma = 0;
		double sub = 0;
		double mult = 0;
		double div = 0;
		double rest = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Primeiro N�mero: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Segundo N�mero: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		rest = n1 % n2;
		
		// SA�DA DE DADOS
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + sub);
		System.out.println("Multiplica��o: " + mult);
		System.out.println("Divis�o: " + div);
		System.out.println("Resto: " + rest);
		
	}
}
