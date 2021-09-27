import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraTelefoneComDDD {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		String fone = "";
		
		//ENTRADA DE DADOS
		fone = mascaraFone();
		
		//SA�DA DE DADOS
		System.out.println(fone);
	
	}
	public static String mascaraFone() {
		String retorno = "";
		boolean tudoCerto = true;
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.print("Digite o seu numero de telefone <(XX)XXXXX-XXXX>: ");
				retorno = leitor.readLine();
				
				tudoCerto = true;
				
				if(!(retorno.length() == 14)) {
					tudoCerto = false;
				}	
				
				if (!retorno.substring(0, 1).equals("(")) {
					tudoCerto = false;
				}
				
				if (!retorno.substring(3, 4).equals(")")) {
					tudoCerto = false;
				}
				
				if (!retorno.substring(9, 10).equals("-")) {
					tudoCerto = false;
				}
				
			} catch (Exception e) {
				tudoCerto = false;
				
			}
		} while (tudoCerto == false);
		
		return retorno;		
	}
}
