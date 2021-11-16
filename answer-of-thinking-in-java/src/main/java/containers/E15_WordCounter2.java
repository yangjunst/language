package containers;

import net.mindview.util.TextFile;

import java.util.List;

public class E15_WordCounter2 {
    public static void main(String[] args) {
        List<String> words =
                new TextFile("E12_MapsDemo.java", "\\W+");
        SlowMap<String, Integer> map =
                new SlowMap<String, Integer>();
        for (String word : words) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}