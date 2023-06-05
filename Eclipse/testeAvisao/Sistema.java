package testeAvisao;

public class Sistema {
	
	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto();
		piloto1.nome = "Alexander";
		piloto1.nomeSobre = "Medeiros";
		
		Piloto piloto2 = new Piloto();
		piloto2.nome = "Jonathan";
		piloto2.nomeSobre = "Alves";
		
		Aviao aviao1 = new Aviao();
		aviao1.fabricante = "Embrear";
		aviao1.modelo = "111-AAA";
		aviao1.passageiros = 50;
		aviao1.qtdeMotores = 2;
		aviao1.piloto = piloto1;
		
		Aviao aviao2 = new Aviao();
		aviao2.fabricante = "Embrear";
		aviao2.modelo = "222-AAA";
		aviao2.passageiros = 120;
		aviao2.qtdeMotores = 4;
		aviao2.piloto = piloto2;
		
		
		System.out.println("Dados aviao 1");
		System.out.println(aviao1.modelo);
		System.out.println(aviao1.piloto.nome);
		
		System.out.println("\n");
		
		System.out.println("Dados aviao 2");
		System.out.println(aviao2.modelo);
		
		
	}

}
