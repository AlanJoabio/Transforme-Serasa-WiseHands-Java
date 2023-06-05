package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
	
	public static void main(String[] args) {
		
		Proprietario alexander = new Proprietario("Alexander", "111.111.111-11");
		Proprietario jonathan = new Proprietario("Jonathan", "222.222.222-22");
		
		Carro carro1 = new Carro("AAA-111", "Fiat Uno");
		Carro carro2 = new Carro("BBB-222", "VW Gol");
		
		Map<Carro, Proprietario> proprietarios = new HashMap<>();
		
		proprietarios.put(carro1, alexander);
		proprietarios.put(carro2, jonathan);
		
		
		System.out.println(proprietarios);
		
		for(Carro carro : proprietarios.keySet()) {
			System.out.println(carro);
		};
		
		for(Proprietario dono : proprietarios.values()) {
			System.out.println(dono);
		}
		
		for(Carro carro : proprietarios.keySet()) {
			Proprietario dono = proprietarios.get(carro);
			System.out.println("A Placa %s do carro %s pertence a %s \n", carro.getPlaca(), carro.getModelo(), );
		}
		
		
	}

}
