import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MascaraDeEntrada {
	public static int lerNumeroMascaradoInt() { // Todos os nomes de fun��o s�o verbos no infinitivo que descrevem a fun��o da mesma
		//DECLARA��O DE VARI�VEIS
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int retorno = 0;
		boolean tudoCerto = false;
		
		//PROCESSAMENTO
		do {
			System.out.print("Digite um n�mero INTEIRO: ");
			try {
				retorno = Integer.parseInt(leitor.readLine());
				tudoCerto = true; //SE A LINHA DE CIMA DER ERRO, ELE PULA ESSA LINHA E VAI DIRETO PARA O CATCH
			} catch (Exception erro) {
				System.out.println("Erro! Voc� deve informar um n�mero inteiro, tente novamente...");
				tudoCerto = false;
			}
		} while (tudoCerto == false);
		
		//RETORNO DA FUN��O
		return retorno;
	}
		
		public static double lerNumeroMascaradoDouble() { // Todos os nomes de fun��o s�o verbos no infinitivo que descrevem a fun��o da mesma
			//DECLARA��O DE VARI�VEIS
			BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			double retorno = 0;
			boolean tudoCerto = false;
			
			//PROCESSAMENTO
			do {
				System.out.print("Digite um n�mero FRACION�RIO: ");
				try {
					retorno = Double.parseDouble(leitor.readLine());
					tudoCerto = true; //SE A LINHA DE CIMA DER ERRO, ELE PULA ESSA LINHA E VAI DIRETO PARA O CATCH
				} catch (Exception erro) {
					System.out.println("Erro! Voc� deve informar um n�mero fracion�rio, tente novamente...");
					tudoCerto = false;
				}
			} while (tudoCerto == false);
		
		
		
		//RETORNO DA FUN��O
		return retorno;
	}
		
		public static String lerNumeroMascaradoPorTamanho() { // Todos os nomes de fun��o s�o verbos no infinitivo que descrevem a fun��o da mesma
			//DECLARA��O DE VARI�VEIS
			BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			String retorno = "";
			boolean tudoCerto = false;
			
			//PROCESSAMENTO
			do {
				System.out.print("Digite um texto de CINCO CARACTERES: ");

					try {
						retorno = leitor.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (retorno.length() == 5) {
						tudoCerto = true;
					} else {				

					System.out.println("Erro! Voc� deve informar um n�mero fracion�rio, tente novamente...");
					tudoCerto = false;
					}
					} while (tudoCerto == false);
		
		
		//RETORNO DA FUN��O
		return retorno;
	}
		
	
	public static void main(String[] args) {
		System.out.println(lerNumeroMascaradoInt());
		System.out.println(lerNumeroMascaradoDouble());
		System.out.println(lerNumeroMascaradoPorTamanho());
		
	}
}
