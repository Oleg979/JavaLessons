package music_attrs;

import java.util.ArrayList;
import java.util.List;

public class MusicWithAttrs {
    private static final String[] requiredAttrs = {"name", "performer"};
    private final List<Attr> attrs = new ArrayList<>();
    
    
    public MusicWithAttrs(Attr... attrs) {
        
    }
    
    public boolean hasAttr(String key) {
        return attrs.stream().anyMatch(a -> a.getKey().equals(key));
    }
    
    public Attr getAttr(String key) throws IllegalArgumentException {
        return attrs.stream().filter(a -> a.getKey().equals(key)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
    
    public List<Attr> getAttrs() {
        return attrs;
    }
    
    public MusicWithAttrs addAttr(String key, String val) {
        if(hasAttr(key)) throw new IllegalArgumentException();
        attrs.add(new Attr(key, val));
        return this;
    }
    
    public MusicWithAttrs addAttr(Attr a) {
       if(hasAttr(a.getKey())) throw new IllegalArgumentException();
       attrs.add(a);
       return this;
    }
    
    public MusicWithAttrs updateAttr(String key, String value) {
        if(!hasAttr(key)) throw new IllegalArgumentException();
        attrs.removeIf(a -> a.getKey().equals(key));
        return addAttr(key, value);
    }
    
    public MusicWithAttrs deleteAttr(String... keys) {
        for(String key : keys) {
            for(String req : requiredAttrs)
                if(key.equals(req)) throw new IllegalArgumentException();
            attrs.removeIf(a -> a.getKey().equals(key));
        }
        return this;
    }
    
    @Override
    public String toString() {
        String res = "Music: [";
        res = attrs.stream().map((a) -> a + ", ").reduce(res, String::concat);
        res += "]";
        return res;
    }
}
