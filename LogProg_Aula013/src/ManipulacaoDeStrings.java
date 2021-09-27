import java.util.Scanner;

public class ManipulacaoDeStrings {
	public static void main(String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		String texto = "";
		String remova = "";
		String ocorrenciaDeUmaStringNoTexto = "";
		String textoInvertido = "";
		String temp = "";
		
		int qtd = 0;
		
		int indice = 0;
		
		//ENTRADA DE DADOS
		System.out.print("Informe a palavra: ");
		texto = leitor.nextLine();
		
		System.out.print("Informe o caractere a ser removido: ");
		remova = leitor.next();
		
		System.out.print("Informe uma string e direi quantas vezes apareceu no texto: ");
		ocorrenciaDeUmaStringNoTexto = leitor.next();
		
		leitor.close();
		
		//PROCESSAMENTO A
		do {
			indice = texto.indexOf(ocorrenciaDeUmaStringNoTexto, indice);
			if (indice >= 0) {
				qtd++;
				indice++;
			}
		} while (indice >= 0);
		
		//PROCESSAMENTO B
		textoInvertido = texto.replaceAll(" ", "");
		
		for (int i = 0 ; i < textoInvertido.length() ;i++) {
			temp += (textoInvertido.charAt(textoInvertido.length() - i - 1));
		}
		
		textoInvertido = temp;
		temp = texto.replaceAll(" ", "");
		
		if (textoInvertido.compareTo(temp) == 0) {
			temp = "Sim";
		} else {
			temp = "N�o";
		}
		
		//SA�DA DE DADOS		
		System.out.print("\n");
		System.out.println("A primeira letra �: " + texto.charAt(0));
		System.out.println("A �ltima letra �: " + texto.charAt(texto.length() - 1));
		System.out.println("O tamanho da string �: " + texto.length());
		
		System.out.println("Em mai�sculo: " + texto.toUpperCase());
		System.out.println("Em min�sculo: " + texto.toLowerCase());
		
		System.out.println("Sem o caractere <" + remova + ">: " + texto.replaceAll(remova, ""));
		
		System.out.println("Ocorr�ncias da string <" + ocorrenciaDeUmaStringNoTexto + ">: " + qtd);
		
		System.out.println("� pal�ndromo: " + temp);
	}
}
