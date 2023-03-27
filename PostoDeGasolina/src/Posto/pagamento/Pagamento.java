package Posto.pagamento;

import java.util.Scanner;
// Alan e Gioavanni
public class Pagamento {
  public static void formaPagamento(double valorServico) {
    int opcaoPagamento;

      Scanner entrada = new Scanner(System.in);
do{
      System.out.println("Qual é a forma de pagamento?");
      System.out.println("[1] - Pix ");
      System.out.println("[2] - Débito ");
      System.out.println("[3] - Crédito");
      System.out.println("[4] - Dinheiro");
      System.out.println("Digite a sua opção: ");
      opcaoPagamento = entrada.nextInt();


        switch (opcaoPagamento){
          case 1:
          PagamentoPix.pix(valorServico);
            break;
          case 2:
          PagamentoDebito.debito(valorServico);
            break;
          case 3:
            PagamentoCredito.credito(valorServico);

            break;
          case 4:
            PagamentoDinheiro.dinheiro(valorServico);
            break;


        default:
            System.out.println("Desculpa, opção invalida! ");
            break;
        }
} while (opcaoPagamento != 1 && opcaoPagamento != 2 && opcaoPagamento != 3 && opcaoPagamento != 4);
		System.out.println("Obrigado. Volte Sempre!");

		entrada.close();
    }
}
