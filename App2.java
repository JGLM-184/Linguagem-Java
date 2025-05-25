
public class App2 {

	public static void main(String[] args) {
		
		//retorna um caracter de acordo com a posição indicada

		char letra;
		String palavra = "Exemplo";
		
		letra = palavra.charAt(3);
		
		System.out.println(palavra.charAt(6));
		System.out.println(palavra.indexOf('e'));
		System.out.println(palavra.indexOf("pl"));
		
		//retorna tamanho em caracteres
		System.out.println(palavra.length());
		
		//transforma em maíusculo ou em minúsculo
		System.out.println(palavra.toLowerCase());
		System.out.println(palavra.toUpperCase());
		
		
		
		//converte número para String
		int a = 10;
		System.out.println(String.valueOf(a));
		
		
		
		//recorta uma parte da string e exibe
		String palavra2 = "caraguatatuba";
		System.out.println(palavra2.substring(3,7));
		
		
		
		
		
		
		
		/*     {\_/}
			   (○•○)
			   /| |\
			  (     )
			  -----|_
		
		*/
		
		
		

	}

}
