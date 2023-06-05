package escola;

public class SistemaEscola {
	
public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Sergio";
		aluno1.sobrenome = "Alves";
		aluno1.matricula = 0001;
		aluno1.serie = "7ª série";
		aluno1.turma = "B";
		
	
		double mediaDoAluno = aluno1.calculaMedia(3.5, 5.5, 7.5);
		System.out.println(mediaDoAluno);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o sexo: 1- F, 2- M, 3- Prefiro nao informe");
		int sexo = entrada.nextInt();
		
		String fraseFormatado = aluno1.bemvindoAluno(sexo, "Sergio", "Alves");
		System.out.println(fraseFormatado);
		
		
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Livia";
		aluno2.sobrenome = "Antonia";
		aluno2.matricula = 0002;
		
		
		System.out.println(aluno1.nome);
		
		System.out.println(aluno2.dadosDaEscola());
		
		
		
	}

}
