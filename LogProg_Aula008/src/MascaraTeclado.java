import java.util.Scanner;

public class MascaraTeclado {
	public static void main (String[] args) {
	//DECLARA��O DE VARI�VEIS
	Scanner leitor = new Scanner(System.in);
	int numero = 0;
	
	//ENTRADA DE DADOS E PROCESSAMENTO
	do {
		System.out.print("Digite um n�mero menor do que 10: ");
		numero = leitor.nextInt();		
	} while (numero > 10);
	
	leitor.close();
	
	//SA�DA DE DADOS
	System.out.print("Obrigado! Voc� digitou " + numero + ".");
	
	}
}