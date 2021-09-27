import java.util.Scanner;

public class GinastaOlimpica {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double n5 = 0;
		double n6 = 0;
		double media = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o valor da primeira nota: ");
		n1 = leitor.nextDouble();
		System.out.print("Informe o valor da segunda nota: ");
		n2 = leitor.nextDouble();
		System.out.print("Informe o valor da terceira nota: ");
		n3 = leitor.nextDouble();
		System.out.print("Informe o valor da quarta nota: ");
		n4 = leitor.nextDouble();
		System.out.print("Informe o valor da quinta nota: ");
		n5 = leitor.nextDouble();
		System.out.print("Informe o valor da sexta nota: ");
		n6 = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n1 <= n5 && n1 <= n6) {
			n1 = 0;			
		} else if (n2 <= n1 && n2 <= n3 && n2 <= n4 && n2 <= n5 && n2 <= n6) {
			n2 = 0;			
		} else if (n3 <= n1 && n3 <= n2 && n3 <= n4 && n3 <= n5 && n3 <= n6) {
			n3 = 0;			
		} else if (n4 <= n1 && n4 <= n2 && n4 <= n3 && n4 <= n5 && n4 <= n6) {
			n4 = 0;			
		} else if (n5 <= n1 && n5 <= n2 && n5 <= n3 && n5 <= n4 && n5 <= n6) {
			n5 = 0;			
		} else if (n6 <= n1 && n6 <= n2 && n6 <= n3 && n6 <= n4 && n6 <= n5) {
			n6 = 0;			
		}		
		
		if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5 && n1 >= n6) {
			n1 = 0;			
		} else if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5 && n2 >= n6) {
			n2 = 0;			
		} else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5 && n3 >= n6) {
			n3 = 0;			
		} else if (n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5 && n4 >= n6) {
			n4 = 0;			
		} else if (n5 >= n1 && n5 >= n2 && n5 >= n3 && n5 >= n4 && n5 >= n6) {
			n5 = 0;			
		} else if (n6 >= n1 && n6 >= n2 && n6 >= n3 && n6 >= n4 && n6 >= n5) {
			n6 = 0;			
		}
		
		media = (n1 + n2 + n3 + n4 + n5 + n6) / 4;

		//SAÍDA DE DADOS
		System.out.println("A média é: " + media);
	}
}