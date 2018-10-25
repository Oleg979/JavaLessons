package guns2;

public class Test {
    public static void main(String args[]) {
        Clip clip = new Clip(3);
        Gun gun = new Gun(clip);
        
        for(int i = 0; i < 4; i++) gun.shoot();
        
        gun.removeClip();
        clip.setCharges(3);
        gun.insertClip(clip);

        for(int i = 0; i < 4; i++) gun.shoot();

        clip.setCharges(3);
        for(int i = 0; i < 2; i++) gun.shoot();

        gun.reload(new Clip(5));
        for(int i = 0; i < 6; i++) gun.shoot();

    }
}
