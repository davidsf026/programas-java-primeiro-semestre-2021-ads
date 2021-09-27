import java.util.Scanner;

public class OperacaoBancaria {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		int opcao = 0;
		
		double saldoInicial = 0;
		double saldoFinal = 0;
		
		double valorDeposito = 0;
		double valorSaque = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe quanto voc� tem em sua conta: ");
		saldoInicial = leitor.nextDouble();
		
		System.out.println("1 - Valor Inicial");
		System.out.println("2 - Fazer Dep�sito");
		System.out.println("3 - Fazer Saque");
		System.out.print("Informe a op��o: ");
		opcao = leitor.nextInt();
		
		//PROCESSAMENTO
		switch (opcao) {
			case 1:
				saldoFinal = saldoInicial;
				break;
			case 2:
				System.out.println("Informe o valor do dep�sito: ");
				valorDeposito = leitor.nextDouble();
				saldoFinal = saldoInicial + valorDeposito;
				
				break;
			case 3:
				System.out.println("Informe o valor do saque: ");
				saldoFinal = saldoInicial - valorSaque;
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
		}
		leitor.close();
		
		//SA�DA DE DADOS
		System.out.println("O valor final da sua conta �: " + saldoFinal);
	}
}