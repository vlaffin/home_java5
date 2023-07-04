package home_java5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
      public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Russia goes ahead of the hole planet. The planet - is not Russia";
        str = str.toLowerCase().replace(".", "").replace("-", "");
        String[] result = str.split(" ");

        for (String s : result) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("The word: " + entry.getKey() + " - meets " + entry.getValue());
        }
    }
}
