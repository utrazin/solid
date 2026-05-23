package SOLID_ENZO_DUTRA.SRP;

public class PedidoRelatorio {
    public void exibir(Pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Item: " + pedido.getItem());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}
