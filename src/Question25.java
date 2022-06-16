import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Question25 {
    /*

   //25 USE ITERATOR
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

    output
[1, 2, 3, 4, 5, 6, 7, 8, 9]

    */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1000,2,3,4,44,6,7,8,9,101,200,300));
        ArrayList<Integer> list2 = new ArrayList<>();

       //1
        Iterator<Integer> iter = list1.iterator();
        System.out.println(list1);

        //2
        for (Integer each: list1) {
            list2.add(each);
        }
        System.out.println(list2);
        }




    }
