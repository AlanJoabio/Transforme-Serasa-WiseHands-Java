package Introducao;

import java.util.Scanner;

public class Switch {
	
public static String main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Qual hoje é semana?");
		String dia = entrada.next();
			
		switch (dia) {
			case 1: {
				System.out.println("Domingo");
				break;
			case 2: 
				System.out.println("Segunda-feira");
				break;
			case 3: 
				System.out.println("Terca-feira");
				break;
			case 4: 
				System.out.println("Quarta-feira");
				break;
			case 5: 
				System.out.println("Quinta-feita");
				break;
			case 6: 
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			
		default:
				System.out.println("Esta não é um dia válido!");
			}
		return dia;
			
	}

}
