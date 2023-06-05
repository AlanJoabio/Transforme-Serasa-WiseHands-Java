package Introducao;

public class SistemaPosto {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tiposServico;
		int resposta;
		
		System.out.println("Olá seja bem-vindo(a) ao posto Transforme-se");
		
		System.out.println("Qual servico deseja fazer ?");
		System.out.println("1- Abastecer 2- Lavar o carro 3- Trocar óleo");
		
		tiposServico = entrada.nextInt();
		
		do {
			System.out.println("Gostaria de fazer outro servico? 1- Sim 2- Não");
			resposta = entrada.nextInt();
		
		
		switch (tiposServico) {
		case 1: 
			System.out.println("Abastecer");
			break;
		
		case 2:
			System.out.println("Lavar Carro");
			break;
			
		case 3: 
			System.out.println("Trocar óleo");
			break;
			
		default:
			System.out.println("Servico inválido");
			break;
		}	
		
		
		} while (resposta !=2);
		
		
	}

}
