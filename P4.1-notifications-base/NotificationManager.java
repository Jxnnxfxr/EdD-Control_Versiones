// NotificationManager.java - Código a refactorizar
public class NotificationManager {
    // TODO: Separar en clases diferentes: EmailService, SMSService, PushService
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    
    public void send(String type, String message, String recipient) {
        if (type.equals("email")) {
            EmailService email = new EmailService(type, message, recipient);
            email.send(message, recipient);
        } else if (type.equals("sms")) {
            
        } else if (type.equals("push")) {
            // Código para notificación push
            System.out.println("Enviando push a " + recipient + ": " + message);
            // Lógica compleja de push aquí...
        }
    }
    
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}
