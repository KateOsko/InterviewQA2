import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question28 {
    /*
          28  Find unique
          String str = "accabbcd";
          Map<Character, Integer> unique = new HashMap<>();

     */

    public static void uniqueCharMap(String str) {
        String[] arr = str.split("");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i] )+ 1);
            }
        }

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() == 1) {
                System.out.println(eachEntry.getKey());

                //System.out.println(map.keySet().stream().filter(p -> map.get(p) == 1).collect(Collectors.toList()))
            }
        }
    }

    public static void main(String[] args) {
        String str = "rrdfuuuq";
        uniqueCharMap(str);
    }
}
