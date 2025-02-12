package SRP.java;

public class UserDataManagementService {

    public void createUser(User userObj) {
        User user = new User(userObj.getName(), userObj.getEmail(), userObj.getPassword());
    }

    public void updateUser(User user, String name, String email, String password) {
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
    }

    public void deleteUser(User user) {
        user = null;
    }

    public void changePassword(User user, String password) {
        user.setPassword(password);
    }

    public void resetPassword(User user) {
        user.setPassword("password");
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
