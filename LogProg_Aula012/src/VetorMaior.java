import java.util.Scanner;

public class VetorMaior {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int [5];
		
		int posicaoIndiceVetorMaiores = 0;
		
		int[] vetorMaiores = new int [10];
		
		int valorLimite = 0;
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			System.out.print("Informe o Valor da Posi��o " + i + " do Vetor: ");
			vetorOriginal [i] = leitor.nextInt();
		}
		System.out.print("Informe o Valor Limite: ");
		valorLimite = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			if (valorLimite < vetorOriginal[i]) {
				posicaoIndiceVetorMaiores = posicaoIndiceVetorMaiores + 1;
				vetorMaiores [posicaoIndiceVetorMaiores - 1] = vetorOriginal [i];
			}
		}
		for (int i = 0 ; i != posicaoIndiceVetorMaiores ; i++) {
			System.out.println("Valor da Posi��o " + i + " dos Maiores do Vetor: " + vetorMaiores[i]);
		}
	}
}
