import java.util.Scanner;

public class MediaAritmetica {
  
    public static void main (String[] args) {
    
        double num1;
        double num2;
        double num3;
        double num4;
        double soma;
        double media;

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Escreva primeiro numero:");
        num1 = sc.nextDouble(); 

        System.out.println("Escreva segundo numero:");
        num2 = sc.nextDouble(); 

        System.out.println("Escreva terceiro numero:");
        num3 = sc.nextDouble(); 

        System.out.println("Escreva quarto numero:");
        num4 = sc.nextDouble(); 

        soma = num1 + num2 + num3 + num4;
        media = soma / 4;

        System.out.println("A media e: " + media);

        sc.close();
        
	}
}
