package SolicitaNumerosInteiros;

import java.util.Scanner;

public class SolicitacaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        char continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
            soma += numero;
            System.out.print("Deseja continuar digitando? (S/N) ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("A soma dos números digitados é: " + soma);
    }
}

