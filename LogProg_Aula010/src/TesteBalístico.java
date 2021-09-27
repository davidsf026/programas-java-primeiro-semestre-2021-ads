import java.util.Scanner;

public class TesteBalístico {
	public static void main(String[] args) {
		//DECLARAÇÃO DE VARIÁVEIS
		Scanner leitor = new Scanner(System.in);
		double angulo = 0;
		double velInicial = 0;
		
		double tempo = 0;
		double distanciaFinal = 0;
		double distanciaPorTempo = 0;
		
		final double GRAVIDADE = 9.98;
		
		//ENTRADA DE DADOS
		System.out.println("Informe o angulo do disparo (graus): ");
		angulo = leitor.nextDouble();
		
		System.out.println("Infome a velocidade inicial do disparo (m/s): ");
		velInicial = leitor.nextDouble();
		
		//PROCESSAMENTO
		angulo = (Math.PI * angulo / 180);
		
		tempo = ((2 * velInicial * Math.sin(angulo)) / GRAVIDADE);
		
		distanciaFinal = ((Math.pow(velInicial, 2) * Math.sin(2 * angulo)) / GRAVIDADE);
		
		//SAÍDA DE DADOS
		for (int i = 0 ; i < tempo ; i++) {
			distanciaPorTempo = (velInicial * Math.cos(angulo) * i);
			
			System.out.println("Tempo: " + i + "\tDeslocamento: " + distanciaPorTempo);
		}
		System.out.print("Tempo: " + tempo + "\tDeslocamento: " + distanciaFinal);
		
		leitor.close();
	}
}
