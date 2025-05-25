import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		
		/* Crie uma classe que gere um numero aleatório entre os valores máximo e 
		   mínimo recebidos do usuário na linha de comando */
		
		Scanner sc = new Scanner (System.in);
		int a, b;
		
		System.out.print("Digite o 1° valor: ");
		a = sc.nextInt();
		
		System.out.print("Digite o 2° valor: ");
		b = sc.nextInt();
		
		System.out.println("\nNúmero aleatório gerado entre "+a+" e "+b+": "+((int) (a + (Math.random()*(b-a)))));
	
	}

}
