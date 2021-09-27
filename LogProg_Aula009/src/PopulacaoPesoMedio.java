import java.util.Scanner;

public class PopulacaoPesoMedio {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		double peso = 0;
		double media = 0;
		int tamanhoPopulacao = 0;
		
		String temMaisPessoas = "";
		
		//ENTRADA DE DADOS
		do {
			System.out.print("Informe o peso do indivíduo: ");
			peso =  leitor.nextDouble() + peso;
			
			tamanhoPopulacao++;
			
			System.out.print("Tem mais pessoas <S/N>? ");
			temMaisPessoas = leitor.next();
			
		} while (temMaisPessoas.equalsIgnoreCase("S"));
			   //temMaisPessoas = "S" or "s"
		leitor.close();
		
		//PROCESSAMENTO
		media =  peso/tamanhoPopulacao;
		
		//SAÍDA DE DADOS
		System.out.println("Em uma população de " + tamanhoPopulacao + " pessoas, o peso médio é " + media + " kg.");
	}
}
