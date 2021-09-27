import java.util.Scanner;

public class CalculoQuantidadeSalarioMinimo {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS (EI CARA, A PRIMEIRA PALAVRA DE UMA VARIÁVEL, TEM QUE TER LETRA MINSC)
		Scanner leitor = new Scanner(System.in);
		double salario;
		double salarioMin = 1100.00;
		double valorFinal;
		
		// ENTRADA DE DADOS
		System.out.print("Informe o valor de seu salário: ");
		salario = leitor.nextDouble();
				
		leitor.close();
		
		// PROCESSAMENTO
		valorFinal = (salario / salarioMin);
		
		// SAÍDA DE DADOS
		System.out.println("A quantidade de salário mínimos do seu salário é: " + valorFinal);
	}
}
