import javax.imageio.stream.ImageInputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question27 {
    /*
    //27 frequency
        String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        output
        {A=2, B=2, D=3, C=1}
     */

    public static void frequencyOfChar(String a) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            System.out.println((eachEntry.getKey() + eachEntry.getValue()));
        }
    }

    public static void main(String[] args) {
        String a = "abracadabra";
        frequencyOfChar(a);
    }
}
