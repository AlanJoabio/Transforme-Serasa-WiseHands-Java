package posto.src.pagamento.copy;

public class pagamento_1_EmPix {
	
	public static void pagoNoPix( double quantiaEmPix, double valorAbastecido) {
		
		double Pix;
			
		if(quantiaEmPix == 1) {
			Pix = (valorAbastecido);
			System.out.printf("Você faz um Pix para Posto, no valor de %.2f!", Pix);
			
		}
		else if(quantiaEmPix == 2) {
			Pix = (valorAbastecido);
			System.out.printf("Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else if(quantiaEmPix == 3) {
			Pix = (valorAbastecido);
			System.out.printf("Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else {
			System.out.println("Pix Inválido! Tente novamente em outro Pix");
			
		}
	}

}
