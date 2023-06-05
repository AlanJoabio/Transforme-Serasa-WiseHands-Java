package gettersesetters;

public class TesteAcesso {

	public static void main(String[] args) {
		
		ExemploGettersESetters tati = new ExemploGettersESetters();
		
//		System.out.println(tati.nome);
		
//		Antes
		tati.alteraNome("Alexander");
//		Depois
		System.out.println(tati.informaNome());
		
//		Setters atribuir
		tati.setNome("Tati");
		tati.setSobreNome("Martins");
		
//		getters nosso objetos
		System.out.println(tati.getNome());
		System.out.println(tati.getSobreNome());
		
		
		
		
		
		
	}
	
}
