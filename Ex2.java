
public class Ex2 {

	public static void main(String[] args) {
		
		/*  Faça um programa que apresente o total da soma dos cem primeiros 
			números inteiros (1+2+3+.....+99+100). */
		int soma=0;
		
		for (int i=1; i<=100;i++)
			soma = soma + i;
		
		
		System.out.println("A soma dos 100 primeiros números é: "+soma);
		

	}

}
