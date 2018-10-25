package hungry;

public class Human implements Eater {
    private String name;
    
    public Human(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void eat(Food f) {
        System.out.println("Human " + name + " is eating");
    }
    
    @Override
    public String toString() {
        return "Human " + name;
    }
}
