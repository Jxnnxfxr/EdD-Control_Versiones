public class SMSService implements NotificationService{
 //ATRIBUTOS:
    private String type;
    private String message;
    private String recipient;
    

    //CONSTRUCTOR
    public SMSService(String type, String message, String recipient) {
        this.type = type;
        this.message = message;
        this.recipient = recipient;
    }

    //GETTERS AND SETTERS
    public String getType() {   return type;    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {    return message; }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {  return recipient;   }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    

    //MÉTODOS DE LA CLASE
    //TODO: CÓDIGO PARA ENVIAR EMAIL
    @Override 
    public void send(String message, String recipient){
            // Código para enviar SMS
            System.out.println("Enviando SMS a " + recipient + ": " + message);

    }
    
    @Override
    public void sendMultiple(String message, String... recipient) {
        System.out.println("Enviando mensaje a " + recipient.toString());
        System.out.println("Mensaje: " + message);
    }

 

}
