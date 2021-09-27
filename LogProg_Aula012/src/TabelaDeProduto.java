import java.util.Scanner;

public class TabelaDeProduto {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		double [] vetor = new double [0];
		double [] vetorTemp = new double [0];
		
		int codigoDoProduto = 0;
		double valorDoProduto = 0;
		
		//ENTRADA E PROCESSAMENTO DE DADOS
		do {
			System.out.print("Informe o código do produto: ");
			codigoDoProduto = leitor.nextInt();
			
			System.out.print("Informe o valor do produto: ");
			valorDoProduto = leitor.nextInt();
			
			if (codigoDoProduto > vetor.length) {
				
				vetorTemp = vetor;
				
				vetor = new double [codigoDoProduto + 1];
				
				vetor [codigoDoProduto] = valorDoProduto;
				
				for (int i = 0 ; i < vetorTemp.length ; i++) {
					vetor [i] =	vetorTemp [i];		
				}
			} else {
				vetor [codigoDoProduto] = valorDoProduto;
			}
			System.out.print("Digite <S> para informar um novo produto ou qualquer outra tecla para sair: ");
		} while (leitor.next().equalsIgnoreCase("S"));
		
		leitor.close();
		
		//SAÍDA DE DADOS
		System.out.println("+=======================+");
		System.out.println("|Tabela de Valores\t|");
		System.out.println("+=======================+");
		System.out.println("|Código\t| Valor\t\t|");
		System.out.println("+=======================+");
		for (int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] > 0) {
				System.out.println("|" + i + "\t|" + " R$ " + vetor[i] + "\t|");
			}
		}
		System.out.println("+=======================+");
	}
}