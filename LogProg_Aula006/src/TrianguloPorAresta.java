import java.util.Scanner;

public class TrianguloPorAresta {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor =  new Scanner(System.in);
		double ladoA = 0;
		double ladoB = 0;
		double ladoC = 0;
		
		//ENTRADA DE DADOS
		System.out.println("Informe o valor do  lado A: ");
		ladoA = leitor.nextDouble();
		System.out.println("Informe o valor do  lado B: ");
		ladoB = leitor.nextDouble();
		System.out.println("Informe o valor do  lado C: ");
		ladoC = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		if (((ladoA + ladoB) <= ladoC) ||
				((ladoA + ladoC) <= ladoB) ||
				((ladoB + ladoC) <= ladoA)) {
			System.out.println("Isso não é um triângulo, seu imbecil!");
		}else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("O triângulo é equilátero.");			
		} else if (ladoA != ladoB && ladoB != ladoC) {
			System.out.println("O triângulo é isóceles.");
		} else {
			System.out.println("O triângulo é escaleno.");
		}
		
	}
}
