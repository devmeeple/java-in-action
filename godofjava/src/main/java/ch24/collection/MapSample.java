package ch24.collection;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();

        sample.checkContains();
    }

    public void checkContains() {
        HashMap<String, String> map = new HashMap<>();

        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }
}
