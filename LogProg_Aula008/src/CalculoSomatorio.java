import java.util.Scanner;

public class CalculoSomatorio {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int repeticoes = 0;
		int resultado = 0;
		
		//ENTRADA DE DADOS E PROCESSAMENTO
		System.out.print("Informe o limite do somatório: ");
		repeticoes = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < repeticoes ; i++) {
			resultado += Math.pow(i, 2) + i + 3;
		}

		//SAÍDA DE DADOS
		System.out.println("O resultado é: " + resultado);		
	}
}
