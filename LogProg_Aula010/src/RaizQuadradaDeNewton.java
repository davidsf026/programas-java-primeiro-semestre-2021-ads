import java.util.Scanner;
import java.util.Random;

public class RaizQuadradaDeNewton {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		double num = 0;
				
		double raizQuadrada = 0;
		
		//ENTRADA DE DADOS
		System.out.println("Digite o n�mero para calcular a ra�z quadrada: ");
		num = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMETNO
		raizQuadrada = (num * new Random().nextDouble());
		
		for (int i = 0 ; i < 50 ; i++) {
			raizQuadrada = ((raizQuadrada + ( num / raizQuadrada)) / 2);
		}
		
		//SA�DA DE DADOS
		System.out.println("O resultado da raiz quadrada calculado pelo Java �: " + Math.sqrt(num));
		System.out.println("O resultado da raiz quadrada calculado por Newton �: " + raizQuadrada);
	}
}
