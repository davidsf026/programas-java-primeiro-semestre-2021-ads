
public class ExemploFuncao {
	public static int soma (int numeroA, int numeroB) {//public = acessibilidade | static = invocar sem instanciar | int = retorna inteiro | soma = nome
		int retorno = 0;
		
		retorno = numeroA + numeroB;
		
		return retorno;
	}
		
	public static void main(String[] args) { //public = acessibilidade | static = invocar sem instanciar | void = não retorna nada | main = nome
		System.out.println(soma(1, 2));
	}
}
