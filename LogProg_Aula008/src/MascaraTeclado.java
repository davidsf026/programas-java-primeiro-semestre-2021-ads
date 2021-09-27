import java.util.Scanner;

public class MascaraTeclado {
	public static void main (String[] args) {
	//DECLARAÇÃO DE VARIÁVEIS
	Scanner leitor = new Scanner(System.in);
	int numero = 0;
	
	//ENTRADA DE DADOS E PROCESSAMENTO
	do {
		System.out.print("Digite um número menor do que 10: ");
		numero = leitor.nextInt();		
	} while (numero > 10);
	
	leitor.close();
	
	//SAÍDA DE DADOS
	System.out.print("Obrigado! Você digitou " + numero + ".");
	
	}
}