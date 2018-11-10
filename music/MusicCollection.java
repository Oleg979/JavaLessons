package music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MusicCollection {
    private List<Music> songs = new ArrayList<>();
    private Map<String, String> restrictions = new HashMap<>();
    
    public MusicCollection add(Music m) {
        songs.add(m);
        return this;
    }
    
    private MusicCollection setSongs(List<Music> m) {
        songs = m;
        return this;
    }
    
    public MusicCollection removeBy(String key, String val) {
        return new MusicCollection().setSongs(songs.stream().filter(s -> !s.getAttr(key).equals(val)).collect(Collectors.toList()));
    }
    
    public MusicCollection findBy(String key, String val) {
        return new MusicCollection().setSongs(songs.stream().filter(s -> s.getAttr(key).equals(val)).collect(Collectors.toList()));
    }
    
    public List<Music> getSongs() {
        return songs.subList(0, songs.size());
    }
    
    public void show() {
        songs.forEach(System.out::println);
    }
}
