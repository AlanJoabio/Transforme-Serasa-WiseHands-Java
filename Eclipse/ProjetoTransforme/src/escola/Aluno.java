package escola;

public class Aluno {
	
	String nome;
	String sobrenome;
	int matricula;
	String serie;
	String turma;
	
	//Construtores
	Aluno (String nomeRecebido, String sobrenomeRecebido){
		nome = nomeRecebido;
	}
	
//	double calculaMedia() {
//		
////		System.out.println("O Método foi chamado!");
//		
//		return 0;
//	}
	
	
	
//	void
	double calculaMedia( double nota1, double nota2, double nota3) {
		
		double somaDasNotas = nota1 + nota2 + nota3;
		
		return somaDasNotas / 4;
//		System.out.println("Media calculada na classe" + somaDasNotas / 4);
	}
	
	
	String bemvindoAluno (int sexoPessoa, String nome, String sobrenome) {
		
		if (sexoPessoa == 1) {
			return "Seja bem-vinda, querida alunoa " + nome + " " + sobrenome;
		} else if (sexoPessoa == 2) {
			return "Seja bem-vindo, querido aluno " + nome + " " + sobrenome;
		} else {
			return "Seja bem-vinde, queride alune " + nome + " " + sobrenome;
		}
	}
	
	
	String dadosDaEscola() {
		
		return "O nome da pessoa é " + nome + " e o sobrenome é " + sobrenome + " marticula é " + matricula;
	}

//---------------------------------------------------------------------------------------------------
	
//	void dadosDaEscola() {
//		
//		System.out.println("O nome da pessoa é " + nome + " e o sobrenome é " + sobrenome");
//	}

}
