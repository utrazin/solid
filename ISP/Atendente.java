package SOLID_ENZO_DUTRA.ISP;

public class Atendente implements IntPedido, IntNotificacao {
    public void criarPedido() {
        System.out.println("Pedido criado!");
    }

    public void cancelarPedido() {
        System.out.println("Pedido cancelado!");
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada: " + mensagem);
    }
}
