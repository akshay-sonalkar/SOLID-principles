package SRP.java;

public class UserAuthenticationService {

    public boolean authenticateUser(User user) {
        return true;
    }

    public void login(User user) {
        System.out.println("User " + user.getEmail() + " logged in");
    }

    public void logout(User user) {
        System.out.println("User " + user.getEmail() + " logged out");
    }

    public void register(User user) {
        System.out.println("User " + user.getEmail() + " registered");
    }

    public void forgotPassword(User user) {
        System.out.println("User " + user.getEmail() + " forgot password");
    }

    public void resetPassword(User user) {
        System.out.println("User " + user.getEmail() + " reset password");
    }

    public void changePassword(User user) {
        System.out.println("User " + user.getEmail() + " changed password");
    }

    public void sendEmail(User user, String message) {
        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }

    public void sendSMS(User user, String message) {
        System.out.println("SMS sent to " + user.getEmail() + " with message: " + message);
    }

    public void sendNotification(User user, String message) {
        System.out.println("Notification sent to " + user.getEmail() + " with message: " + message);
    }

    public void sendEmailNotification(User user, String message) {
        sendEmail(user, message);
        sendNotification(user, message);
    }

    public void sendSMSNotification(User user, String message) {
        sendSMS(user, message);
        sendNotification(user, message);
    }

    public void sendEmailSMSNotification(User user, String message) {
        sendEmail(user, message);
        sendSMS(user, message);
        sendNotification(user, message);
    }
}
