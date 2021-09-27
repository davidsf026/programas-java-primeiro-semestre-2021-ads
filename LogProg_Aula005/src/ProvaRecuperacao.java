import java.util.Scanner;

public class ProvaRecuperacao {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double nR = 0;
		double media = 0;
		double mediaFinal = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe a nota 1: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Informe a nota 2: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Informe a nota 3: ");
		n3 = leitor.nextDouble();
		
		//PROCESSAMENTO E SAÍDA DE DADOS
		media = (n1 + n2 + n3)/3;
		
		if(media < 5) {
			System.out.print("RECUPERAÇÃO! Faça a prova de recuperação e digite a nota da mesma: ");
			nR = leitor.nextDouble();
			mediaFinal = (nR + media)/2;
			if (mediaFinal < 5) {
				System.out.println("REPROVADO! Você terá que refazer o ano!");
			} else {
				System.out.println("APROVADO! Você passou graças a prova de recuperação.");
			}
		leitor.close(); // NUNCA FECHE O LEITOR DENTRO DE UM IF/ELSE, ISSO PORQUE CASO O IF NÃO ACONTEÇA O LEITOR FICARÁ ABERTO.
		} else {
			System.out.print("APROVADO! Você passou, parabéns!");
		}
		}		
	}
