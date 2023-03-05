package somaNumeros;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int numero;
		
		while (soma < 100) {
			System.out.println("Digite um número inteiro: ");
			numero = sc.nextInt();
			soma += numero;
		}
		
		System.out.println("A soma dos número é " + soma);
		
		sc.close();
		
	}

}
