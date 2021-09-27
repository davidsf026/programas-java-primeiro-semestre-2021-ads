import java.util.Scanner;

public class AumentoPorClasse {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int classe = 0;
		double salario = 0;
		double aumento = 0;
		
		System.out.println("===================");
		System.out.println("| Colaborador = 1 |");
		System.out.println("| Chefe = 2       |");
		System.out.println("| Diretor = 3     |");
		System.out.println("===================");
		System.out.println("");
		
		System.out.print("Informe a classe: ");
		classe = leitor.nextInt();
		
		System.out.print("Informe o salário: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		switch (classe) {
		case 1:
			aumento = salario * 0.9;
			break;
		case 2:
			aumento = salario * 0.8;
			break;
		case 3:
			aumento = salario * 0.5;
			break;
		}
		
		System.out.println("O valor final do salário é de: " + aumento);
		
	}
}
