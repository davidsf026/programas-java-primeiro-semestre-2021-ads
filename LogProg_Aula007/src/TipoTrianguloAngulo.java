import java.util.Scanner;

public class TipoTrianguloAngulo {
	public static void main (String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		double angulo1 = 0;
		double angulo2 = 0;
		double angulo3 = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o Valor do Primeiro Ângulo: ");
		angulo1 = leitor.nextDouble();
		System.out.print("Informe o Valor do Segundo Ângulo: ");
		angulo2 = leitor.nextDouble();
		System.out.print("Informe o Valor do Terceiro Ângulo: ");
		angulo3 = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		
		if (angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("Erro! Esse é um triângulo impossível.");
		} else if (angulo1 == 90 || angulo2 == 90.0 || angulo3 == 90.0) {
			System.out.println("Triângulo Retângulo.");
		} else if (angulo1 < 90 && angulo2 < 90.0 && angulo3 < 90.0) {
			System.out.println("Triângulo Acutângulo.");
		} else {
			System.out.println("Triângulo Obtusângulo.");
		}	
	}
}