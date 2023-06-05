package Atividades;

public class AtividadeAula2 {
	
public static void main(String[] args) {
		
		// Declaracao das variaveris
		int PrimeiroMes = 40;
		int SegundoMes = 30;
		int TerceiroMes = 70;
		
		
		// guardando a soma na variavel soma
		double Soma = PrimeiroMes + SegundoMes + TerceiroMes;
		
		
		// Calculando a media
		double Media = Soma / 3;
		double Sobra = Soma % 3;
		
		
		// mostrando resultado no console
		System.out.println("A média dos cliente foi: " + Media + " Clientes");
		
		System.out.println("A Sobra da média é " + Sobra);
		
		
		int teste1 = 10;
		double teste2 = (int) 2.99;
		
		
		// cast e a conversar de um valor
		
		System.out.println(teste1 * teste2);
		
		
		
	}

}
