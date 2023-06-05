package posto.src.pessoas.copy2;

public class Trabalhar {

	public static void main(String[] args) {
		
		Bonus b1 = new Bonus(" Troca de óleo", 20);
		
		Funcionario fun1 = new Funcionario();
		fun1.nome = "Gabriel";
		fun1.saldoConta= 200;
		
		fun1.trabalhar(b1);
		
		System.out.println(fun1.saldoConta);
	}

}
