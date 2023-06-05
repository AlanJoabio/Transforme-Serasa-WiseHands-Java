package Atividades;

import java.util.Scanner;

public class AtividadeAula3 {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------");
		System.out.println("                 Dados Pessoais             ");
		System.out.println("--------------------------------------------");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe seu nome?");
		String nome = entrada.nextLine();	
		
		System.out.println("Informe seu sobrenome?");
		String sobreNome = entrada.nextLine();
		
		System.out.println("Informe seu idade");
		String idade = entrada.nextLine();
		
		System.out.println("Informe sua cor favorita?");
		String cores = entrada.nextLine();
		
		System.out.println("Informe seu time favorito?");
		String times = entrada.nextLine();
		
		System.out.printf("Olá, " + nome + " " + sobreNome + " Voce tem " + idade + " anos, sua cor favorita é " + cores + ", e seu time favorit " + times);
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("                 Calculadora                ");
		System.out.println("--------------------------------------------");
		
		System.out.println("Informe um número:");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe outro número:");
		int numero2 = entrada.nextInt();
		
		double resto = (numero1 + numero2) % 3;
		
		
		System.out.printf("A média entre o numero %.2f e o numero %.2f é %.2d", numero1, numero2, resto);
		
		System.out.println("Somar: " + (numero1 + numero2));
		System.out.println("Subtrair: " + (numero1 - numero2));
		System.out.println("Multiplicar: " + (numero1 * numero2));
		System.out.println("Dividir: " + (numero1 / numero2));
		System.out.println("Resto do : " + numero1 + " é " + resto);
		System.out.println("Resto do : " + numero2 + " é " + resto);
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("            DESAFIO - PAR OU IMPAR          ");
		System.out.println("--------------------------------------------");
		
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		
		if (num % 2 == 0) {
			System.out.println("O numero " + num + " é PAR");
		}else 
			if (num % 2 == 1) {
			System.out.println("O numero " + num + " é IMPAR");
		}
		
		
		double media = 5.5;
		
		if (media >= 5.5) {
			System.out.println("Voce foi aprovado");
		}
		
		
		entrada.close();		
		
		
	}

}
