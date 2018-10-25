package guns2;

public class Clip {
    private int charges;
    private final int maxCharges;
    private boolean isInserted = false;
    
    public Clip(int c) {
        maxCharges = c;
        setCharges(c);
    }
    
    public boolean getChargeToShoot() {
        return charges-- > 0;
    }
    
    public int getCharges() {
        return charges;
    }
    
    public void recharge() {
        setCharges(maxCharges);
    }
    
    public int size() {
        return maxCharges;
    }
    
    public void setCharges(int c) {
        if(isInserted) System.out.println("Clip is inserted, can't set charges");
        else if(c <= maxCharges && c > 0) charges = c;
        else System.out.println("Wrong value.");
    }
    
    public boolean isInserted() {
        return isInserted;
    }
    
    public void insertToGun(Gun gun) {
        if(gun.getClip() == null)
            isInserted = true;
    }
    
    public void removefromGun(Gun gun) {
        if(gun.getClip() == this && gun.isAuthorized())
            isInserted = false;
        else System.out.println("Error while removing clip");
    }
}
