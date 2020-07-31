public class CalculaValores {

	public static void main (final String[] args) {

		int numeroUm;
		int numeroDois;
		int soma, subtracao, multiplicacao, divisao;
		
		numeroUm = 50;
		numeroDois = 10;

		soma = numeroUm + numeroDois;
		subtracao = numeroUm - numeroDois;
		multiplicacao = numeroUm * numeroDois;
		divisao = numeroUm / numeroDois;

		System.out.println("O resultado da soma e " + soma);
		System.out.println("O resultado da subtracao e " + subtracao);
		System.out.println("O resultado da multiplicacao e " + multiplicacao);
		System.out.println("O resultado da divisao e " + divisao);
	}
}
