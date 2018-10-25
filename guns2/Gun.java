package guns2;

public class Gun {
    private Clip clip;
    private boolean isAuthorized;
    
    public Gun(Clip c) {
        insertClip(c);
    }
   
    public void insertClip(Clip c) {
        if(clip != null) System.out.println("Clip is already inserted.");
        else {
            c.insertToGun(this);
            clip = c;
        }
    }
    
    public void removeClip() {
        isAuthorized = true;
        clip.removefromGun(this);
        clip = null;
        isAuthorized = false;
    }
    
    public void reload(Clip c) {
        removeClip();
        insertClip(c);
    }
    
    public void shoot() {
        if(clip == null) System.out.println("No clip!");
        else if(clip.getChargeToShoot()) System.out.println("Bang!");
        else System.out.println("Out of charges!");
    }
    
    public Clip getClip() {
        return clip;
    }
    
    public boolean isAuthorized() {
        return isAuthorized;
    }
}
