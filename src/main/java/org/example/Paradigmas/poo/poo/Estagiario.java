package org.example.Paradigmas.poo.poo;

public class Estagiario implements Funcionario {

    private double bolsa;

    public Estagiario(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public double calcularSalario() {
        return bolsa;
    }
}
