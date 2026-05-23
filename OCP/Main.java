package SOLID_ENZO_DUTRA.OCP;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new PagamentoCartao();
        FormaPagamento pix = new PagamentoPix();
        FormaPagamento dinheiro = new PagamentoDinheiro();

        cartao.pagar(45.90);
        pix.pagar(32.00);
        dinheiro.pagar(20.00);
    }
}
