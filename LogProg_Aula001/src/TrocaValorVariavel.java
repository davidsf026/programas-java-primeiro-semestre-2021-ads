public class TrocaValorVariavel {
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int a = 0; // Aqui eu declarei uma vari�vel.
		int b = 0;
		int temp = 0;
		
		// Atribui��o de valores �s vari�veis
		a=12;
		b=18;
		System.out.println("O valor da vari�vel a �: " + a);
		System.out.println("O valor da vari�vel a �: " + b);
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Sa�da de dados
		System.out.println("O novo valor da vari�vel a �: " + a);
		System.out.println("O novo valor da vari�vel a �: " + b);

	}
}