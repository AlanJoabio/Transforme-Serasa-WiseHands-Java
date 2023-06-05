package posto.src.pessoas.copy.copy;
			 
public class Cliente {

	public String nome;
	public String sobreNome;
	
	Cliente(String NomeRecebido, String SobreNomeRecebido) {
		nome = NomeRecebido;
		sobreNome = SobreNomeRecebido;
	}
	
	public void dizNomeCliente(String nomeCliente) {
		System.out.println(" Olá meu nome é "+nomeCliente);

	}
	
}


