package org.example.funcional;

import java.util.function.Function;

public class ProcessadorPedido {

    public static void main(String[] args) {

        Pedido pedidoOriginal = new Pedido(100.0);

        // Composição das funções
                Function<Pedido, Pedido> processamento =
                RegrasPedido.aplicarDesconto
                        .andThen(RegrasPedido.aplicarImposto);

        Pedido pedidoFinal = processamento.apply(pedidoOriginal);

        System.out.println("Valor original: R$ " + pedidoOriginal.valor());
        System.out.println("Valor final: R$ " + pedidoFinal.valor());
    }
}
