package ISP.java;

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
