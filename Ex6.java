import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/* Crie um aplicativo que mostre o efeito abaixo:
			 J
			 JA
			 JAV
			 JAVA
			 JAV
			 JA
			 J
		 */
		
		Scanner sc = new Scanner (System.in);

		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine();
		
		for (int i=1; i <= palavra.length(); i++)
		{ 
			System.out.println(palavra.substring(0,i));
		}
		
		for (int i=palavra.length(); i >=0 ;i--)
		{
			System.out.println(palavra.substring(0,i));
		}
		
		
		
	}

}
