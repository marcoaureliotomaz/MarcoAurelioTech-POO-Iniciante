package org.example.funcional;

import java.util.function.Function;

public class RegrasPedido {

    // Aplica desconto de 10%
    public static Function<Pedido, Pedido> aplicarDesconto =
            pedido -> new Pedido(pedido.valor() * 0.90);

    // Aplica imposto de 8%
    public static Function<Pedido, Pedido> aplicarImposto =
            pedido -> new Pedido(pedido.valor() * 1.08);
}
