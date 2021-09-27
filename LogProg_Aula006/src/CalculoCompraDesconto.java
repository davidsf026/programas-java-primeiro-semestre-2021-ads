import java.util.Scanner;

public class CalculoCompraDesconto {
	public static void main(String[] args) {	
	//DECLARA��O DE VARI�VEIS
	Scanner leitor = new Scanner(System.in);
	
	double precoProduto = 0;
	int qtdProduto = 0;
	double valorFinalCompra = 0;
	
	//ENTRADA DE DADOS
	System.out.print("Digite o pre�o do produto: ");
	precoProduto = leitor.nextDouble();
	
	System.out.print("Digite a quantidade de produtos: ");
	qtdProduto = leitor.nextInt();
	
	leitor.close();
	
	//PROCESSAMENTO
	if (qtdProduto == 1) {
		valorFinalCompra = (precoProduto);
	} else if (qtdProduto == 2) {
		valorFinalCompra = (precoProduto * qtdProduto * 0.9);
	} else if (qtdProduto <= 5) {
		valorFinalCompra = (precoProduto * qtdProduto * 0.8);
	} else if (qtdProduto <= 10) {
		valorFinalCompra = (precoProduto * qtdProduto * 0.7);
	} else {
		valorFinalCompra = (precoProduto * qtdProduto * 0.6);
	}
	
	//SA�DA DE DADOS
	System.out.println("O valor final da compra �: " + valorFinalCompra);
	
	}
}
