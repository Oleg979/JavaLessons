package music;

public class Test {
    public static void main(String args[]) {
        new MusicCollection()
              .add(new Music("123", "ccc"))
              .add(new Music("123", "aaa"))
              .add(new Music("345", "ccc"))
              .findBy("performer", "ccc")
              .findBy("name", "123")
              .show(); 
    }
}
