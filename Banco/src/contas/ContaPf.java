package contas;

public class ContaPf {

    private String titular;
    private String numeroConta;

    public ContaPf(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
