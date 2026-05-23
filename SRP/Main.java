package SOLID_ENZO_DUTRA.SRP;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Enzo", "Pizza Margherita", 45.90);

        PedidoRepository repository = new PedidoRepository();
        PedidoRelatorio relatorio = new PedidoRelatorio();

        repository.salvar(pedido);
        relatorio.exibir(pedido);
    }
}
