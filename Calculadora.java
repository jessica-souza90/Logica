import java.util.Scanner;

public class Calculadora {
  
 	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
                
        System.out.print("Digite o numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o numero: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtracao " + subtracao);
        System.out.println("Resultado da multiplicacao " + multiplicacao);
        System.out.println("Resultado da divisao " + divisao);

        sc.close();
        
	}
}
