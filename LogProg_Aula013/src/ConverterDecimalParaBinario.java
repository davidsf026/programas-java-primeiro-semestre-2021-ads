import java.util.Scanner;

public class ConverterDecimalParaBinario {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		
		int decimal = 0;
		
		String binario = "";
		
		String temp = "";
		
		//ENTRADA DE DADOS
		System.out.print("Informe o numero decimal a ser convertido para binario: ");
		decimal = leitor.nextInt();
		
		leitor.close();
		
		//PROCESSAMENTO
		do {
			binario = binario + (decimal % 2);
			decimal = decimal / 2;
		} while (decimal > 0);
		
		for (int i = 1 ; i < binario.length() + 1; i++) {
			temp = temp + binario.charAt(binario.length() - i);
			
		}
		
		binario = temp;
			
		System.out.println("O n�mero informado � em decimal: " + binario);
	}
}
