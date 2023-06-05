package Conjuntos;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOperacoes {
	
	public static void main(String[] args) {
		
//		União
		Set<String> grupo1 = new TreeSet<>(Arrays.asList("Alexander", "Medeiros", "Pascoal", "Oliveira"));
		Set<String> grupo2 = new TreeSet<>(Arrays.asList("Jonathan", "ALves", "Oliveira"));
		
		Set<String> grupoUniao = new TreeSet<>(grupo1);
		grupoUniao.addAll(grupo2);
		
		System.out.println(grupoUniao);
		
		
		Set<String> somaDosTres = new TreeSet<>(grupoUniao);
		
		
		
		
//		Int
		Set<String> pessoasEmComum = new TreeSet<>(grupo1);
		
		pessoasEmComum.retainAll(grupo2);
		
		System.out.println(pessoasEmComum);
		
//		Diferente
		Set<String> grupoDiferenca = new TreeSet<>(grupo1);
		grupoDiferenca.remove(grupo2);
		
		System.out.println(grupoDiferenca);
		
		
	}

}
