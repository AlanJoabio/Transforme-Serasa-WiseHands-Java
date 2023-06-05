package posto.src.servicos.copy2;

public class Abastecimento {
	
	public static void Abastecer(int tipoCombustivel, double valorAbastecer) {
		
		double precoGasolina = 4.75;
		double precoEtanol = 3.85;
		double precoDiesel = 5.15; 
		double qtdeCombustivel;
		
		if (tipoCombustivel == 1) {
			qtdeCombustivel = valorAbastecer / precoGasolina;
			System.out.printf(" Foi abastecido o valor de R$ %.2f, rendendo a quantidade de %.3f litros.\n",valorAbastecer,qtdeCombustivel);
		} else if (tipoCombustivel == 2)  {
			qtdeCombustivel = valorAbastecer / precoEtanol;
			System.out.printf(" Foi abastecido o valor de R$ %.2f, rendendo a quantidade de %.3f litros.\n",valorAbastecer,qtdeCombustivel);
		} else  {
			qtdeCombustivel = valorAbastecer / precoDiesel;
			System.out.printf(" Foi abastecido o valor de R$ %.2f, rendendo a quantidade de %.3f litros.\n",valorAbastecer,qtdeCombustivel);		
		}
		
	}
	
}
 