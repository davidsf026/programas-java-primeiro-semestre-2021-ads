import java.util.Scanner;

public class CalculoSegundos {
	public static void main (String[] args) {
		// DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		double d = 0;
		double h = 0;
		double m = 0;
		double s = 0;
		double valorFinal = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Informe os Dias: ");
		d = leitor.nextDouble();
		
		System.out.print("Informe as Horas: ");
		h = leitor.nextDouble();
		
		System.out.print("Informe os Minutos: ");
		m = leitor.nextDouble();
		
		System.out.print("Informe os Segundos: ");
		s = leitor.nextDouble();
		
		leitor.close();
		
		// PROCESSAMENTO
		valorFinal = ((d * 86400) + (h * 3600) + (m * 60) + (s));
		
		// SA�DA DE DADOS
		System.out.println("Os valores informados cont�m: " + valorFinal);
	}
}
