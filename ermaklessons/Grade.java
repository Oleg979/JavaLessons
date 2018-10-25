package ermaklessons;
        
public class Grade {
    private final int value;
    private Grade next = null;
    
    public Grade(int value) {
        this.value = value;
    }
    
    public Grade getNext() {
        return next;
    }
    
    public void setNext(Grade grade) {
        next = grade;
    }
    
    public int getValue() {
        return value;
    }
    
    public boolean hasNext() {
        return next != null;
    }
}
