import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*  Crie um aplicativo que receba uma frase e mostre-a de forma invertida */
		
		Scanner sc = new Scanner (System.in);
				
		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine();
		
		int tam = palavra.length();
		
		for (int i=tam-1; i>=0;i--)
		{
			;
			System.out.print(palavra.charAt(i));
		}
		
		//TAM 3 OLA
		//A L 
	}

}
