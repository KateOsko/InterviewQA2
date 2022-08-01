import java.util.*;

public class Question25 {
    /*

   //25 USE ITERATOR
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

    output
[1, 2, 3, 4, 5, 6, 7, 8, 9]

    */

    public static List<Integer> removeAfter100(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1000, 2, 3, 4, 44, 6, 7, 8, 9, 101, 200, 300));
        System.out.println(removeAfter100(list));
    }
}
