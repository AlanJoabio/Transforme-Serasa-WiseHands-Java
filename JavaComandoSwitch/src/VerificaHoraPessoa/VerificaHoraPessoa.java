package VerificaHoraPessoa;
import java.util.Scanner;

public class VerificaHoraPessoa {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Digite a hora (0-23): ");

	    int hora = sc.nextInt();
	    System.out.println("Digite o tipo de pessoa (F para fisica ou J para jurídica): ");
	    char tipoPessoa = sc.next().charAt(0);

	    String saudacao = "";

	    switch (hora){
	      case 0:
	      case 1:
	      case 2:
	      case 3:
	      case 4:
	      case 5:
	        saudacao = "Boa noite!";
	        break;

	      case 6:
	      case 7:
	      case 8:
	      case 9:
	      case 10:
	      case 11:
	        saudacao = "Bom dia!";
	        break;

	      case 12:
	      case 13:
	      case 14:
	      case 15:
	      case 16:
	      case 17:
	        saudacao = "Boa tarde!";
	        break;

	      case 18:
	      case 19:
	      case 20:
	      case 21:
	      case 22:
	      case 23:
	        saudacao= "Boa noite!";
	        break;

	      default:
	        System.out.println("Hora inválida.");
	        break;
	    }

	    String pessoa = "";
	    switch (tipoPessoa){

	      case 'F':
	        pessoa = "Para pessoa física.";
	        break;

	      case 'J':
	        pessoa ="Para pessoa jurídica.";
	        break;

	      default:
	        System.out.println("Tipo de pessoa inválido.");
	        break;
	    }

	    if (!saudacao.isEmpty() && !pessoa.isEmpty()) {
	      System.out.println(saudacao + " " + '\n' + pessoa);
	    }

	    sc.close();
	  }

}
