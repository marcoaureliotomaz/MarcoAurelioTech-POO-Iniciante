package org.example.procedural;

public class FolhaPagamentoProcedural {

    // Constantes "espalhadas"
    static final int CLT = 1;
    static final int PJ = 2;

    static double calcularSalario(int tipo, double valorBase) {

        if (tipo == CLT) {
            // CLT tem desconto fixo
            return valorBase - (valorBase * 0.10);
        }

        if (tipo == PJ) {
            // PJ não tem desconto
            return valorBase;
        }

        return 0;
    }

    public static void main(String[] args) {

        double salarioClt = calcularSalario(CLT, 5000);
        double salarioPj = calcularSalario(PJ, 5000);

        System.out.println("CLT: R$ " + salarioClt);
        System.out.println("PJ: R$ " + salarioPj);
    }
}
