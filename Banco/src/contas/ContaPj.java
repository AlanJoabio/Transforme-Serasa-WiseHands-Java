package contas;

public class ContaPj extends ContaPf {

    private String nomeEmpresa;
    private String cnpjEmpresa;

    public ContaPj(String titular, String numeroConta, String nomeEmpresa, String cnpjEmpresa) {
        super(titular, numeroConta);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
