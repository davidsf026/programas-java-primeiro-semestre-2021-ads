import java.util.Scanner;

public class MultiplicaoDeMatrizes {
	private static final int LINHAS_A_E_LINHAS_RSTD = 2;
	private static final int COLUNAS_A_E_LINHAS_B = 2;
	private static final int COLUNAS_B_E_COLUNAS_RSTD = 2;	
	
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int[] [] matriz_A = new int[LINHAS_A_E_LINHAS_RSTD] [COLUNAS_A_E_LINHAS_B];
		int[] [] matriz_B = new int[COLUNAS_A_E_LINHAS_B] [COLUNAS_B_E_COLUNAS_RSTD];
		int[] [] matriz_RSTD = new int[LINHAS_A_E_LINHAS_RSTD] [COLUNAS_B_E_COLUNAS_RSTD];
		
		//ENTRADA DE DADOS (MATRIZ_A)
		for (int l = 0 ; l < LINHAS_A_E_LINHAS_RSTD ; l++) {
			for (int c = 0 ; c < COLUNAS_A_E_LINHAS_B ; c++) {
				System.out.print("Informe a Posição " + "[" + l + "] " + "[" + c + "] " + "da Matriz A: ");
				matriz_A [l] [c] = leitor.nextInt();
			}
		}
		System.out.print("\n");

		//ENTRADA DE DADOS (MATRIZ_B)
		for (int l = 0 ; l < COLUNAS_A_E_LINHAS_B ; l++) {
			for (int c = 0 ; c < COLUNAS_B_E_COLUNAS_RSTD ; c++) {
				System.out.print("Informe a Posição " + "[" + l + "] " + "[" + c + "] " + "da Matriz B: ");
				matriz_B [l] [c] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int LA_LRSTD = 0 ; LA_LRSTD < LINHAS_A_E_LINHAS_RSTD ; LA_LRSTD++) {
			for (int CA_LB = 0 ; CA_LB < COLUNAS_A_E_LINHAS_B ; CA_LB++) {
				for (int CB_CRSTD = 0 ; CB_CRSTD < COLUNAS_B_E_COLUNAS_RSTD ; CB_CRSTD++) {
					matriz_RSTD[LA_LRSTD] [CB_CRSTD] += matriz_A[LA_LRSTD] [CA_LB] * matriz_B[CA_LB] [CB_CRSTD];
				}
			}
		}
		
		//SAÍDA DE DADOS (MATRIZ_A)
		for (int l = 0 ; l < LINHAS_A_E_LINHAS_RSTD ; l++) {
			System.out.println("\n");
			for (int c = 0 ; c < COLUNAS_A_E_LINHAS_B ; c++) {
				System.out.print(matriz_A [l] [c] + "\t");
			}
		}
		System.out.println("\n");
				
		//SAÍDA DE DADOS (MATRIZ_B)
		for (int l = 0 ; l < COLUNAS_A_E_LINHAS_B ; l++) {
			System.out.println("\n");
			for (int c = 0 ; c < COLUNAS_B_E_COLUNAS_RSTD ; c++) {
				System.out.print(matriz_B [l] [c] + "\t");
			}
		}
		System.out.println("\n");
				
		//SAÍDA DE DADOS (MATRIZ_RSTD)
		for (int l = 0 ; l < COLUNAS_B_E_COLUNAS_RSTD ; l++) {
			System.out.println("\n");
			for (int c = 0 ; c < LINHAS_A_E_LINHAS_RSTD ; c++) {
				System.out.print(matriz_RSTD [l] [c] + "\t");
			}
		}
		System.out.println("\n");
	}
}
