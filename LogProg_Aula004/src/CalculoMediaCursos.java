import java.util.Scanner;

public class CalculoMediaCursos {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double primeiraNota = 0;
		double segundaNota = 0;
		double terceiraNota = 0;
		
		double media = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Informe a primeira nota: ");
		primeiraNota = leitor.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		segundaNota = leitor.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		terceiraNota = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		media = (primeiraNota + segundaNota + terceiraNota) / 3;
		
		// SAÍDA DE DADOS
		System.out.print("A média das notas é: " + media);
	}
}
