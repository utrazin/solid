package SOLID_ENZO_DUTRA.DIP;

public class SistemaDelivery {
    private Notificacao notificacao;

    public SistemaDelivery(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void confirmarPedido() {
        notificacao.enviar("Seu pedido foi confirmado!");
    }
}
