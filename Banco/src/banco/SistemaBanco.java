package banco;

import contas.ContaPf;
import contas.ContaPj;

public class SistemaBanco {

    public static void main(String[] args) {

        ContaPf contaPf = new ContaPf("Mutante Alan Joabio", "123456");
        ContaPj contaPj = new ContaPj("Marlus Xavier", "654321", "Empresa X-Mem", "123.456.789/0001-10");

        System.out.println("Conta pessoa física:");
        System.out.println("Titular: " + contaPf.getTitular());
        System.out.println("Número da conta: " + contaPf.getNumeroConta());
        System.out.println("");

        System.out.println("Conta pessoa jurídica:");
        System.out.println("Titular: " + contaPj.getTitular());
        System.out.println("Número da conta: " + contaPj.getNumeroConta());
        System.out.println("Nome da empresa: " + contaPj.getNomeEmpresa());
        System.out.println("CNPJ da empresa: " + contaPj.getCnpjEmpresa());
    }
}

