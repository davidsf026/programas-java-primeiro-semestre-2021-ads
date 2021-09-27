import java.util.Scanner;

public class SomarOsDoisMenores {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double menor = 0;
		double segundoMenor = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Informe o valor 1: ");
		n1 = leitor.nextDouble();
		System.out.println("Informe o valor 2: ");
		n2 = leitor.nextDouble();
		System.out.println("Informe o valor 3: ");
		n3 = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		if (n1 < n2 && n1 < n3) {
			menor = n1;
			if (n2 < n3) {
			segundoMenor = n2;
			}else {
			segundoMenor = n3;
			}
		}
		else if (n2 < n1 && n2 < n3) {
			menor = n2;
			if (n1 < n3) {
			segundoMenor = n1;
			}else {
			segundoMenor = n3;
			}
		}
		else {
			menor = n3;
			if (n1 < n2) {
			segundoMenor = n1;
			}else {
			segundoMenor = n2;
			}
		}
		
		//SAÍDA DE DADOS
		System.out.println(menor + segundoMenor);
	}
}

// TAMBÉM SERIA POSSÍVEL FAZER DA SEGUINTE FORMA: VOCÊ ENCONTRA O MAIOR E SOMA OS DOIS RESTANTES, QUE LOGICAMENTE SERIAM OS DOIS MENORES.
