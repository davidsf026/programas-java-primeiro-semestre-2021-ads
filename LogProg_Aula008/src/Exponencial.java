import java.util.Scanner;

public class Exponencial {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		int base = 0;
		int expo = 0;
		int rslt = 1;
		
		//ENTRADA DE DADOS
		System.out.print("Digite o n�mero: ");
		base = leitor.nextInt();
		
		System.out.print("Digite o expoente: ");
		expo = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < expo ; i++) {
			rslt = (rslt * base);
		}
		
		//SA�DA DE DADOS
		System.out.println("O resultado �: " + rslt);
	}
}
