package ch24.collection;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();

        sample.checkRemove();
    }

    public void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

        map.remove("A");

        System.out.println(map.size());
    }
}
