package Encapsulamento;

public class ContaBancaria {
	
	public String nome;
	private int idade;	
	private double saldo;
	
	

	public ContaBancaria(double saldo, String nome) {

		this.saldo = saldo;
		this.nome = nome;
	}


	
	public double mostrarSaldo() {
		return saldo;
	}
	
	public String mostrarNome() {
		return nome;
	}
	
	public void mairoIdade(int idade) {
		this.idade = idade;
		System.out.println(idade);
	}
}
