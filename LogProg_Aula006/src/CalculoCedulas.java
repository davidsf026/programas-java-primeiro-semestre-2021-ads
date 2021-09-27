import java.util.Scanner;

public class CalculoCedulas {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int valor = 0;
		int qtdNota200 = 0;
		int qtdNota100 = 0;
		int qtdNota50 = 0;
		int qtdNota20 = 0;
		int qtdNota10 = 0;
		int qtdNota5 = 0;
		int qtdNota2 = 0;
		int qtdNota1 = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o valor do saque: ");
		valor = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		qtdNota200 = (valor / 200);
		valor = (valor % 200);
		
		qtdNota100 = (valor / 100);
		valor = (valor % 100);
		
		qtdNota50 = (valor / 50);
		valor = (valor % 50);
		
		qtdNota20 = (valor / 20);
		valor = (valor % 20);
		
		qtdNota10 = (valor / 10);
		valor = (valor % 10);
		
		qtdNota5 = (valor / 5);
		valor = (valor % 5);
		
		qtdNota2 = (valor / 2);
		valor = (valor % 2);
		
		qtdNota1 = (valor / 1);
				
		//SAÍDA DE DADOS
		if (qtdNota200 > 0) {
			System.out.println(qtdNota200 + " Notas(s) de 200 reais");
		}
		
		if (qtdNota100 > 0) {
			System.out.println(qtdNota100 + " Notas(s) de 100 reais");
		}
		
		if (qtdNota50 > 0) {
			System.out.println(qtdNota50 + " Notas(s) de 50 reais");
		}
		
		if (qtdNota20 > 0) {
			System.out.println(qtdNota20 + " Notas(s) de 20 reais");
		}
		
		if (qtdNota10 > 0) {
			System.out.println(qtdNota10 + " Notas(s) de 10 reais");
		}
		
		if (qtdNota5 > 0) {
			System.out.println(qtdNota5 + " Notas(s) de 5 reais");
		}
		
		if (qtdNota2 > 0) {
			System.out.println(qtdNota2 + " Notas(s) de 2 reais");
		}
		
		if (qtdNota1 > 0) {
			System.out.println(qtdNota1 + " Notas(s) de 1 reais");
		}
		
	}
}
