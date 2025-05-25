//import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner (System.in);
		
		
		//Valor absoluto
		System.out.println( Math.abs(-10));
		
		//Raíz quadrada
		System.out.println( Math.sqrt(625));
		
		//Exponencial
		System.out.println( Math.pow(2,3));
		
		//Número aleatório entre 0 e 1
		System.out.println( Math.random());
		
		//Sortear número e convertendo para inteiro + aumentando o número limite
		System.out.println((int) (Math.random() * 60));
		
		int a = 2;
		System.out.println("a = "+a);
		
		
		int b = 3;
		int c = 4;
		a = b>c? b : c;
		
		System.out.println("a = "+a);
		
		
		
		


	}

}
