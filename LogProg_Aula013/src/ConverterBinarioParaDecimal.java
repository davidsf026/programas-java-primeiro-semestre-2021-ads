import java.util.Scanner;

public class ConverterBinarioParaDecimal {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		
		int decimal = 0;
		
		String binario = "";
		
		//ENTRADA DE DADOS
		System.out.print("Informe o numero binario a ser convertido para decimal: ");
		binario = leitor.next();
		
		leitor.close();
		
		//PROCESSAMENTO
		for (int i = 1 ; i < binario.length() + 1; i++) {
			decimal += (int) Math.pow(2, i - 1) * Integer.parseInt("" + binario.charAt(binario.length() - i));
		}
			
		System.out.println("O número binario " + binario + " é em decimal: " + decimal);
	}
}
