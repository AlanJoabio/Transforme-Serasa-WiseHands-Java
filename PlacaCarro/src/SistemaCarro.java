public class SistemaCarro {
    public static void main(String[] args) {
        String dadosPlaca = "1A2B3C";
        Placa placa = new Placa(dadosPlaca);
        Carro carro = new Carro(placa);
        System.out.println("Placa do carro: " + carro.getPlaca().getNome());
    }
}
