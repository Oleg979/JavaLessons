package guns;

public class Gun implements Firearm {
    private int charges;
    private final int maxCharges;
    
    public Gun(int c) {
        charges = c;
        maxCharges = c;
        System.out.println("Created gun with capacity " + c);
    }
    
    @Override
    public void shoot() {
        if(charges == 0)
            System.out.println("Can't shoot: no charges");
        else {
            charges--;
            System.out.println("Shoot!");
        }
    }
    
    public void addCharges(int c) {
        if(c + charges <= maxCharges && c > 0) charges += c;
        else throw new IllegalArgumentException();
    }
    
    public void recharge() {
        charges = maxCharges;
    }
    
    public int getCharges() {
        return charges;
    }
    
    public int getMaxCharges() {
        return maxCharges;
    }
    
}
