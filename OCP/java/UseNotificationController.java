package OCP.java;

public class UseNotificationController {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        User user = new User("John", "john@gmail.com", "1234567890", 9999999999L);
        notificationService.sendNotification(new EmailNotification(), user, "Hello John");
        notificationService.sendNotification(new SMSNotification(), user, "Hello John");
        notificationService.sendNotification(new PushNotification(), user, "Hello John");
    }
}
