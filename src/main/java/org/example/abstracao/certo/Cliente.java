package org.example.abstracao.certo;

public class Cliente {

    private String nome;
    private String cpf;
    private ContaBancaria conta;

    public Cliente(String nome, String cpf, ContaBancaria conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaBancaria getConta() {
        return conta;
    }
}
