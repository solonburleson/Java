import java.util.HashMap;
import java.util.Set;

public class HashMapTest{
    public static void main(String args[]){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("the first", "Now it begins");
        trackList.put("the second", "moving along");
        trackList.put("the third", "almost to the end");
        trackList.put("the end", "Now it ends");
        String lyrics = trackList.get("the first");
        System.out.println(lyrics);
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}