package LSP.java;

// LSP (Liskov Substitution Principle) states that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
// In this example, the Bird, Eagle, and Sparrow classes implement the Flyable interface. The Penguin class does not implement the Flyable interface, but it has a swim method.
// The Penguin class is not a subclass of the Bird, Eagle, or Sparrow classes, but it can be used in place of the Bird, Eagle, or Sparrow classes without breaking the application.
// The Penguin class does not have a fly method, but it has a swim method. The Bird, Eagle, and Sparrow classes have a fly method, but they do not have a swim method.
// The Penguin class can be used in place of the Bird, Eagle, or Sparrow classes without breaking the application because the Penguin class has a swim method, which is a common behavior of birds.
// The Bird, Eagle, and Sparrow classes have a fly method, which is a common behavior of birds. The Penguin class does not have a fly method, but it has a swim method, which is a common behavior of birds.
public class Main {

    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable eagle = new Eagle();
        Flyable sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        bird.fly();
        eagle.fly();
        sparrow.fly();
        penguin.swim();
    }
}
