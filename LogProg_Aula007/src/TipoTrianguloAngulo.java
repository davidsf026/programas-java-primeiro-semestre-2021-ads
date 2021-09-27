import java.util.Scanner;

public class TipoTrianguloAngulo {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		double angulo1 = 0;
		double angulo2 = 0;
		double angulo3 = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o Valor do Primeiro �ngulo: ");
		angulo1 = leitor.nextDouble();
		System.out.print("Informe o Valor do Segundo �ngulo: ");
		angulo2 = leitor.nextDouble();
		System.out.print("Informe o Valor do Terceiro �ngulo: ");
		angulo3 = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		
		if (angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("Erro! Esse � um tri�ngulo imposs�vel.");
		} else if (angulo1 == 90 || angulo2 == 90.0 || angulo3 == 90.0) {
			System.out.println("Tri�ngulo Ret�ngulo.");
		} else if (angulo1 < 90 && angulo2 < 90.0 && angulo3 < 90.0) {
			System.out.println("Tri�ngulo Acut�ngulo.");
		} else {
			System.out.println("Tri�ngulo Obtus�ngulo.");
		}	
	}
}