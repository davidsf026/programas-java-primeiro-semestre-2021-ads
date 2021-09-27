import java.util.Scanner;

public class ParidaDeSinal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Informe um número: ");
		num = leitor.nextInt();
		leitor.close();
		
		if (num % 2 == 0) {
			System.out.println("Esse número é par.");
		} else {
			System.out.println("Esse número é ímpar.");
			}
		
		if (num > 0) {
			System.out.println("Esse número é positivo.");
		} else if (num < 0) {
			System.out.println("Esse número é negativo.");
		} else {
			System.out.println("Esse número é neutro.");
		}	
	}
}
