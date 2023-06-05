package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		//for
		for (int i = 0; i <= notas.length; i++) {
			
			System.out.println("Informe a nota " + i);
			notas[i] = entrada.nextDouble();
			
			
		}
		
		System.out.println(Arrays.toString(notas));
		
		
		
//		System.out.println(notas.length);
		
		
//		notas[0] = 5.2;
//		//mostrar o valor do primeiro indice
//		System.out.println(notas[0]);
//		
//		
//		System.out.println("Informe um nome");
//		String nome = entrada.next();
//		
//		System.out.println("Informe a idade");
//		int idade = entrada.nextInt();
//		
		
			
		
		
		
		
		
		
		
		
		
		entrada.close();
		
	}

}
