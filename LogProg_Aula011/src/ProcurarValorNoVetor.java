import java.util.Scanner;

public class ProcurarValorNoVetor {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int [5];
		
		int consulta = 0;
		
		boolean confirmacao = false;
		
		//ENTRADA DE DADOS
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Preencha o índice [" + i + "]: ");
			vetor[i] = leitor.nextInt();
		}
		System.out.print("Todos os dados do vetor foram preenchidos, agora digite um número para saber se ele existe no vetor: ");
		consulta = leitor.nextInt();
		
		leitor.close();
		
		for (int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] == consulta) {
				confirmacao = true;
				System.out.println("Encontrei!");
				break;
			}
		}
		if (confirmacao == false) {
			System.out.println("Não tem!");
		}
	}
}
