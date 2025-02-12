package SRP.java;

/**
 * SRP (Single Responsibility Principle) -
 * A class should have only one reason to change, meaning that a class should have
 * only one job or responsibility.
 * - A class should have only one job.
 * - A class should have only one reason to change.
 * - A class should have only one responsibility.
 * - A class should have only one job to do.
 * - A class should have only one purpose.
 *
 */
public class Main {

    public static void main(String[] args) {

        UserDataManagementService userDataManagementService = new UserDataManagementService();

        User user = new User("John Doe", "john@gmail.com", "password");
        userDataManagementService.createUser(user);

        UserAuthenticationService userAuthenticationService = new UserAuthenticationService();

        userAuthenticationService.register(user);
        userAuthenticationService.login(user);

        userDataManagementService.updateUser(user, "John Doe", "johnd@gmail.com", "password");
        userAuthenticationService.changePassword(user);
        userAuthenticationService.logout(user);

        userDataManagementService.deleteUser(user);

        userAuthenticationService.forgotPassword(user);
        userAuthenticationService.resetPassword(user);

        userAuthenticationService.sendEmail(user, "Test email");
        userAuthenticationService.sendSMS(user, "Test SMS");
        userAuthenticationService.sendNotification(user, "Test notification");

        userAuthenticationService.sendEmailNotification(user, "Test email notification");
        userAuthenticationService.sendSMSNotification(user, "Test SMS notification");
        userAuthenticationService.sendEmailSMSNotification(user, "Test email SMS notification");
    }
}
