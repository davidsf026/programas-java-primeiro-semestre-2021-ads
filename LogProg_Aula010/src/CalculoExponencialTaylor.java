import java.util.Scanner;

public class CalculoExponencialTaylor {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		double expoente = 0;
		
		double resultado = 0;
		double exponenciacao = 0;
		
		double fatorial = 0;
		
		//ENTRADA DE DADOS
		System.out.println("Digite o expoente: ");
		expoente = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 0 ; i < 100 ; i++) {
			fatorial = 1;
			exponenciacao = 1;
			
			for (int j = i ; j > 0 ; j--) {
				fatorial = fatorial * j;
			}
			
			for (int j = 0 ; j < i ; j++) {
				exponenciacao = (exponenciacao * expoente);
			}
			
			resultado = (resultado + (exponenciacao / fatorial));
		}
		//SAÍDA DE DADOS
		System.out.println("O resultado calculado pelo Java é: " + Math.pow(Math.E, expoente));
		System.out.println("O resultado calculado pelo Taylor é: " + resultado);
	}
}
