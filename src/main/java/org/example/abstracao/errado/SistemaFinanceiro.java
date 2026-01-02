package org.example.abstracao.errado;

public class SistemaFinanceiro {

    // Dados do cliente
    public String nomeCliente;
    public String cpf;

    // Dados da conta
    public String numeroConta;
    public double saldo;

    // Dados da última transação
    public String tipoTransacao;
    public double valorTransacao;

    public void criarConta(String nome, String cpf, String numeroConta) {
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.tipoTransacao = "DEPÓSITO";
        this.valorTransacao = valor;
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.tipoTransacao = "SAQUE";
        this.valorTransacao = valor;
        this.saldo -= valor;
    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Última transação: " + tipoTransacao);
        System.out.println("Valor da transação: " + valorTransacao);
    }
}


