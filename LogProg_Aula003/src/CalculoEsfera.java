import java.util.Scanner;

public class CalculoEsfera {
	public static void main (String[] args) {
	// DECLARA��O DE VARI�VEIS
	Scanner leitor = new Scanner(System.in);
	double raio = 0;
	double vol = 0;
	
	// ENTRADA DE DADOS
	System.out.print("Informe o raio da esfera: ");
	raio = leitor.nextDouble();
	
	leitor.close();
	
	// PROCESSAMENTO
	vol = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
	
	// SA�DA DE DADOS
	System.out.println("O volume da esfera �: " + vol);
	}
	
}