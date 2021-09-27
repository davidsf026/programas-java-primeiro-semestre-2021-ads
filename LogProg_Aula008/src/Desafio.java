//O SISTEMA ABAIXO FOI EM FEITO EM JAVA

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double reposta = 0;
		
		double windowsServer = 0;
		double unix = 0;
		double linux = 0;
		double netware = 0;
		double macOS = 0;
		double outro = 0;
		
		double total = 0;
		
		System.out.println("________________________________");
		System.out.println("|                              |");
		System.out.println("| >>>> Tabela de escolhas <<<< |");
		System.out.println("|______________________________|");
		System.out.println("|                              |");
		System.out.println("| Finalizar o Programa:......0 |");
		System.out.println("| Windows Server:............1 |");
		System.out.println("| Unix:......................2 |");
		System.out.println("| Linux:.....................3 |");
		System.out.println("| Netware:.................. 4 |");
		System.out.println("| Mac OS:....................5 |");
		System.out.println("| Outro:.....................6 |");
		System.out.println("|______________________________|");
		System.out.println("");
		
		do {
			
			System.out.print(">>> Informe a sua escolha: ");
			reposta = leitor.nextInt();
			
			if (reposta == 1) {
				windowsServer += 1;
			} else if (reposta == 2) {
				unix += 1;
			} else if (reposta == 3) {
				linux += 1;
			} else if (reposta == 4) {
				netware += 1;
			} else if (reposta == 5) {
				macOS += 1;
			} else if (reposta == 6) {
				outro += 1;
			} else if (reposta == 0) {
				
			} else {
				System.out.println("Erro! Informe um valor entre 0 e 6.");
			}
		} while (reposta != 0);		
		
		leitor.close();
		
		total = windowsServer + unix + linux + netware + macOS + outro;
		
		System.out.println("");
		System.out.println("1 - Windows Server: " + (windowsServer / total) * 100 + "%");
		System.out.println("2 - Unix: " + (unix / total) * 100 + "%");
		System.out.println("3 - Linux: " + (linux / total) * 100 + "%");
		System.out.println("4 - Netware: " + (netware / total) * 100 + "%");
		System.out.println("5 - Mac OS: " + (macOS / total) * 100 + "%");
		System.out.println("6 - Outro: " + (outro / total) * 100 + "%");
	}
}