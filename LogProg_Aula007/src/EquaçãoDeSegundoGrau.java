import java.util.Scanner;

public class Equa��oDeSegundoGrau {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor =  new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		double x1 = 0;
		double x2 = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe o valor de (a): ");
		a = leitor.nextDouble();
		System.out.print("Informe o valor de (b): ");
		b = leitor.nextDouble();
		System.out.print("Informe o valor de (c): ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		x1 = ((-b + Math.sqrt(((Math.pow(b, 2)) - (4*a*c)))) / (2*a));
		x2 = ((-b - Math.sqrt(((Math.pow(b, 2)) - (4*a*c)))) / (2*a));
		
		//SA�DA DE DADOS
		System.out.println("O valor da ra�z x1 � igual �: " + x1);
		System.out.println("O valor da ra�z x2 � igual �: " + x2);
	}
}