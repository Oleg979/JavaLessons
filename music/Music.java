package music;

import java.util.HashMap;
import java.util.Map;

public class Music {
    public static final String[] REQUIRED_ATTRS = {"name", "performer"};
    private final Map<String, String> attrs = new HashMap<>();
    
    public Music(String... vals) {
        if(vals.length != REQUIRED_ATTRS.length) throw new IllegalArgumentException();
        for(int i = 0; i < vals.length; i++)
            attrs.put(REQUIRED_ATTRS[i], vals[i]);
    }
    
    public boolean hasAttr(String key) {
        return attrs.containsKey(key);
    }
    
    public String getAttr(String key) {
        return attrs.get(key);
    }
    
    public Map<String, String> getAllAttrs() {
        return new HashMap(attrs);
    }
    
    public Music addAttr(String key, String val) {
        if(!hasAttr(key)) attrs.put(key, val);
        return this;
    }
    
    public Music updateAttr(String key, String val) {
        if(hasAttr(key)) attrs.put(key, val);
        return this;
    }
    
    public Music deleteAttr(String... keys) {
        for(String key: keys) 
            for(String req : REQUIRED_ATTRS)
                if(!key.equals(req))
                    attrs.remove(key);
        return this;
    }
    
    @Override
    public String toString() {
        String res = "Music: [ ";
        res = attrs.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue() + ", ").reduce(res, String::concat);
        res += "]";
        return res;
    }
}
