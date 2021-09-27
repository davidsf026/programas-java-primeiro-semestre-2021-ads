import java.util.Scanner;

public class CalculoAliquotaInss {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double resultado = 0;
		double salarioLiquido = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Digite o seu salário: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		resultado = (0.11 * salario);
		salarioLiquido = (salario - resultado);
		
		// SAÍDA DE DADOS
		System.out.println("A alíquota do INSS é: " + resultado);
		System.out.println("O salario líquido é: " + salarioLiquido);
	}
}
