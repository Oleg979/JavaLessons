package songs;

public class Test {
    public static void main(String args[]) {
        new MusicCollection()
              .addRestriction("year", "2000")
              .addRestriction("genre", "folk")
              .add(new Music("345", "ccc").addAttr("year", "2001"))
              .add(new Music("123", "ccc").addAttr("genre", "rock"))
              .add(new Music("123", "aaa").addAttr("year", "2012"))
              .add(new Music("345", "ccc").addAttr("year", "2000"))
              .show(); 
        
        System.out.println();
        
        new MusicCollection()
              .add(new Music("123", "ccc").addAttr("genre", "rock"))
              .add(new Music("123", "aaa").addAttr("genre", "rock"))
              .add(new Music("345", "ccc").addAttr("genre", "pop"))
              .findBy("performer", "ccc")
              .findBy("genre", "rock")
              .show();
    }
}

