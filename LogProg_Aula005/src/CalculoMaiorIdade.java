import java.util.Scanner;

public class CalculoMaiorIdade {
	public static void main(String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Informe a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		// SAÍDA DE DADOS E PROCESSAMENTO
		if (idade >= 18) {
			System.out.println("Maior de idade!!! Vambora pro boteco!!!");
		} else {
			System.out.println("Menor de idade!!! Vai beber leite, neném!!!");
		}
	}
}
