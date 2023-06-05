package Introducao;

public class Lenght {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String Nome;
		String Pessoa;

		
		System.out.println("Qual o seu nome primeiro letras?");
		Nome = entrada.next();
		
		if (Nome.contains("j")) {
			
			System.out.println("seu nome é Jonathan");
			
		} else if (Nome.contains("a")) {
			
			System.out.println("Seu nome é Alexander");
			
		} else {
			
			System.err.println("nao acho nome!");
			
		}
		
		
		
		
		
		
		/*
		 * System.out.println("Informe o numero seu CPF ou CNPJ:"); Pessoa =
		 * entrada.next();
		 * 
		 * 
		 * if (Pessoa.length() == 14) {
		 * 
		 * System.out.println("O seu CPF é válido");
		 * 
		 * } else if (Pessoa.length() == 18) {
		 * 
		 * System.out.println("O seu CNPJ é válido");
		 * 
		 * } else {
		 * 
		 * System.out.println("Esta não é um numero válido!"); }
		 */
		
		
		
		if (Nome.equals("Alexander")) {
			// o que é equals ér igual nome exemplo sim ou nao
		}
		
		
		
	}

}
