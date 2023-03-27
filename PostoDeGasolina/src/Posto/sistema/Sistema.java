package Posto.sistema;

import Posto.servicos.Abastecimento;
import Posto.servicos.Lavagem;

import java.util.Scanner;

// Alan e Marlus criou o Sistema
// Giovanni e Alan criou o pagamento
// Marlus e Renan adicionou lavagem
public class Sistema {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int escolhaCliente;

        System.out.println(" Olá, Seja Bem Vinda(o) ao Posto de Gasolina SeSerasa");
        System.out.println("Veja o seguintes serviços: ");
        System.out.println("[1] - Abastecimento ");
        System.out.println("[2] -Lavagem");
        System.out.println(" Digite a sua opção: ");
        escolhaCliente = entrada.nextInt();
        
        if (escolhaCliente == 1) {
          Abastecimento.Abastecer();
        } else if (escolhaCliente == 2) {
          Lavagem.lavagemVeiculos();
        } else {

        System.out.println("Essa opção não existe.");
      }
      
        entrada.close();
    }
}
