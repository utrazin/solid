package SOLID_ENZO_DUTRA.OCP;

public class PagamentoDinheiro implements FormaPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado em Dinheiro!");
    }
}
