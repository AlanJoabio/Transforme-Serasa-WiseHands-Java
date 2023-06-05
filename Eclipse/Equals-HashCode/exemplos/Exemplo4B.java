package exemplos;

public class Exemplo4B {
	
	public static void main(String[] args) {
		
		Exemplo4 produto1 = new Exemplo4("1", "Lápis");
		Exemplo4 produto2 = new Exemplo4("2", "Borracha");
		
		System.out.println(produto1.hashCode());
		System.out.println(produto2.hashCode());
		
		System.out.println(produto1.equals(produto2));
		
		
		
	}

}
