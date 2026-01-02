package org.example.Paradigmas.funcional;

import java.util.function.Function;

public class FolhaPagamentoFuncional {

    // Regra principal
    static Function<Double, Double> salarioClt =
            salarioBase -> salarioBase - (salarioBase * 0.10) + 500;

    static Function<Double, Double> salarioPj =
            salarioBase -> salarioBase;

    // THEN: regra aplicada depois
    static Function<Double, Double> bonus =
            salario -> salario > 6000 ? salario + 300 : salario;

    static double calcularSalario(String tipo, double salarioBase) {

        Function<Double, Double> regra =
                tipo.equals("CLT") ? salarioClt : salarioPj;

        // Composição: calcula salário E DEPOIS aplica bônus
        return regra
                .andThen(bonus)
                .apply(salarioBase);
    }

    public static void main(String[] args) {

        double salarioClt = calcularSalario("CLT", 5000);
        double salarioPj = calcularSalario("PJ", 7000);

        System.out.println("CLT: R$ " + salarioClt);
        System.out.println("PJ: R$ " + salarioPj);
    }
}
