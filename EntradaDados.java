import java.util.Scanner;

public class EntradaDados {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
                
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Meu nome eh " + nome + " e eu tenho " + idade + " anos.");

        sc.close();
        
	}
}
