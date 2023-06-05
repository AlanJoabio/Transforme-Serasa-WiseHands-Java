package Atividades;

public class AtividadeAula6B {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String Cliente;
		String Documentos;
		int digitarProximo;
		int Opcoes;
		double juros;
		int opceosOutro;
		
		System.out.println("Seja bem-vindo (a), Eu sou Alexander. \nAssistene Virtual Sicoob Central e estou aqui para ajudar. \nPara começarmos, imforme o seu nome: ");
		Cliente = entrada.next();
		
		
		System.out.printf("Olá, %s. Por favor DIGITE em uma das opções para comerçarmos: \n", Cliente);
		System.out.println("1 - Conulta \n2 - Atrasar Pagamento \n3 - Outro");
		Opcoes = entrada.nextInt();
		
		do {
			
			switch (Opcoes) {
//----------------------------------------------------------------------------------------------------------------------------
			case 01: 
				System.out.println("Informe o seu numero CNPJ ou CPF: ");
				Documentos = entrada.next();
				
				if (Documentos.length() == 18) {
					System.out.printf("%s, é uma CNPJ", Cliente);			
					} else if (Documentos.length() == 14) {
						System.out.printf("%s, é uma CPF", Cliente);
						} else { 
							System.err.println("Esta não é um numero válido!");
						}
				break;
			
//-----------------------------------------------------------------------------------------------------------------------------
			case 02: 
				System.out.println("Informe o valor do boleto: ");
				double valorBoleto = entrada.nextDouble();
				
				System.out.println("Informe o dia do vencimento: ");
				int diaVencimento = entrada.nextInt();
				
				System.out.println("Informe a data de pagamento: ");
				int diaPagamento = entrada.nextInt();
				
				int diasEmAtraso = diaPagamento - diaVencimento;
				
				if (diaVencimento >= diaPagamento) {
					System.out.println("Obrigado, o seu boleto foi pago sem juros.");
					
				
					} else if (diaPagamento < 1 || diaPagamento > 31) {
						
						System.out.println("O dia de pagamento informado é inválido");	
					
					} else if (diaVencimento < 1 || diaVencimento > 31) {
						
						System.out.println("O dia de vencimento informado é inválido");
					}
				
					else if (diaVencimento < diaPagamento && diasEmAtraso <= 10) {
						
						juros = diasEmAtraso * 1.0;
						double valorCorrigido = valorBoleto + juros;
						System.out.println("O valor do boleto corrigido é " + valorCorrigido);
						
					} else if (diaVencimento < diaPagamento && diasEmAtraso > 10) {
							
						juros = diasEmAtraso * 1.50;
						double valorCorrigido = valorBoleto + juros;
						System.out.println("O valor do boleto corrigido, para 15 dias é " + valorCorrigido);
					}
				break;				
			
//----------------------------------------------------------------------------------------------------------------------------	
			case 03: 
				System.out.println("Escolha a opção desejada.");
				System.out.println("1 - Compra no débito \n2 - Falta com atendimento \n3 - Nemhuma das opções");
				opceosOutro = entrada.nextInt();
				
				//----------------------------------------------------------------------------------------------------------------
				switch (opceosOutro) {
				case 01: 
					System.out.println("A nossa equipe de especialistas vai falar com você para esclarecer dúvidas sobre o uso sdo cartão de déito.");
					break;
					
				case 02: 
					System.out.println("Só um instante enquanto iniciamos o chat com a nossa equipe.");
					break;
					
				case 03: 
					System.out.println("Outro a opção desejada. \nSe preferir, escreva a sua solicitação em uma única mensagem.");
					break;
				}
				//--------------------------------------------------------------------------------------------------------------------
			}

			System.out.println("\n");
			System.out.println("Deseja digitar outro numero \n1-Sim 2-Não: ");
			digitarProximo = entrada.nextInt();
			
			
		} while (digitarProximo !=2);
		
		System.out.println("\n");
		System.out.printf("A seu atendimento foi encerrado. \nAgradecemos o contato!");	
			
		entrada.close();
		
	}

}
