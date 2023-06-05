package pagamento;

public class pagamento_1_EmCredito {
	
	public static void pagoNoCredito( double quantiaEmCredito, double valorAbastecido) {
		
		double parcela;
			
		if(quantiaEmCredito == 1) {
			parcela = (valorAbastecido);
			System.out.printf("Pago a vista de %2.f!", parcela);
			
		}
		else if(quantiaEmCredito == 2) {
			parcela = (valorAbastecido/2);
			System.out.printf("Está pago em duas parcelas de %.2f!", parcela);
		}
		else if(quantiaEmCredito == 3) {
			parcela = (valorAbastecido/3);
			System.out.printf("Está pago em três parcelas de %.2f!", parcela);
		}
		else {
			System.out.println("Parcela Inválida! Tente novamente em outra parcela");
			
		}
	}

}
