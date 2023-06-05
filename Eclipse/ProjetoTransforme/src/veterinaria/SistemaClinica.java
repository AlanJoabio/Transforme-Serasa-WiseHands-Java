package veterinaria;

public class SistemaClinica {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int verificacao;
		
		do {
		
		Cachorro cao1 = new Cachorro();
		veterinaria vet1 - new veterinaria();
	
		System.out.println("informe cachorro o nome: ");
		String nome = entrada.next();
		System.out.println("\n");
		
		
//-----------------------------------------------------------------------------------------
		
		
		System.out.println("informe o sexo cachorro: \n1- Fêmea \n2- Macho");
		int sexo = entrada.nextInt();
		System.out.println("\n");
		
		
//---------------------------------------------------------------------------------------------
		
		
		System.out.println("informe cachorro quando idade: ");
		int idade = entrada.nextInt();
		System.out.println("\n");
				
				
//--------------------------------------------------------------------------------------------
		
		
		System.out.println("informe o raça: ");
		String raca = entrada.next();
		System.out.println("\n");
		
		
////--------------------------------------------------------------------------------------------
		
		
		System.out.println("informe seu cachorro tamanho \n1 - Pequeno \n2 - Medio \n3 - Grande");
		int tamanho = entrada.nextInt();
		System.out.println("\n");

		
//--------------------------------------------------------------------------------------------

		
		
		String fraseBemvinhe = cao1.bemvendeCachorro(nome);
		String fraseTamanho = cao1.tamanhoCachorro(tamanho);
		String fraseIdade = cao1.idadeCachorro();
		String fraseValor = cao1.valorCachorro(tamanho, sexo);
		
		System.out.println(fraseBemvinhe + " Raça é " + raca + " \nQual tamanho: " + fraseTamanho + ". \nidade de Cão " + idade + " anos, é igual idade Humano ate " + fraseIdade);
		System.out.println("Total a pagar \n" + fraseValor);
		
		System.out.println("Deseja adicionar mais um cachorro? \n 1- Sim e 2- Não");
		verificacao = entrada.nextInt();
		
		} while (verificacao != 2);	
		
		entrada.close();
		
	}

}
