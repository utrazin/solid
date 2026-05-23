package SOLID_ENZO_DUTRA.DIP;

public class EnvioSMS implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Notificação enviada por SMS: " + mensagem);
    }
}
