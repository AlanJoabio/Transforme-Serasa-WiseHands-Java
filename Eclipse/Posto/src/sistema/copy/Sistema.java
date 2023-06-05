package posto.src.sistema.copy;

import java.util.Scanner;

import pagamento.Pagamento_1_Abastecimento;
import pagamento.Pagamento_2_Lavagem;
import servicos.Abastecimento;
import servicos.Lavagem;
//import pessoas.Cliente;

public class Sistema {
	public static void main(String[] args) {	
	
		Scanner entrada = new Scanner(System.in);
							
		System.out.println(" Olá, Seja Bem-vindo ao Posto Transforme-se");
		
		System.out.println("\n Qual serviço deseja fazer? \n   1- Abastecer \n   2- Lavar carro");
		int escolhaCliente = entrada.nextInt();

		if (escolhaCliente == 1) {
			System.out.println("\n O preço dos combustiveis: \n   1- Gasolina R$ 4.75 \n   2- Etanol R$ 3.85 \n   3- Diesel R$ 5.15");
			System.out.println("\n Qual combustivel gostaria de abastecer?");
			int tipoCombustivel = entrada.nextInt();
			
			System.out.println("\n Quanto gostaria abastecer em Reais?");
			double valorAbastecer = entrada.nextDouble();
		
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
	
        	System.out.println("\n Qual seria a forma de pagamento? \n   1- Dinheiro \n   2- Débito \n   3- Crédito \n   4- Pix");
			int formaPagamento = entrada.nextInt();
			
			Pagamento_1_Abastecimento.formaPagamento(formaPagamento, valorAbastecer);
						
		//} else if (escolhaCliente == 2) {
				// Trocar oleo
			
		} else if (escolhaCliente == 2) {				
			System.out.println(" Qual o tamanho do veículo? \n   1- Pequeno R$ 20,00 \n   2- Médio R$ 30,00 \n   3- Grande R$ 40,00");
			int tamanhoCarro = entrada.nextInt();
			
			System.out.println(" Opção de lavagem? \n   1- Por dentro R$ 15,00 \n   2- Somente por fora");
			double valorLavar = entrada.nextDouble();
						
			//Lavagem.Lavar(tamanhoCarro, valorLavar);	
			Lavagem lavar = new Lavagem();
			double valorTotal = lavar.Lavar(tamanhoCarro, valorLavar);
			
			System.out.println("\n Qual seria a forma de pagamento? \n   1- Dinheiro \n   2- Débito \n   3- Crédito \n   4- Pix");
			int formaPagamento = entrada.nextInt();
			 
			Pagamento_2_Lavagem.formaPagamento(formaPagamento, valorTotal);
			
		} else {
			System.out.println(" Inválido! Tente novamente em outro: 1- Abastecer 2- Lavar carro");
			
		} 
		entrada.close();
	}
} 