import java.util.Scanner;

public class CalculoAliquotaInss {
	public static void main (String[] args) {
		// DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double resultado = 0;
		double salarioLiquido = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Digite o seu sal�rio: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		resultado = (0.11 * salario);
		salarioLiquido = (salario - resultado);
		
		// SA�DA DE DADOS
		System.out.println("A al�quota do INSS �: " + resultado);
		System.out.println("O salario l�quido �: " + salarioLiquido);
	}
}
