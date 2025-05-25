import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/* Faça um aplicativo que receba três valores inteiros na linha de comando e 
		   mostre o maior dentre eles */
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, maior=01;
		
		System.out.print("Digite o 1° valor: ");
		a = sc.nextInt();
		
		System.out.print("Digite o 2° valor: ");
		b = sc.nextInt();
		
		System.out.print("Digite o 3° valor: ");
		c = sc.nextInt();
		
		if (a > b && a > c)
			maior = a;
		
		if (b > a && b > c)
			maior = b;
		
		if (c > a && c > b)
			maior = c;
		
		System.out.println("\nO maior número é: "+maior);
		
	}

}
