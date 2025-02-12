package OCP.java;

/**
 * OCP (Open-Closed Principle)
 * Open for extension but closed for modification
 *  - Software entities should be open for extension, but closed for modification.
 *  - The "Open-Closed Principle" states that the design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code.
 *  - The design should be done in a way to allow the adding of new functionality as new classes, keeping as much as possible existing code unchanged.
 *  - The "Open-Closed Principle" applies to the object-oriented design and it is a key principle in the object-oriented design.
 *  - The "Open-Closed Principle" guides the design of classes and class hierarchies
 *
 */
public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        User user = new User("John", "john@gmail.com", "1234567890", 9999999999L);
        notificationService.sendNotification(new EmailNotification(), user, "Hello John");
        notificationService.sendNotification(new SMSNotification(), user, "Hello John");
        notificationService.sendNotification(new PushNotification(), user, "Hello John");
    }
}
