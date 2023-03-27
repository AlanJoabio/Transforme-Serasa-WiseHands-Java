package Posto.pagamento;

import java.util.Scanner;

public class PagamentoDinheiro {

  public static void pagamentoEmDinheiro(double valorServico) {

      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Em Dinheiro");

      System.out.println("Digita o valor a pagar?");
      double valorPago = entrada.nextDouble();


        if(valorPago == valorServico){
            System.out.println("Confimado, Obrigado pela preferencia!");
        }else if(valorPago > valorServico){
            double troco = valorPago- valorServico;
            System.out.println("O seu troco é : " + troco + " , Obrigado pela preferencia!!");
        }else if(valorPago < valorServico){
            System.out.println("Obrigado, Nem sonhando em fiado, procure outro lugar!");
        }
		entrada.close();

    }

  public static void dinheiro(double valorServico) {
  }

  
}
