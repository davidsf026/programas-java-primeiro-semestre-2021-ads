import java.util.Scanner;

public class CalculoQuantidadeSalarioMinimo {
	public static void main (String[] args) {
		// DECLARA��O DE VARI�VEIS (EI CARA, A PRIMEIRA PALAVRA DE UMA VARI�VEL, TEM QUE TER LETRA MINSC)
		Scanner leitor = new Scanner(System.in);
		double salario;
		double salarioMin = 1100.00;
		double valorFinal;
		
		// ENTRADA DE DADOS
		System.out.print("Informe o valor de seu sal�rio: ");
		salario = leitor.nextDouble();
				
		leitor.close();
		
		// PROCESSAMENTO
		valorFinal = (salario / salarioMin);
		
		// SA�DA DE DADOS
		System.out.println("A quantidade de sal�rio m�nimos do seu sal�rio �: " + valorFinal);
	}
}
