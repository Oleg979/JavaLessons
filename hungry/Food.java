package hungry;

public class Food {
    private int quality = 100;
    
    public int getQuality() {
        return quality;
    }
    
    public void decreaseQuality(int n) {
        quality -= n;
    }
}
