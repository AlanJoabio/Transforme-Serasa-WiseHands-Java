package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Sistema {
	
	public static void main(String[] args) {
		
		Set<String> pessoas = new HashSet<>();
		
		pessoas.add("Alexander");
		pessoas.add("Jonathan");
		pessoas.add("Alexander Medeiros");
		
//		verificar
		System.out.println(pessoas.contains("Alexander"));
		
		System.out.println(pessoas.contains(pessoas));
		
//		mostrar
		for (String elemento : pessoas) {
			System.out.println(elemento);
		}
		
		
//		ABCD... é TreeSET
		
		System.out.println(pessoas.size());
		
		System.out.println(pessoas.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
