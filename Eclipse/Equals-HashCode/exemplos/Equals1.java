package exemplos;

import Atribuicao.Pessoa;

public class Equals1 {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Alexander";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "jonathan";
		
		System.out.println(pessoa1 == pessoa2);
		
		System.out.println(pessoa1.equals(pessoa2));
		
		
	}

}
