import java.util.Scanner;

public class CalculoIMC {
	public static void main (String[] args) {
		// DECLARA��O VARI�VEIS
		Scanner leitor = new Scanner(System.in); // "scann" + Ctrl + Space
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Informe o peso (quilos): "); // "syso" + Ctrl + Space
		peso = leitor.nextDouble();
		
		System.out.print("Informe a altura (metros): ");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		imc = peso / Math.pow(altura, 2);
		
		// SA�DA DE DADOS
		System.out.print("Um indiv�duo com essas m�tricas possui um IMC equivalente � " + imc + " kg/m2.");		
	}
}