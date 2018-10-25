package hungry;

public class Dog implements Eater {
    private String nickName;
    
    public Dog(String n) {
        nickName = n;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    @Override
    public void eat(Food f) {
        System.out.println("Dog " + nickName + " is eating");
    }
    
    @Override
    public String toString() {
        return "Dog " + nickName;
    }
}
