package Atividades;

public class AtividadeAula6 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
//		int somaNumeros = 0;
//		
//		while (somaNumeros < 100) {
//			System.out.println("Digite um numero: ");
//			int numero = entrada.nextInt();
//			
//			somaNumeros += numero;
//		}
//		
//		System.out.printf("Soma dos numeros é: %d%n", somaNumeros);

//_________________________________________________________________________________________
		
//		int digitarProximo;
//		int somaTotal = 0;
//		
//		do {
//			System.out.println("Digite um numero: ");
//			int numero = entrada.nextInt();
//			
//			somaTotal += numero;
//			
//			System.out.println("Deseja digitar outro numero \n 1-Sim 2-Não: ");
//			digitarProximo = entrada.nextInt();
//		} while (digitarProximo !=2);
//		
//		System.out.printf("A Soma dos numeros digitados foi de %d", somaTotal);
		
//___________________________________________________________________________________________		
		
//		int somaNumeros = 0;
//		
//		for (int repetir = 1; repetir <= 4; repetir++) {
//			System.out.println("Digite um numero: ");
//			int numero = entrada.nextInt();
//			
//			somaNumeros += numero;
//		}
//		
//		System.out.printf("Soma dos numeros é %d%n", somaNumeros);
		
//____________________________________________________________________________________________
		
		int somaNumeros = 0;
		
		for (int repetir = 1; repetir <= 4; repetir++) {
			System.out.println("digite um numero par: ");
			int numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				somaNumeros += numero;
			} else {
				repetir--;
			}
		}
		
		System.out.printf("Soma dos numeros pares: %d%n", somaNumeros);
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
