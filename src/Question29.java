import java.util.*;

public class Question29 {

    /*
    //29
Map -- Min value  and Max value
   Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

output
1
     */
    public static String MinMaxofMap(Map<String, Integer> map) {
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        String max = String.valueOf(Collections.max(arr));
        String min = String.valueOf(Collections.min(arr));

        String both = "max = " + max+ " " + "\nmin = " + min;

        return both;

        /*
        TreeSet implements --> SortedSet
        SortedSet<Integer> treeSet = new TreeSet<>(map.values());
        System.out.println("min = " + treeSet.first());
        System.out.println("max = " + treeSet.last());
         */

    }

    public static void main(String[] args) {

        //Hashmap accepts NULL value as a key
        Map<String, Integer> map = new HashMap<>();
        map.put("f", 6);
        map.put("s", 22891);
        map.put("p", 380);
        map.put("d", 62);

        System.out.println(MinMaxofMap(map));


    }
}
