import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		//Desafios de Dados Pessoais
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<Dados Pessoas>");
		System.out.println("Qual é o seu nome? ");
		String nome = scanner.nextLine();
		
		System.out.println("Em que ano você nasceu? ");
		int anoNascimento = scanner.nextInt();
		
		int idade = 2023 - anoNascimento;
		
		scanner.nextLine();
		
		System.out.println("Onde você mora? ");
		String cidade = scanner.nextLine();
		
		String mensagem = "Olá " + nome + "! Você tem " + idade + " anos e mora em " + cidade +".";
		
		System.out.println(mensagem);
		
		/* Desafio de impar ou par
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Par ou Ímpar!!");
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é ímpar.");
		}*/
		
		//Desafios de Identificação		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("<Desafio Identificação>");
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Digite o seu time favorito: ");
		String timeFavorito = scanner.nextLine();
		
		String mensagem = "Olá " + nome + " " + sobrenome + "! " + "Seu time favorito é o " + timeFavorito + ".";
		
		System.out.println(mensagem);*/
		
		
		//Desafios de Soma
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Desafio de Soma");
		
		System.out.println("Digite o primeiro número: ");
		
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		
		double resultado = numero1 + numero2;
		
		System.out.println("O resultado da soma é: " + resultado);*/
		
		
	}

}
