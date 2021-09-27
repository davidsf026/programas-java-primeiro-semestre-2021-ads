import java.util.Scanner;

public class Exponencial {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int base = 0;
		int expo = 0;
		int rslt = 1;
		
		//ENTRADA DE DADOS
		System.out.print("Digite o número: ");
		base = leitor.nextInt();
		
		System.out.print("Digite o expoente: ");
		expo = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < expo ; i++) {
			rslt = (rslt * base);
		}
		
		//SAÍDA DE DADOS
		System.out.println("O resultado é: " + rslt);
	}
}
