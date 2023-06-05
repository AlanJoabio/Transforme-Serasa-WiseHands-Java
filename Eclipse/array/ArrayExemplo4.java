package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	
		System.out.println("Quantas notas serão?");
		int quantidade = entrada.nextInt();
		
		double[] notas = new double[quantidade];
		
//		notas[1] = 5;
//		notas[2] = 5;
//		notas[3] = 5;
		
		for ( int i = 0; i <= quantidade; i++) {
			
			System.out.printf(" Informe a nota %d do aluno \n" + i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
	
//		System.out.println((notas[0] + notas[1] + notas[2] + notas[3]) / quantidade);
		
		
		entrada.close();
	}

}
