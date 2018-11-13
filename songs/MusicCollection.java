package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {
    private List<Music> songs = new ArrayList<>();
    private List<Attr> restrictions = new ArrayList<>();
    
    private MusicCollection setSongs(List<Music> m) {
        songs = m;
        return this;
    }
    
    public MusicCollection add(Music m) {
        if(checkRestrictions(m)) songs.add(m);
        return this;
    }
    
    public MusicCollection findBy(String key, String val) {
        return new MusicCollection().setSongs(
            songs
                .stream()
                .filter(s -> s.getAttr(key).equals(val))
                .collect(Collectors.toList()));
    }
    
    public MusicCollection removeBy(String key, String val) {
        return new MusicCollection().setSongs(
            songs
                .stream()
                .filter(s -> !s.getAttr(key).equals(val))
                .collect(Collectors.toList()));
    }
    
    public void show() {
        songs.forEach(System.out::println);
    }
    
    public List<Music> getSongs() {
        return songs.subList(0, songs.size());
    }
    
    public MusicCollection addRestriction(String key, String val) {
        restrictions.add(new Attr(key, val));
        return this;
    }
    
    public boolean checkRestrictions(Music m) {
        for(Attr a : m.getAttrs()) 
            for(Attr r : restrictions)
                if(a.getKey().equals(r.getKey()) && !a.getValue().equals(r.getValue()))
                    return false;
        return true;
    }
}

