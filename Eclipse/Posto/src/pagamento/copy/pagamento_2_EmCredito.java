package posto.src.pagamento.copy;

public class pagamento_2_EmCredito {
	
	public static void pagoNoCredito( double quantiaEmCredito, double valorLavagem) {
		
		double parcela;
			
		if(quantiaEmCredito == 1) {
			parcela = (valorLavagem);
			System.out.printf(" Pago a vista de %2.f!", parcela);
			
		}
		else if(quantiaEmCredito == 2) {
			parcela = (valorLavagem/2);
			System.out.printf(" Está pago em duas parcelas de %.2f!", parcela);
		}
		else if(quantiaEmCredito == 3) {
			parcela = (valorLavagem/3);
			System.out.printf(" Está pago em três parcelas de %.2f!", parcela);
		}
		else {
			System.out.println(" Parcela Inválida! Tente novamente em outra parcela");
			
		}
	}

}
