import java.util.Scanner;

public class ProvaRecuperacao {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
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
		
		//PROCESSAMENTO E SA�DA DE DADOS
		media = (n1 + n2 + n3)/3;
		
		if(media < 5) {
			System.out.print("RECUPERA��O! Fa�a a prova de recupera��o e digite a nota da mesma: ");
			nR = leitor.nextDouble();
			mediaFinal = (nR + media)/2;
			if (mediaFinal < 5) {
				System.out.println("REPROVADO! Voc� ter� que refazer o ano!");
			} else {
				System.out.println("APROVADO! Voc� passou gra�as a prova de recupera��o.");
			}
		leitor.close(); // NUNCA FECHE O LEITOR DENTRO DE UM IF/ELSE, ISSO PORQUE CASO O IF N�O ACONTE�A O LEITOR FICAR� ABERTO.
		} else {
			System.out.print("APROVADO! Voc� passou, parab�ns!");
		}
		}		
	}
