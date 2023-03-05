package EstruturaFor;

import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.printf("Digite o %dº número par: ", i);
            int num = sc.nextInt();

            if (num % 2 != 0) {
                System.out.println("Você não digitou um número par. Tente novamente.");
                i--; // decrementa o contador para que o usuário insira o número correto
            } else {
                soma += num;
                contador++;
            }
        }

        System.out.println("\nSoma dos números pares digitados: " + soma);
    }
}

