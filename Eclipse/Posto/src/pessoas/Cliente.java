package pessoas;

public class Cliente {
	
	public String nome;
	public String sobreNome;
	
	public Cliente(String nomeRecebido, String sobreNomeRecebido){
		nome = nomeRecebido;
		sobreNome = sobreNomeRecebido;
	}
	
	public void dizNomeCliente(String nomeCliente) {
		System.out.println("Olá meu nome é " + nomeCliente);
	}

}
