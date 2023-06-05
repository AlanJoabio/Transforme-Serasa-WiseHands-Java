package array;

import java.util.Arrays;
import java.util.Stack;

public class ArrayExemplos1 {
	
	public static void main(String[] args) {
		
		//para criar um array
		int[] idades = new int[4];
		
		//para atribuir valores
		idades[0] = 5;
		idades[1] = 4;
		idades[2] = 6;
		idades[3] = 6;
		//idades[4] = 7;
		
		//para mostrar os valores do array
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
		
		
		//jeito errado
		System.out.println(idades);
		
		//jeito certo
		//Arrays.toString(idades);
		System.out.println(Arrays.toString(idades));
		
		//---------------------------------------------------------------------------------
		
		String[] nomes = new String[5];
		
		nomes[0] = "Ana";
		nomes[1] = "Bia";
		nomes[2] = "Carol";
		nomes[3] = "Daniel";
		nomes[4] = "Everton";
		
		
		System.out.println(Arrays.toString(nomes));
		
		//se quisermos ver o tamanho do array utilizamos o lenght
		
		//pacote arrays
		//Arrays.
		
		
		System.out.println(nomes.length);
		
		
		
	}

}
;