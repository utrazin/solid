package SOLID_ENZO_DUTRA.OCP;

public class PagamentoCartao implements FormaPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão!");
    }
}
