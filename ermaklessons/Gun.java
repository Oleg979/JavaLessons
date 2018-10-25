package ermaklessons;

public class Gun {
    
    private int charges;
    private final int max;
    
    public Gun(int charges) {
        if(charges < 1) throw new IllegalArgumentException();
        this.charges = charges;
        max = charges;
        System.out.println("Чик-чик!");
    }
    
    public void shoot() {
        if(charges == 0)
            System.out.println("Клац!");
        else {
            charges--;
            System.out.println("Бац!");
        }
    }
    
    public void addCharges(int c) {
        if(c + charges <= max && c > 0) charges += c;
        else throw new IllegalArgumentException();
    }
    
    public void addCharges(Mag mag) {
        addCharges(mag.getAmount());
    }
    
    public void recharge() {
        charges = max;
    }
    
    public int getCharges() {
        return charges;
    }
}
