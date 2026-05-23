package SOLID_ENZO_DUTRA.ISP;

public class Gerente implements IntPedido, IntRelatorio, IntNotificacao {
    public void criarPedido() {
        System.out.println("Pedido criado pelo gerente!");
    }

    public void cancelarPedido() {
        System.out.println("Pedido cancelado pelo gerente!");
    }

    public void gerarRelatorio() {
        System.out.println("Relatório gerado!");
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada pelo gerente: " + mensagem);
    }
}
