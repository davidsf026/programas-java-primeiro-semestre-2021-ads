import java.util.Scanner;

public class TrianguloPorAresta {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
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
			System.out.println("Isso n�o � um tri�ngulo, seu imbecil!");
		}else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("O tri�ngulo � equil�tero.");			
		} else if (ladoA != ladoB && ladoB != ladoC) {
			System.out.println("O tri�ngulo � is�celes.");
		} else {
			System.out.println("O tri�ngulo � escaleno.");
		}
		
	}
}
