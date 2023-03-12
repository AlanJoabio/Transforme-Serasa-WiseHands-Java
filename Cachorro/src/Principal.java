public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Bolinha", "Poodle", 'F', 3);
        Cachorro cachorro2 = new Cachorro("Rex", "Vira-lata", 'M', 5);

        // Atribuindo valores aos atributos de cada cachorro
        cachorro1.setNome("Belinha");
        cachorro1.setRaca("Golden Retriever");
        cachorro1.setSexo('F');
        cachorro1.setIdade(2);

        cachorro2.setNome("Toby");
        cachorro2.setRaca("Beagle");
        cachorro2.setSexo('M');
        cachorro2.setIdade(1);

        // Acessando e imprimindo os valores dos atributos de cada cachorro
        System.out.println("Cachorro 1:");
        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Raça: " + cachorro1.getRaca());
        System.out.println("Sexo: " + cachorro1.getSexo());
        System.out.println("Idade: " + cachorro1.getIdade());

        System.out.println();

        System.out.println("Cachorro 2:");
        System.out.println("Nome: " + cachorro2.getNome());
        System.out.println("Raça: " + cachorro2.getRaca());
        System.out.println("Sexo: " + cachorro2.getSexo());
        System.out.println("Idade: " + cachorro2.getIdade());
    }
}
