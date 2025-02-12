package OCP.java;

public class SMSNotification implements Notification {
    @Override
    public void send(User user, String message) {
        System.out.println("SMS sent to " + user.getPhoneNo() + " with message: " + message);
    }
}
