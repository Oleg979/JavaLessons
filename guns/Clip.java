package guns;

public class Clip {
    private int charges;
    
    public Clip(int c) {
        charges = c;
    }
    
    public int getCharges() {
        return charges;
    }
    
    public void decreaseCharges() {
        charges--;
    }
    
    public boolean hasCharges() {
        return charges > 0;
    }
}
