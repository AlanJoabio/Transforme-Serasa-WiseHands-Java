package Introducao;

public class Pessoa {
	
	String nome;
	String sobraNome;
	
	String dadosDaPessoa() {
		
		return "O nome da pessoa é " + nome + " e o sobrenome é " + sobraNome;
	}

//---------------------------------------------------------------------------------------------------
	
	void dadosDaPessoa() {
		
		System.out.println("O nome da pessoa é " + nome + " e o sobrenome é " + sobraNome");
	}

}
