package SOLID_ENZO_DUTRA.DIP;

public class EnvioEmail implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Notificação enviada por Email: " + mensagem);
    }
}
