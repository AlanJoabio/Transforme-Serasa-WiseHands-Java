package posto.src.pagamento.copy;

public class pagamento_1_EmDinheiro {

	
	public static void pagoNoDinheiro(double quantiaEmDinheiro, double valorAbastecido) {
		
		if (quantiaEmDinheiro == valorAbastecido) {
			System.out.println("Obrigado, boa viagem!");
			
		} else if (quantiaEmDinheiro > valorAbastecido) {
			double troco = quantiaEmDinheiro - valorAbastecido;
			System.out.printf("O seu troco é de %.2f, agradecemos a preferência.\n\n", troco);
			
			
		} else if (quantiaEmDinheiro < valorAbastecido) {
			System.out.println("Fiado só amanhã!");
			
		}
		
	}
}