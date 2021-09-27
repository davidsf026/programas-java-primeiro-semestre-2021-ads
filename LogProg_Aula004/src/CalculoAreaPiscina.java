import java.util.Scanner;

public class CalculoAreaPiscina {
	public static void main (String[] args) {
		// DECLARA��O DE VARI�VEIS
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
		System.out.print("Informe o comprimento do azulejo (cent�metros): ");
		comprimentoAzulejos = leitor.nextDouble();
		
		System.out.print("Informe a largura do azulejo (cent�metros): ");
		larguraAzulejos = leitor.nextDouble();
		
		System.out.print("Informe o comprimento da piscina (cent�metros): ");
		comprimentoPiscina = leitor.nextDouble();
		
		System.out.print("Informe a largura da piscina (cent�metros): ");
		larguraPiscina = leitor.nextDouble();
		
		System.out.print("Informe a altura da piscina (cent�metros): ");
		alturaPiscina = leitor.nextDouble();	
		
		
		leitor.close();
		
		// PROCESSAMENTO
		areaPiscina = (alturaPiscina * larguraPiscina * 2) + (alturaPiscina * comprimentoPiscina * 2) + (comprimentoPiscina * larguraPiscina);
		
		areaAzulejos = comprimentoAzulejos * larguraAzulejos;
		
		quantidadeAzulejos = areaPiscina / areaAzulejos;
		
		// SA�DA DE DADOS
		System.out.print("Ser�o necess�rios " + quantidadeAzulejos + " azulejos.");	
	}
}