public interface NotificationService {
    public void send(String message, String recipient);
    public void sendMultiple(String message, String ... recipient);
}
