
public class FatorialRecursiva {
	public static double fatorialRecursiva(double num) {
		double retorno = 0;
		
		if (num == 1) {
			retorno = 1;
		} else {
			retorno = (num * fatorialRecursiva((num-1)));
		}
		
		return retorno;
	}
	public static void main(String[] args) {
		System.out.println(fatorialRecursiva(5));
	}
}

// >>> EXPLICAÇÃO (num = 5) <<<
//
// #1			retorno = (5 * fatorialRecursiva((5-1)));				|
// #2				retorno = (4 * fatorialRecursiva((4-1)));			|
// #3					retorno = (3 * fatorialRecursiva((3-1)));		|
// #4						retorno = (2 * fatorialRecursiva((2-1)));   |
// #5							retorno = 1 							| (DESCEU PARA O ELSE, POR ISSO 1)
// #6(#4)					retorno = 2 * 1								| (AGORA QUE CHEGOU NO 1 ELE VAI VOLTAR, É COMO SE FOSSE UMA MOLA)
// #7(#3)				retorno = 3 * 2									|
// #8(#2)			retorno = 4 * 6										|
// #9(#1)		retorno = 5 * 24 										| 
// #10			retorno = 120											|