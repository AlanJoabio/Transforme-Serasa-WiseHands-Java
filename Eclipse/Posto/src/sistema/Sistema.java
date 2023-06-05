package sistema;

public class Sistema {
	
public static void main(String[] args) {
		
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		double qtdeCombustivel;
		
		Scanner entrada = new Scanner(System.in);
		
////		Cliente c1 = new Cliente();
////		c1.nome = "Alexander";
////		c1.sobreNome = "Medeiros";
//		
//		
//		Cliente c2 = new Cliente("Jonathan", "Alves");
//		Cliente c3 = new Cliente("Ariel", "Xavier");
//		Cliente c4 = new Cliente("Nero", "Alves");
//		
//		System.out.println(c2.nome);
//		System.out.println(c2.sobreNome);
//		
//		c2.dizNomeCliente("Gris");
//		
//		
//		System.out.println(Funcionario.enderecoPosto);
//		
//		
//		Credito.pagoNoCredito("Alexander");
		
		
		System.out.println("Olá seja bem-vinho(a) ao posto Transforme-se");
		
		System.out.println("Qual serviço deseja fazer? 1-Abastecer");
		escolhaCliente = entrada.nextInt();
		
		if (escolhaCliente == 1) {
			System.out.println("O preço dos combustíveis: 1-Gasolina R$ 4,75 2-Etanol 3,85 3-Diesel 5.15 ");
			tipoCombustivel = entrada.nextInt();
			
			
			System.out.println("Quanto gostaria de abastecer?");
			valorAbastecer = entrada.nextDouble();
			
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
			
			System.out.println("");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
