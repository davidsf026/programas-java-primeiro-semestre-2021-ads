import java.util.Scanner;

public class PopulacaoPesoMedio {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		double peso = 0;
		double media = 0;
		int tamanhoPopulacao = 0;
		
		String temMaisPessoas = "";
		
		//ENTRADA DE DADOS
		do {
			System.out.print("Informe o peso do indiv�duo: ");
			peso =  leitor.nextDouble() + peso;
			
			tamanhoPopulacao++;
			
			System.out.print("Tem mais pessoas <S/N>? ");
			temMaisPessoas = leitor.next();
			
		} while (temMaisPessoas.equalsIgnoreCase("S"));
			   //temMaisPessoas = "S" or "s"
		leitor.close();
		
		//PROCESSAMENTO
		media =  peso/tamanhoPopulacao;
		
		//SA�DA DE DADOS
		System.out.println("Em uma popula��o de " + tamanhoPopulacao + " pessoas, o peso m�dio � " + media + " kg.");
	}
}
