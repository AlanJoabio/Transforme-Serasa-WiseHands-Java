package Banco;

import java.util.Scanner;

public class SistemaBanco {
	
	public static void main(String[] args) {
		
		String documentos;
		int digitarProximo;
						
		Scanner entrada = new Scanner(System.in);
		
		PessoaPF contaPF1 = new PessoaPF();
		contaPF1.setNome("Alexander");
		contaPF1.setSobreNome("Medeiros");
		contaPF1.setConta(123456-7);
		contaPF1.setSaldo(100.00);
		
		
		PessoaPJ contaPJ1 = new PessoaPJ();
		contaPJ1.setNome("Academia");
		contaPJ1.setSobreNome("Body");
		contaPJ1.setConta(987654-3);
		contaPJ1.setSaldo(1000.00);
		
// --------------------------------------------------------------------
	
		do {			
		
		System.out.println("Informe o seu numero CPF ou CNPJ?");
		documentos = entrada.next();
		
		if (documentos.length() == 14) {
			
			System.out.printf("\nNome do Titular: %s %s \n", contaPF1.getNome(), contaPF1.getSobreNome());
			System.out.printf("Pessoa Física: %s \n", documentos);
			System.out.printf("Numero da Conta Corrente: %s \n", contaPF1.getConta());
			System.out.printf("Saldo do conta %s \n", contaPF1.getSaldo());
			
			contaPF1.depositoPF();
			double saldo = entrada.nextDouble();
			
			contaPF1.depositoSaldo(saldo);
			
		} else if (documentos.length() == 18) {
			System.out.printf("\nNome do Titular %s %s \n", contaPJ1.getNome(), contaPJ1.getSobreNome());
			System.out.printf("Pessoa Juridica: %s \n", documentos);
			System.out.printf("Numero da Conta Corrente: %s \n", contaPJ1.getConta());
			System.out.printf("Saldo do conta %s \n", contaPJ1.getSaldo());
			
			contaPJ1.depositoPJ();
			double saldo = entrada.nextDouble();
			
			contaPJ1.depositoSaldo(saldo);
			
		} else{
			System.out.println("Esta não é um numero válido.");
		}
		
// -------------------------------------------------------------------
		
		System.out.println("\nDeseja digitar outro numero? \n1-Sim 2-Não:");
		digitarProximo = entrada.nextInt();
		
		} while (digitarProximo !=2);

// -------------------------------------------------------------------
		
		entrada.close();
		
	}

}
