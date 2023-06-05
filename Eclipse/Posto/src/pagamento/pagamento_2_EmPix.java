package pagamento;

public class pagamento_2_EmPix {
	
	public static void pagoNoPix( double quantiaEmPix, double valorLavagem) {
		
		double Pix;
			
		if(quantiaEmPix == 1) {
			Pix = (valorLavagem);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
			
		}
		else if(quantiaEmPix == 2) {
			Pix = (valorLavagem);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else if(quantiaEmPix == 3) {
			Pix = (valorLavagem);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else {
			System.out.println(" Pix Inválido! Tente novamente em outro Pix");
			
		}
	}

}
