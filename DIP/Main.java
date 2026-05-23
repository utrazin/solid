package SOLID_ENZO_DUTRA.DIP;

public class Main {
    public static void main(String[] args) {
        Notificacao email = new EnvioEmail();
        Notificacao sms = new EnvioSMS();
        Notificacao whatsapp = new EnvioWhatsApp();

        SistemaDelivery sistema1 = new SistemaDelivery(email);
        SistemaDelivery sistema2 = new SistemaDelivery(sms);
        SistemaDelivery sistema3 = new SistemaDelivery(whatsapp);

        sistema1.confirmarPedido();
        sistema2.confirmarPedido();
        sistema3.confirmarPedido();
    }
}
