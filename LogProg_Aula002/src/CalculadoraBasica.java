import java.util.Scanner;

public class CalculadoraBasica {
	public static void main (String[] args) {
		// Declaração de Variáveis
			Scanner leitor = new Scanner(System.in); // Sintaxe de Instanciação de Objetos
			double n1 = 0;
			double n2 = 0;
			double resultadosoma = 0;
			double resultadosub = 0;
			double resultadomult = 0;
			double resultadodivi = 0;
			double resultadoresto = 0;
			
		// Entrada de Dados
		System.out.print("Informe o primeiro número: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
		
		// Processsamento
		resultadosoma = (n1 + n2);
		resultadosub = (n1 - n2);
		resultadomult = (n1 * n2);
		resultadodivi = (n1 / n2);
		resultadoresto = (n1 % n2);
		
		// Saída de Dados
		System.out.println("A soma é: " + resultadosoma);
		System.out.println("A subtração é: " + resultadosub);
		System.out.println("A multiplicação é: " + resultadomult);
		System.out.println("A divisã é: " + resultadodivi);
		System.out.println("O resto da divisão é: " + resultadoresto);
	}
}