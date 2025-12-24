package org.example.poo;

public class FuncionarioPJ implements Funcionario {

    private double valorContrato;

    public FuncionarioPJ(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public double calcularSalario() {
        return valorContrato;
    }
}

