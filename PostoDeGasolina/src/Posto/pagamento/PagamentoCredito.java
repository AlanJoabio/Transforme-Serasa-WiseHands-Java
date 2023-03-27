package Posto.pagamento;

import java.util.Scanner;

public class PagamentoCredito {
	
	public static void credito(double valorServico) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Opção escolhida é Crédito");
		System.out.println("Informe o valor:");
		double valorPago = entrada.nextDouble();
		
		while (valorPago < valorServico) {
		    System.out.println("O valor informado é invalido!");
		    valorPago = entrada.nextDouble();
		}
		entrada.close();
	}

}