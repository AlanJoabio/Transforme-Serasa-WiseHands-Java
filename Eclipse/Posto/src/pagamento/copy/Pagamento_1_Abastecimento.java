package posto.src.pagamento.copy;

import java.util.Scanner;

public class Pagamento_1_Abastecimento {

	public static void formaPagamento(int formaEscolhida, double valorAbastecido) {
		 
		Scanner entrada = new Scanner(System.in);

		switch (formaEscolhida) {
		case 1:
			System.out.println("Será pago no dinheiro\n");
			
			System.out.println("Qual será a quantia pagar?");
			double quantiaEmDinheiro = entrada.nextDouble();
			
			pagamento_1_EmDinheiro.pagoNoDinheiro(quantiaEmDinheiro, valorAbastecido);
			
			break;
			
		case 2: 
			System.out.println("Será pago no Debito.\n");
			double quantiaEmDebito = entrada.nextDouble();
			
			pagamento_1_EmDebito.pagoNoDebito(quantiaEmDebito, valorAbastecido);
			
			break;
			
		case 3:
			System.out.println("Será pago no Credito.\n");
			
			System.out.println("Quantas parcelas? Permitido em até 3 parcelas.\n");
			double quantiaEmCredito = entrada.nextDouble();
			
			pagamento_1_EmCredito.pagoNoCredito(quantiaEmCredito, valorAbastecido);
			
			break;
			
		case 4:
			System.out.println("Será pago no Pix.\n");
			
			System.out.println("Qual é a cahve de um Pix? \n 1 - CPF \n 2 - Celular \n 3 - E-mail.\n");
			double quantiaEmPix = entrada.nextDouble();
			
			pagamento_1_EmPix.pagoNoPix(quantiaEmPix, valorAbastecido);
			
			break;

		default:
			break;
		}
		
		entrada.close();
		
	}
	
	
}
