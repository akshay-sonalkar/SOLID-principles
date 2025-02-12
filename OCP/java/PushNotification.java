package OCP.java;

public class PushNotification implements Notification {
    @Override
    public void send(User user, String message) {
        System.out.println("Push Notification sent to " + user.getName() + " with Message=" + message);
    }
}
