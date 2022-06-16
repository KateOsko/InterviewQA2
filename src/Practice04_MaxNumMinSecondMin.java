import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice04_MaxNumMinSecondMin {
    /*
    Use Collection int a [] = {2,5,7,15,1,6};
   int a [] = {2,5,7,15,1,6};
   output
   13   < Max number minus second min num and result is 13
     */
    public static void main(String[] args) {
        int a [] = {2,5,7,15,1,6};
        Arrays.sort(a);
        System.out.println("Arrays.sort--> "+ (a[a.length - 1] - a[1]));
        ArrayList<Integer> list=new ArrayList<>();
        for (int each:a) {
            list.add(each);
        }
        list.removeIf(each-> Collections.min(list)==each);
        System.out.println("Collections methods--> "+(Collections.min(list) - Collections.max(list)));
    }
}
