
public class NumeroPerfeito {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		int somaDosDivisores = 0;
		
		//PROCESSAMENTO
		for (int i = 0 ; true ; i++) {
			somaDosDivisores = 0;
			
			for (int j = 1 ; j <= (i / 2) ; j++) {
				if ((i % j) == 0) {
					somaDosDivisores = (somaDosDivisores+ j);
				}
			}
			
			if (somaDosDivisores == i) {
				System.out.println("Achei um n�mero perfeito: " + i);
			}
		}
	}
}
