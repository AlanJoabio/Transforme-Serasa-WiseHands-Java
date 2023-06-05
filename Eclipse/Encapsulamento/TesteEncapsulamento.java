package Encapsulamento;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(100.00, "Gris");
		
		System.out.println("O saldo é: " + conta1.mostrarSaldo());
		System.out.println("O nome é: " + conta1.mostrarNome());
		
		conta1.mairoIdade(15);		
				
	}

}
