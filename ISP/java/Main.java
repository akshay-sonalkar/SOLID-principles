package ISP.java;

/**
 * ISP (Interface Segregation Principle) - we should not be forced to implement interfaces we do not use.
 *  - No client should be forced to depend on methods it does not use.
 *  - Instead of one fat interface many small interfaces are preferred based on groups of methods.
 *  - This principle is about business logic and not about code organization.
 *  - It is about how to design the business logic.
 *
 */
public class Main {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        Flyable Eagle = new Eagle();
        sparrow.fly();
        Eagle.fly();

        Penguin penguin = new Penguin();
        penguin.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
