package music_attrs;

public class Attr {
    private final String key;
    private final String value;

    public Attr(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return key + ": " + value;
    }
}
