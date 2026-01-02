package org.example.Paradigmas.poo.poo;

public class FolhaPagamentoPOO {

    public static void main(String[] args) {

        Funcionario clt = new FuncionarioCLT(5000);
        Funcionario pj = new FuncionarioPJ(5000);
        Funcionario estagiario = new FuncionarioPJ(1000);

        System.out.println("CLT: R$ " + clt.calcularSalario());
        System.out.println("PJ: R$ " + pj.calcularSalario());
        System.out.println("Estagiário: R$ " + estagiario.calcularSalario());
    }
}

