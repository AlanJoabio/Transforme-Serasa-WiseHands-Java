package Introducao;

public class MetodosTeste {
	
public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Informe o seu nome: ");
//		String nome = entrada.nextLine();
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Alexander";
		pessoa1.sobraNome = "Medeiros";
		
		System.out.println(pessoa1.nome);
		
		
		
		
//		String nome = "Alan";
//		System.out.println("O nome é " + nome);
		
		
		System.out.println(pessoa1.dadosDaPessoa());
		
		
		pessoa1.dadosDaPessoa();
		
	
	}

}
