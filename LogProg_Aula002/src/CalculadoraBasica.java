import java.util.Scanner;

public class CalculadoraBasica {
	public static void main (String[] args) {
		// Declara��o de Vari�veis
			Scanner leitor = new Scanner(System.in); // Sintaxe de Instancia��o de Objetos
			double n1 = 0;
			double n2 = 0;
			double resultadosoma = 0;
			double resultadosub = 0;
			double resultadomult = 0;
			double resultadodivi = 0;
			double resultadoresto = 0;
			
		// Entrada de Dados
		System.out.print("Informe o primeiro n�mero: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Informe o segundo n�mero: ");
		n2 = leitor.nextDouble();
		
		leitor.close();
		
		// Processsamento
		resultadosoma = (n1 + n2);
		resultadosub = (n1 - n2);
		resultadomult = (n1 * n2);
		resultadodivi = (n1 / n2);
		resultadoresto = (n1 % n2);
		
		// Sa�da de Dados
		System.out.println("A soma �: " + resultadosoma);
		System.out.println("A subtra��o �: " + resultadosub);
		System.out.println("A multiplica��o �: " + resultadomult);
		System.out.println("A divis� �: " + resultadodivi);
		System.out.println("O resto da divis�o �: " + resultadoresto);
	}
}