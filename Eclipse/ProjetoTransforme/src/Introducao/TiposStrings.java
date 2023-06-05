package Introducao;

public class TiposStrings {
	
	public static void main(String[] args) {
		String nome = Alexander;
		String sobreNome = Medeiros;
				
		System.out.println("O nome dele é ? " + nome);
		
		System.out.printf(" o dele nome é. %s, o é sobrenome %s", nome, sobreNome);
	}
	
	
	
	
	
	
	
	int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
	
	if (num % 2 == 0) {
		JOptionPane.showMessageDialog(null, "O número " + num + " é PAR");
	}else {
		JOptionPane.showMessageDialog(null, "O numero " + num + " é IMPAR");
	}

}
