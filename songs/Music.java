package songs;

import java.util.ArrayList;
import java.util.List;

public class Music {
    private final List<Attr> attrs = new ArrayList<>();
    public static final String[] REQUIRED_ATTRS = {"name", "performer"};
    
    public Music(String... vals) {
        if(vals.length < REQUIRED_ATTRS.length) throw new IllegalArgumentException();
        for(int i = 0; i < REQUIRED_ATTRS.length; i++)
            addAttr(REQUIRED_ATTRS[i], vals[i]);
    }
    
    public List<Attr> getAttrs() {
        return attrs;
    }
    
    public String getAttr(String key) {
        return attrs
                .stream()
                .filter(a -> a.getKey().equals(key))
                .findFirst()
                .get()
                .getValue();
    }
    
    public boolean hasAttr(String key) {
        return attrs
                .stream()
                .anyMatch(a -> a.getKey().equals(key));
    }
    
    public Music addAttr(String key, String value) {
        if(!hasAttr(key)) attrs.add(new Attr(key, value));
        return this;
    }
    
    public Music deleteAttr(String key) {
        attrs.removeIf(a -> a.getKey().equals(key) && !isRequired(key));
        return this;
    }
    
    public Music updateAttr(String key, String value) {
        if(!hasAttr(key)) return this;
        deleteAttr(key);
        return addAttr(key, value);
    }
    
    private boolean isRequired(String key) {
        for(String req : REQUIRED_ATTRS)
            if(key.equals(req)) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return attrs
                .stream()
                .map(a -> a + " ")
                .reduce("Music: ", String::concat);
    }
}
