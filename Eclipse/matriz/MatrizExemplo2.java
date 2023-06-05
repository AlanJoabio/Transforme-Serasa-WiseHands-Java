package matriz;

import java.util.Arrays;

public class MatrizExemplo2 {
	
	public static void main(String[] args) {
		
		double[][] alunos = new double[2][8];
		
		alunos[0][0] = 5.2;
		alunos[0][1] = 4.7;
		alunos[1][0] = 6.2;
		alunos[1][1] = 5.1;
		
		
		//foreach
		for (double[] nota: alunos) {
			System.out.println(Arrays.toString(nota));
		}
		
		//colecoes
		//fila, pilha
		
		//proxima aula
		//modificadores de acesso
		//orientacao a objetos
		
		
	}

}
