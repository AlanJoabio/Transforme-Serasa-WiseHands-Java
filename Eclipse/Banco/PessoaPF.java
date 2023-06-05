package Banco;

public class PessoaPF {

	
	public String nomeTitular;
	private int numeroConta;
	private double saldo;
	
	
	public PessoaPF(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	
	
	public void depositoPF() {
		System.out.println("\nInforme o valor para deposito?");
	};
	
	public void depositoSaldo(Double saldo) {
		System.out.println("\nDepositei do conta: " + (this.saldo + saldo));
	}
		
// ------------------------------------------------------------

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
		this.saldo += saldo;
	}
	
	
	
	
}
