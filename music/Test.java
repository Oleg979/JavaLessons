package music;

public class Test {
    public static void main(String args[]) {
        new MusicCollection()
              .add(new Music("123", "ccc").addAttr("genre", "rock"))
              .add(new Music("123", "aaa").addAttr("genre", "rock"))
              .add(new Music("345", "ccc").addAttr("genre", "pop"))
              .findBy("performer", "ccc")
              .findBy("genre", "rock")
              .show(); 
    }
}
