import java.util.Scanner;
import java.util.Random;

public class RaizQuadradaDeNewton {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		double num = 0;
				
		double raizQuadrada = 0;
		
		//ENTRADA DE DADOS
		System.out.println("Digite o número para calcular a raíz quadrada: ");
		num = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMETNO
		raizQuadrada = (num * new Random().nextDouble());
		
		for (int i = 0 ; i < 50 ; i++) {
			raizQuadrada = ((raizQuadrada + ( num / raizQuadrada)) / 2);
		}
		
		//SAÍDA DE DADOS
		System.out.println("O resultado da raiz quadrada calculado pelo Java é: " + Math.sqrt(num));
		System.out.println("O resultado da raiz quadrada calculado por Newton é: " + raizQuadrada);
	}
}
