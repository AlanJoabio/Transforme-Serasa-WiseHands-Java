import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + "ª nota: " + notas[i]);
        }

        scanner.close();
    }
}
