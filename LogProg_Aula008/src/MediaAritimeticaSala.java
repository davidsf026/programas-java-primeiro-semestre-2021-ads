import java.util.Scanner;

public class MediaAritimeticaSala {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		double mediaAluno = 0;
		double mediaTurma = 0;
		double qtdNotas = 0;
		String temMaisAluno = "S";
		
		//ENTRADA DE DADOS
		
		while (temMaisAluno.equalsIgnoreCase("S")) {
			System.out.print("Informe a nota do aluno: ");
			mediaAluno = leitor.nextDouble();
			
			mediaTurma = (mediaTurma + mediaAluno);
			qtdNotas++;
		
			System.out.print("Tem mais aluno <S/N>? ");
			temMaisAluno = leitor.next();			
		}
		
		leitor.close();
		
		//PROCESSAMENTO
		mediaTurma = (mediaTurma / qtdNotas);
		
		//SA�DA DE DADOS
		System.out.println("A m�dia da turma �: " + mediaTurma);
		
	}
}
