
public class SequenciaFibonacci {
	public static void main(String[] args) {
	
		//DECLARAÇÃO DE VARIÁVEIS
		double numeroAnteanterior = 0;
		double numeroAnterior = 1;
		double numeroAtual = 0;
		
		while (numeroAtual < 1000000) {
			numeroAtual = (numeroAnteanterior + numeroAnterior);
			
			System.out.println(numeroAtual);
			
			numeroAnteanterior = numeroAnterior;
			numeroAnterior = numeroAtual;
		}
	}
}
