
public class Ex3 {

	public static void main(String[] args) {
		
		
		/* Faça um aplicativo que calcule o produto dos inteiros ímpares de 1 a 15 e 
		exiba o resultado na tela */
		
		int produto=1;
		
		for (int i = 1; i<=15; i++)
		{
			if (i%2 !=0)
				produto = produto * i;
		}
		
		System.out.println("O produto é: "+produto);

	}

}
