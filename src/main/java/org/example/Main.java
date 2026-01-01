package org.example;

import org.example.abstracao.certo.Cliente;
import org.example.abstracao.certo.ContaBancaria;
import org.example.abstracao.errado.SistemaFinanceiro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Jeito Errado de Abstração
        System.out.println("Jeito Errado de Abstração");
        SistemaFinanceiro sistemaFinanceiro = new SistemaFinanceiro();
        SistemaFinanceiro sistema = new SistemaFinanceiro();

        sistema.criarConta("João Silva", "123.456.789-00", "001-9");

        sistema.depositar(1000);
        sistema.sacar(300);

        sistema.imprimirResumo();
        System.out.println("Jeito Errado de Abstração");


        //Jeito Certo de Abratração
        System.out.println("Jeito Certo de Abratração");
        // Criando abstrações do domínio
        ContaBancaria conta = new ContaBancaria("123-4");
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", conta);

        // Usando o sistema de forma clara e segura
        cliente.getConta().depositar(1000.0);
        cliente.getConta().sacar(250.0);

        // Exibindo estado através da abstração
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Conta: " + conta.getNumero());
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Jeito Certo de Abratração");






    }
}