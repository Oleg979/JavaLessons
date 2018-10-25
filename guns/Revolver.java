package guns;

public class Revolver implements Firearm {
    private Clip clip;
    
    public Revolver(Clip c) {
        this();
        insertClip(c);
    }
    
    public Revolver() {
        System.out.println("Created revolver");
    }
    
    public void insertClip(Clip c) {
        if(clip != null) {
            System.out.println("You need to remove clip first!");
            return;
        }
        clip = c;
        System.out.println("Clip with capacity " + clip.getCharges() + " inserted into revolver");
    }
    
    public void removeClip() {
        clip = null;
        System.out.println("Clip removed from revolver");
    }
    
    public Clip getClip() {
        return clip;
    }
    
    @Override
    public void shoot() {
        if(!canShoot())
            System.out.println("Can't shoot: clip is empty");
        else {
            clip.decreaseCharges();
            System.out.println("Shoot!");
        }
    }
    
    public boolean canShoot() {
        return clip.hasCharges();
    }
    
}
