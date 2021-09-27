import java.util.Scanner;

public class ValidacaoLotesCheque {
	public static void main(String[] args) { //Atalho = "main"
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor =  new Scanner(System.in);
		
		int qtdChequesNoLote = 0;
		double valorTotalDoLote = 0;
		
		int qtdChequesContados = 0;
		double SomaDoValorIndividualDeCadaCheque = 0;
		
		String temMaisCheque = "";
		
		//ENTRADA DE DADOS
		System.out.print("Informe a quantidade de cheques no lote: ");
		qtdChequesNoLote = leitor.nextInt();
		
		System.out.print("Informe o valor total do lote: ");
		valorTotalDoLote = leitor.nextDouble();
		
		//PROCESSAMENTO
		do {
			System.out.print("Informe o valor do cheque: ");
			SomaDoValorIndividualDeCadaCheque = leitor.nextDouble() + SomaDoValorIndividualDeCadaCheque;
			
			qtdChequesContados++;
			
			System.out.print("Tem mais cheques? <S/N>: ");
			temMaisCheque = leitor.next();
			
		} while (temMaisCheque.equalsIgnoreCase("S"));
		
		leitor.close();
		
		//SAÍDA DE DADOS
		
		if (qtdChequesContados == qtdChequesNoLote && SomaDoValorIndividualDeCadaCheque == valorTotalDoLote) {
			System.out.println("O lote é válido!");
		} else {
				System.out.println("O lote é INválido!");
				
		}
	}
}
