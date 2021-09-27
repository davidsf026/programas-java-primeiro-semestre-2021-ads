public class TrocaValorVariavel {
	public static void main(String[] args) {
		// Declaração de variáveis
		int a = 0; // Aqui eu declarei uma variável.
		int b = 0;
		int temp = 0;
		
		// Atribuição de valores às variáveis
		a=12;
		b=18;
		System.out.println("O valor da variável a é: " + a);
		System.out.println("O valor da variável a é: " + b);
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Saída de dados
		System.out.println("O novo valor da variável a é: " + a);
		System.out.println("O novo valor da variável a é: " + b);

	}
}