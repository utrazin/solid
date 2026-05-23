package SOLID_ENZO_DUTRA.DIP;

public class EnvioWhatsApp implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Notificação enviada por WhatsApp: " + mensagem);
    }
}
