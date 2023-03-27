package Posto.servicos;

import java.util.Scanner;

import Posto.pagamento.Pagamento;

// Alan e Marlus
public class Abastecimento {

        static double precoGasolina = 6.50;
        static double precoGasolinaAtivada = 6.60;
        static double precoEtanol = 5.50;
        static double precoDiesel = 7.60;
        static int tipoCombustivel;
        static double qtdCombustivel, valorAbastecer, valorTotalCombustivel;
  public static void Abastecer() {
      
    Scanner entrada = new Scanner(System.in);

        do {
      
        System.out.println("Hoje temos seguinte tipo de combustiveis:");
        System.out.println("[1] - Gasolina R$6,50 por litro ");
        System.out.println("[2] - Etanol R$5,50 por litro ");
        System.out.println("[3] - Diesel R$ 7,60 por litro ");
        System.out.println("[4] - Gasolina ativada R$6,60 por litro ");
        System.out.println("Digite a sua opção:");
        tipoCombustivel = entrada.nextInt();

        System.out.println("Quanto quer abastecer?");
        valorAbastecer = entrada.nextDouble();

        if(tipoCombustivel == 1){
            qtdCombustivel = valorAbastecer / precoGasolina;
            System.out.printf("Ok, foi  abastecido %.2f litros de gasolina, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
            valorTotalCombustivel = valorAbastecer;
        } else  if(tipoCombustivel == 2){
            qtdCombustivel = valorAbastecer / precoEtanol;
            System.out.printf("Ok, foi  abastecido %.2f litros de etanol, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                valorTotalCombustivel = valorAbastecer;
          }else if(tipoCombustivel == 3){
            qtdCombustivel = valorAbastecer / precoDiesel;
            System.out.printf("Ok, foi  abastecido %.2f litros de diesel, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                valorTotalCombustivel = valorAbastecer;
          } else if (tipoCombustivel == 4) {
          qtdCombustivel = valorAbastecer / precoGasolinaAtivada;
          System.out.printf("Ok, foi  abastecido %.2f litros de gasolina ativada, rendendo o valor de R$ %.2f reais ",
              qtdCombustivel, valorAbastecer);
              valorTotalCombustivel = valorAbastecer;
          } else {
          System.out.println("Essa opção não existe.");
        }
      } while (tipoCombustivel != 1 && tipoCombustivel != 2 && tipoCombustivel != 3 && tipoCombustivel != 4);

      System.out.println(">>><<<");

		Pagamento.formaPagamento(valorTotalCombustivel);

        entrada.close();
    }
}
