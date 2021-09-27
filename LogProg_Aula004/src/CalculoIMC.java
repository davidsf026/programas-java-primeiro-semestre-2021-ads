import java.util.Scanner;

public class CalculoIMC {
	public static void main (String[] args) {
		// DECLARAÇÃO VARIÁVEIS
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
		
		// SAÍDA DE DADOS
		System.out.print("Um indivíduo com essas métricas possui um IMC equivalente à " + imc + " kg/m2.");		
	}
}