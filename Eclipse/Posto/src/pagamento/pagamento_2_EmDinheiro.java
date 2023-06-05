package pagamento;

//import servicos.Lavagem;

public class pagamento_2_EmDinheiro {

	
	public static void pagoNoDinheiro(double quantiaEmDinheiro, double valorLavagem) {
		
		if (quantiaEmDinheiro == valorLavagem ) {
			System.out.println(" Obrigado, boa viagem!");
			
		} else if (quantiaEmDinheiro > valorLavagem ) {
			
			double troco = quantiaEmDinheiro - valorLavagem ;
			System.out.printf(" O seu troco é de %.2f, agradecemos a preferência.\n", troco);
			//System.out.println(" Troco: " + troco);
			//System.out.println(" Quanto em dinheiro: " + quantiaEmDinheiro);
			//System.out.println(" Valor da lavagem: \n\n" + valorLavagem);
			
		} else if (quantiaEmDinheiro < valorLavagem) {
			System.out.println(" Fiado só amanhã!");
			
		}
 	 	
	}
}

 