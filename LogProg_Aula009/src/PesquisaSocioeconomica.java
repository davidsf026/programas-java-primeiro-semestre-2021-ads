import java.util.Scanner;

public class PesquisaSocioeconomica {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		int qtdPessoasCasa = 0;
		double rendaFamiliarPorCasa = 0;
		
		double qtdPessoasClasseA = 0;
		double qtdPessoasClasseB = 0;
		double qtdPessoasClasseC = 0;
		double qtdPessoasClasseD = 0;
		double qtdPessoasClasseE = 0;
		
		double percentualPessoasClasseA = 0;
		double percentualPessoasClasseB = 0;
		double percentualPessoasClasseC = 0;
		double percentualPessoasClasseD = 0;
		double percentualPessoasClasseE = 0;
		
		double totalPessoas = 0;
		
		String temMaisFamilia = "";
		
		//ENTRADA DE DADOS
		do {
			System.out.print("Informe quantas pessoas há na família: ");
			qtdPessoasCasa = leitor.nextInt();
			
			System.out.print("Informe a renda total da família: ");
			rendaFamiliarPorCasa = leitor.nextDouble();
			
			if (rendaFamiliarPorCasa/qtdPessoasCasa > 10000) {
				qtdPessoasClasseA = qtdPessoasClasseA + qtdPessoasCasa;
			} else if (rendaFamiliarPorCasa/qtdPessoasCasa > 5000) {
				qtdPessoasClasseB = qtdPessoasClasseB + qtdPessoasCasa;
			} else if (rendaFamiliarPorCasa/qtdPessoasCasa > 2000) {
				qtdPessoasClasseC = qtdPessoasClasseC + qtdPessoasCasa;
			} else if (rendaFamiliarPorCasa/qtdPessoasCasa > 1000) {
				qtdPessoasClasseD = qtdPessoasClasseD + qtdPessoasCasa;
			} else {
				qtdPessoasClasseE = qtdPessoasClasseE + qtdPessoasCasa;
			}
			
			System.out.print("Tem mais famílias? <S/N>: ");
			temMaisFamilia = leitor.next();
			
		} while (temMaisFamilia.equalsIgnoreCase("S"));
		
		leitor.close();
		
		//PROCESSAMENTO
		totalPessoas = (qtdPessoasClasseA + qtdPessoasClasseB + qtdPessoasClasseC + qtdPessoasClasseD + qtdPessoasClasseE);
		
		percentualPessoasClasseA = (qtdPessoasClasseA / totalPessoas) * 100;
		percentualPessoasClasseB = (qtdPessoasClasseB / totalPessoas) * 100;
		percentualPessoasClasseC = (qtdPessoasClasseC / totalPessoas) * 100;
		percentualPessoasClasseD = (qtdPessoasClasseD / totalPessoas) * 100;
		percentualPessoasClasseE = (qtdPessoasClasseE / totalPessoas) * 100;
		
		
		//SAÍDA DE DADOS
		System.out.println("");
		System.out.println("Percentual de Pessoas na Classe A: " + percentualPessoasClasseA + "%");
		System.out.println("Percentual de Pessoas na Classe B: " + percentualPessoasClasseB + "%");
		System.out.println("Percentual de Pessoas na Classe C: " + percentualPessoasClasseC + "%");
		System.out.println("Percentual de Pessoas na Classe D: " + percentualPessoasClasseD + "%");
		System.out.println("Percentual de Pessoas na Classe E: " + percentualPessoasClasseE + "%");
	}
}
