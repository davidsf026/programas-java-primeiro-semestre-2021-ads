import java.util.Scanner;

public class CalculoAreaPiscina {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double comprimentoPiscina = 0;
		double larguraPiscina = 0;
		double alturaPiscina = 0;
		double areaPiscina = 0;
		
		double comprimentoAzulejos = 0;
		double larguraAzulejos = 0;
		double areaAzulejos = 0;
		
		double quantidadeAzulejos = 0;
		
		// ENTRADA DE DADOS
		System.out.print("Informe o comprimento do azulejo (centímetros): ");
		comprimentoAzulejos = leitor.nextDouble();
		
		System.out.print("Informe a largura do azulejo (centímetros): ");
		larguraAzulejos = leitor.nextDouble();
		
		System.out.print("Informe o comprimento da piscina (centímetros): ");
		comprimentoPiscina = leitor.nextDouble();
		
		System.out.print("Informe a largura da piscina (centímetros): ");
		larguraPiscina = leitor.nextDouble();
		
		System.out.print("Informe a altura da piscina (centímetros): ");
		alturaPiscina = leitor.nextDouble();	
		
		
		leitor.close();
		
		// PROCESSAMENTO
		areaPiscina = (alturaPiscina * larguraPiscina * 2) + (alturaPiscina * comprimentoPiscina * 2) + (comprimentoPiscina * larguraPiscina);
		
		areaAzulejos = comprimentoAzulejos * larguraAzulejos;
		
		quantidadeAzulejos = areaPiscina / areaAzulejos;
		
		// SAÍDA DE DADOS
		System.out.print("Serão necessários " + quantidadeAzulejos + " azulejos.");	
	}
}