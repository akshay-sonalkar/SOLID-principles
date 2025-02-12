package OCP.java;

public class NotificationService {
    public void sendNotification(Notification notification, User user, String message) {
        notification.send(user, message);
    }
}
