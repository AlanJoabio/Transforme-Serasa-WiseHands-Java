package Banco;


public class PessoaPJ extends PessoaPF{
	
	
	public String nome;
	public String sobreNome;
	private int conta;
	private double saldo;
	
	
	public PessoaPJ(String nomeTitular, int numeroConta, String ) {
		
	}
	
	
	public void depositoPJ() {
		System.out.println("\nInforme o valor para deposito?");
	};
	
	public void depositoSaldo(Double saldo) {
		System.out.println("\nDepositei do conta: " + (this.saldo + saldo));
	}

	
//	--------------------------------------------------------------

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
//	------------------------------------------------------------

	

}
