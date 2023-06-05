package heranca;

public class SistemaHeranca {
	
	public static void main(String[] args) {
		
		Animal Animal1 = new Animal();
		
		Animal1.setNome("peixe");
		Animal1.setCor("cinza");
		Animal1.setMover("nadando");
		
		Animal1.animalMovendo();
		Animal1.emitirSom();
		
		System.out.println(Animal1.getNome());
		System.out.println(Animal1.getCor());
		
		
		
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Caramelo");
		cachorro1.setCor("Caramelo");
		cachorro1.setMover("Correndo");
		
//		diferente
		cachorro1.animalMovendo();
		
		cachorro1.correr();
		cachorro1.latir();
		
		System.out.println(cachorro1.getNome());
		System.out.println(cachorro1.getCor());
		
	}

}
