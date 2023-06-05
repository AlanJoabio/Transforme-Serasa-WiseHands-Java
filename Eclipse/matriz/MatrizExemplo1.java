package matriz;

import java.util.Arrays;

public class MatrizExemplo1 {
	
	public static void main(String[] args) {
		
		int[][] tabela = new int[3][4];
		
		for (int[] dado: tabela) {
			System.out.println("teste");
		}
		
		int[] carros = new int[6];
		int[] uniVendidas = new int[6];
		String[] placasCarro = new String[6];
		
		for (int carro: carros) {
			System.out.println(carro);
		}
		
		
	}

}
