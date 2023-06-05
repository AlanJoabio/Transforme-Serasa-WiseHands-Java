package servicos;

public class Lavagem {
	
	public double Lavar(int tamanhoCarro, double opcaoLavagem) {
		
		double carroPequeno = 20.00;
		double carroMedio = 30.00;
		double carroGrande = 40.00;
		double carroDentro = 15.00;
		double gastoLavagem;
		String tamCarro;
		String opcLavar;
		
		
		if (tamanhoCarro == 1) {
			if (opcaoLavagem ==1) {
				gastoLavagem = carroPequeno + carroDentro;
				opcLavar = "por dentro";	
			} else {
				gastoLavagem = carroPequeno;
				opcLavar = "somente por fora";	
			}	
			tamCarro = "Pequeno";
		} else if (tamanhoCarro ==2) {
			if (opcaoLavagem ==1) {
				gastoLavagem = carroMedio + carroDentro;
				
				opcLavar = "por dentro";	
			} else {
				gastoLavagem = carroMedio;
				opcLavar = "somente por fora";
			}
			tamCarro = "Médio";
		} else {
			if (opcaoLavagem ==1) {
				gastoLavagem = carroGrande + carroDentro;
				opcLavar = "por dentro";	
			} else {
				gastoLavagem = carroGrande;
				opcLavar = "somente por fora";
			}		
			tamCarro = "Grande";
		}			
		
		
		System.out.printf(" O carro foi lavado por R$ %.2f, com a lavagem %s do carro tamanho %s.\n",gastoLavagem, opcLavar, tamCarro);
		
		return gastoLavagem;
	}
}

 
