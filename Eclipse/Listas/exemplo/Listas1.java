package exemplo;

import java.util.ArrayList;
import java.util.List;

public class Listas1 {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Alexander");
		
		nomes.set(0, "Jonathan");
		
		nomes.remove("Nero");
		
		for (String nome : nomes) {
			System.err.println(nome);
		}
		
		
//		mostrar nomes
		String terceiroElemento = nomes.get(2);
		
		
		
	}

}
