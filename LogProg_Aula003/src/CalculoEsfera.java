import java.util.Scanner;

public class CalculoEsfera {
	public static void main (String[] args) {
	// DECLARAÇÃO DE VARIÁVEIS
	Scanner leitor = new Scanner(System.in);
	double raio = 0;
	double vol = 0;
	
	// ENTRADA DE DADOS
	System.out.print("Informe o raio da esfera: ");
	raio = leitor.nextDouble();
	
	leitor.close();
	
	// PROCESSAMENTO
	vol = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
	
	// SAÍDA DE DADOS
	System.out.println("O volume da esfera é: " + vol);
	}
	
}