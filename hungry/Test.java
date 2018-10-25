package hungry;

public class Test {
    public static void main(String args[]) {
        new Queue()
            .add(new Dog("Bob"), 20)
            .add(new Human("Jack"), 30)
            .add(new Human("Oleg"), 40)
            .add(new Dog("Muhtar"), 20)
            .add(new Human("Dima"), 40)
            .giveFoodToFirst();
    }
}
