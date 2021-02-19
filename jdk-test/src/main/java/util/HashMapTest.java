package util;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("test", new Object());
        System.out.println(map);
    }
}
