import java.util.Scanner;

public class CalculoTempFarenheit {
	public static void main (String[] args) {
		// DECLARACAO DE VARIAVEIS
		Scanner leitor = new Scanner(System.in);
		double tempCelsius;
		double tempFarenheit;
		
		// ENTRADA DE DADOS
		System.out.print("Fala aí os graus: ");
		tempCelsius = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		tempFarenheit = ((9 * (tempCelsius / 5)) + 32);
		
		// SAÍDA DE DADOS
		System.out.println("A temperatura em graus Farenheit é: " + tempFarenheit);		
	}
}
