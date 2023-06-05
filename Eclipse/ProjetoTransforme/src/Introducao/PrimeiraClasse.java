package Introducao;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		System.out.println("Olá, mundo!");
		
		
		//variáveis
		//Tipo, o nome e o valor
		
		int idade = 10; //inteiro
		double altura = 1.70; //decimal
		String nome = "Alexander"; //String ou palavras
		boolean estaCalor = true;
		
		//Constantes
		
		final int media = 5;
		
		System.out.println("O valor da média é " + media);
		
		//nao pode
		//media = 10
		
		System.out.println("O valor da média é " + media);
		
		final int HORA = 24;
		
		// Strings
		
		String sobreNome = "Medeiros";
		System.out.println(sobreNome.length());
		System.out.println(sobreNome.toUpperCase());
		System.out.println(sobreNome.toLowerCase());
		System.out.println(sobreNome.equals("Medeiras")); //Nome diferente
		
		System.out.println("\n");
		
		System.out.println("Operadores aritméticos");
		
		int a = 5;
		int b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// Módulo, ou resto de uma divisão
		System.out.println("O resto de uma divisão " + 9 % 2);
		
		
	}

}
