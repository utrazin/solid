package SOLID_ENZO_DUTRA.ISP;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        atendente.criarPedido();
        atendente.cancelarPedido();
        atendente.enviarNotificacao("Seu pedido foi confirmado!");

        Entregador entregador = new Entregador();
        entregador.atribuirEntregador();
        entregador.rastrearEntrega();

        Gerente gerente = new Gerente();
        gerente.criarPedido();
        gerente.gerarRelatorio();
        gerente.enviarNotificacao("Relatório disponível!");
    }
}
