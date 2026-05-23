package SOLID_ENZO_DUTRA.LSP;

public class Bebida extends Produto {
    @Override
    void descrever() {
        System.out.println("Bebida: produto líquido para acompanhar o pedido!");
    }
}
