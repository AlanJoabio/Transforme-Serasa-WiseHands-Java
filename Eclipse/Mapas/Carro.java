package Mapas;

import java.util.Objects;

public class Carro {
	
	private String placa;
	private String modelo;
	
	
	public Carro(String placa, String modelo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(placa, other.placa);
	}


	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + "]";
	}
	
	
	
	

	
}
