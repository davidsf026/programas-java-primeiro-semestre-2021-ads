import java.util.Scanner;

public class CalculoSomatorio {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		int repeticoes = 0;
		int resultado = 0;
		
		//ENTRADA DE DADOS E PROCESSAMENTO
		System.out.print("Informe o limite do somat�rio: ");
		repeticoes = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < repeticoes ; i++) {
			resultado += Math.pow(i, 2) + i + 3;
		}

		//SA�DA DE DADOS
		System.out.println("O resultado �: " + resultado);		
	}
}
