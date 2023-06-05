package EqualseHashCode.Exemplos;

public class Exemplo1B {

		public static void main(String[] args) {
		
		Exemplo1 produto1 = new Exemplo1 ("1", "Lápis");
		Exemplo1 produto2 = new Exemplo1 ("2", "Borracha");
		
		System.out.println(produto1.hashCode());
		System.out.println(produto2.hashCode());
		
		System.out.println(produto1.equals(produto2));
		
		
		
		
		
		
		
		
		
		
		}	
}
