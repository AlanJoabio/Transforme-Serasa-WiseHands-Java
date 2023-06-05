package pagamento;

public class Pagamento {
	
public static void formaPagamento(int formaEscolhido, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch (formaEscolhido) {
		case 1: {
			System.out.println("Sera pago no dinheiro");
			System.out.println("Qual sera a quantia paga?");
			double quantiaEmDinheiro = entrada.nextDouble();
			
			if (quantiaEmDinheiro == valorAbastecido) {
				System.out.println("Obrigado, tenha um bom dia!");
			} else if (quantiaEmDinheiro > valorAbastecido) {
				double troca = quantiaEmDinheiro - valorAbastecido;
				
				System.out.println("O seu troco é de %.2f, agradecemos a preferencia.");
			} else 
			
			
			break;
		}
		default:
			break;
		}
		
		
		
	}

}
