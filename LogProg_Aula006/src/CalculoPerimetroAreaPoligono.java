import java.util.Scanner;

public class CalculoPerimetroAreaPoligono {
	public static void main (String[] args) {
		//DECLARA��O DE VARI�VEIS
		Scanner leitor = new Scanner(System.in);
		int qtdArestas = 0;
		double tamanhoAresta = 0;
		double perimetro = 0;
		double area = 0;
		
		//ENTRADA DE DADOS
		System.out.println("Informe a quantidade de lados do pol�gono: ");
		qtdArestas = leitor.nextInt();
		
		System.out.println("Informe o tamanho das arestas: ");
		tamanhoAresta = leitor.nextDouble();
		
		leitor.close();
		
		//PROCESSAMENTO
		switch (qtdArestas) {
			case 3:
				perimetro = (3 * tamanhoAresta);
				area = ((Math.pow(tamanhoAresta, 2) * Math.sqrt(3)) / 4);
				break;
			case 4:
				perimetro = (4 * tamanhoAresta);
				area = (Math.pow(tamanhoAresta, 2));
				break;
			case 5:
				perimetro = (5 * tamanhoAresta);
				area = ((5 * (Math.pow(tamanhoAresta, 2))) / (4 * Math.tan(36)));
				break;
			case 6:
				perimetro = (6 * tamanhoAresta);
				area = (3 * (Math.pow(tamanhoAresta, 2)) * (Math.sqrt(3)) / 2);
				break;
			case 7:
				perimetro = (7 * tamanhoAresta);
				area = ((7 / 4) * Math.pow(tamanhoAresta, 2) * Math.atan(51.4285714));
				break;			
		}
		
		//SA�DA DE DADOS
		System.out.println("O per�metro do pol�gono �: " + perimetro);
		System.out.println("A �rea do pol�gono �: " + area);
	}
}
