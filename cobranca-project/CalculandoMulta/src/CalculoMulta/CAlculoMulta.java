package CalculoMulta;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class CAlculoMulta {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Recebe a data atual e  a data de vencimento
		LocalDate dataAtual = LocalDate.of(2022, 2, 23);
		LocalDate dataVencimento = LocalDate.of(2022, 2, 8);
		
		//Calcula a diferença em dias entre as duas datas
		long diasAtraso = ChronoUnit.DAYS.between(dataVencimento,dataAtual);
		
		//Se a conta estiver com até 10 dias de atraso, o valor da multa é R$ 1,00 por dia
		if (diasAtraso > 0 && diasAtraso <= 10) {
			double valorMulta = diasAtraso * 1.0;
			double valorTotal = valorMulta + 100.0; //Valor da conta corrigido
			System.out.printf("O valor da multa é R$ %.2f e o valor total é R$ %.2f", valorMulta, valorTotal);
			
		}
		
		//Se a conta estiver com mais de 10 dias de atraso, o valor da conta corrido
		else if (diasAtraso > 10) {
			double valorMulta = 1.5;
			double valorTotal = valorMulta = 100.0; //Valor da conta corrigido
			System.out.printf("O Valor da multa é R$ %.2f e o valor total é R$ %.2f", valorMulta, valorTotal);
			
		}
		//Caso Contrário, não há multa a ser aplicada
		else {
			System.out.println("Não há multa a ser aplicada.");
		}
		
		scanner.close();
	}

}
