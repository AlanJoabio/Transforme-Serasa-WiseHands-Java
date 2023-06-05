package veterinaria;

public class Cachorro {
	
	String nome;
	String raca;
	int sexo;
	int idade;
	int tamanho;
	double valor;
	
	
	String veterinaria (String nomerecebido, String racarecebido) {
		nome = nomerecebido;
		raca = racarecebido;
	}

	
	
	//---------------------------------------------------------------------------------------
	
	String bemvendeCachorro (String nome) {
			
			if (sexo == 1) {
				return "Seja bem-vinda, cachorro nome é a " + nome + " é a Fêmea.";
			} else if (sexo == 2) {
				return "Seja bem-vindo, cachorro nome é o " + nome + " é o Macho.";
			} else {
				return "Esta não é válide!";
			}
	};
	
	//-----------------------------------------------------------------------------------------
		 
	String tamanhoCachorro (int tamanho) {
			if (tamanho == 1) {
				return "Pequeno";
			} else if (tamanho == 2) {
				return "Medio";
			} else if (tamanho == 3) {
				return "Grande";
			} else {
				return "Esta não é válide";
			}
	};	
	
	//-------------------------------------------------------------------------------------
	
	
	String idadeCachorro() {
			if (idade >= 0 || idade <= 4) {
				return "20 anos";
			} else if (idade >= 5 || idade <= 9) {
				return "36 anos";
			} else if (idade >= 10 || idade <= 14) {
				return "56 anos";
			} else if (idade >= 15 || idade <= 19) {
				return "76 anos";
			} else if (idade >= 20) {
				return "96 anos";
			} else {
				return "Esta não é válide";
			}
	};
		
	
	//---------------------------------------------------------------------------------------
	
	String valorCachorro(int tamanho, int sexo) {
		double soma = tamanho * sexo;
		double valorSoma = soma * 50;
		
		return "R$ " + valorSoma;
	};
	
	//Fim----------------------------------------------------------------------------------
	
//	void dadosCachorro() {
//		System.out.println();
//	}

}
