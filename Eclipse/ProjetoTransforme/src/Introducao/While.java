package Introducao;

public class While {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//		
//		int copos = 0;
//		
//		// contuino....
//		while (copos <= 30) {
//			
//			System.out.println("Copo de numero " + copos + " foi lavado.");
//			
//			//copos += 1; ou
//			//copos ++;
//			
//		}
//		int pratos = 0;
//		
//		//palavra para
//		// numero 0;
		
		int hora = 0;
		int copos = 0;
		
		while ( hora >= 9 && hora <= 12 ) {
			
			copos += 1;
			
			System.out.println("Que horas são:");
			hora = entrada.nextInt();
						
		}
		
		System.out.println("A quantidade de copos lavados foi de " + copos);
		
		int prato = 0;
		
		do {
			System.out.println("Digite um numero e caso queira air digite -1");
			prato = entrada.nextInt();
			
		} while (prato != -1);
		
			System.out.println("Voce digitou -1 e parou o sistema.");
			
			// Estrutura do FOR
			// 1- cria variavel
			// 2- verificacao
			// 3- incremento ou modificar essa variavel
			
			
			for (int numero1 = 0 ; numero1 <= 10 ; numero1++) {
				
				System.out.println("O numero é " + numero1);
			}
			
			for (int quantidade = 20; quantidade >= 0 ; quantidade --) {
				
				System.out.println(" A quantidade é " + quantidade);
			}
			
			
		
		entrada.close();
		
	}

}
