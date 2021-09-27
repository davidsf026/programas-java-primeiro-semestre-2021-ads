import java.util.Scanner;

public class CalculoVotosValidos {
	public static void main (String[] args) {
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in); // "main" + 
		double votosCandidatoA = 0;
		double votosCandidatoB = 0;
		double votosCandidatoC = 0;
		double votosEmBranco = 0;
		double votosNulos = 0;
		
		double percentualVotosCandidatoA = 0;
		double percentualVotosCandidatoB = 0;
		double percentualVotosCandidatoC = 0;
		double percentualVotosEmBranco = 0;
		double percentualVotosNulos = 0;
		double percentualVotosValidos = 0;
		
		double votosValidos = 0;
		double votosTotais = 0;
				
		// ENTRADA DE DADOS
		System.out.println("");
		System.out.println("• ENTRADAS: ");
		System.out.println("");
		System.out.print("Informe a quantidade dos votos do candidato A: ");
		votosCandidatoA = leitor.nextDouble();
		
		System.out.print("Informe a quantidade dos votos do candidato B: ");
		votosCandidatoB = leitor.nextDouble();

		System.out.print("Informe a quantidade dos votos do candidato C: ");
		votosCandidatoC = leitor.nextDouble();
		
		System.out.print("Informe a quantidade dos votos em branco: ");
		votosEmBranco = leitor.nextDouble();
		
		System.out.print("Informe a quantidade dos votos nulos: ");
		votosNulos = leitor.nextDouble();

		leitor.close();
		
		// PROCESSAMENTO
		votosValidos = votosCandidatoA + votosCandidatoB + votosCandidatoC;
		votosTotais = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosEmBranco + votosNulos;
		
		percentualVotosCandidatoA = (votosCandidatoA * 100) / votosValidos;
		percentualVotosCandidatoB = (votosCandidatoB * 100) / votosValidos;
		percentualVotosCandidatoC = (votosCandidatoC * 100) / votosValidos;
		
		percentualVotosEmBranco = (votosEmBranco * 100) / votosTotais;
		percentualVotosNulos = (votosNulos * 100) / votosTotais;
		percentualVotosValidos = (votosValidos * 100) / votosTotais;
		
		// SAÍDA DE DADOS
		System.out.println("");
		System.out.println("• SAÍDAS: ");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos válidos do canditado A: " + percentualVotosCandidatoA + "%");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos válidos do canditado B: " + percentualVotosCandidatoB + "%");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos válidos do canditado C: " + percentualVotosCandidatoC + "%");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos em branco: " + percentualVotosEmBranco + "%");
		System.out.println("");
		System.out.println("================================================================");
		System.out.println("");
		System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
		System.out.println("");
		System.out.println("================================================================");
	}
}