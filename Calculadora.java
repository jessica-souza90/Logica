import java.util.Scanner;

public class Calculadora {
  
 	public static void main (String[] args) {
        
        double n1;
        double n2;

        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        Scanner sc = new Scanner(System.in);
                
        System.out.print("Digite o numero: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o numero: ");
        n2 = sc.nextDouble();

        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtracao " + subtracao);
        System.out.println("Resultado da multiplicacao " + multiplicacao);
        System.out.println("Resultado da divisao " + divisao);

        sc.close();
        
	}
}
