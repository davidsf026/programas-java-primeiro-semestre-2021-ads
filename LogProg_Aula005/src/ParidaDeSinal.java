import java.util.Scanner;

public class ParidaDeSinal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Informe um n�mero: ");
		num = leitor.nextInt();
		leitor.close();
		
		if (num % 2 == 0) {
			System.out.println("Esse n�mero � par.");
		} else {
			System.out.println("Esse n�mero � �mpar.");
			}
		
		if (num > 0) {
			System.out.println("Esse n�mero � positivo.");
		} else if (num < 0) {
			System.out.println("Esse n�mero � negativo.");
		} else {
			System.out.println("Esse n�mero � neutro.");
		}	
	}
}
