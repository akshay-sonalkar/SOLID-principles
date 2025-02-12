package OCP.java;

public class EmailNotification implements Notification {
    @Override
    public void send(User user, String message) {
        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }
}
