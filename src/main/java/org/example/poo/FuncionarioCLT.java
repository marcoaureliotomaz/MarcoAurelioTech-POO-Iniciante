package org.example.poo;

public class FuncionarioCLT implements Funcionario {

    private double salarioBase;

    public FuncionarioCLT(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * 0.10);
    }
}

