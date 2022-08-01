import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Question5 {
    /*
    Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        ArrayList<Integer> fromMinToMax = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            fromMinToMax.add(Collections.min(list));
           list.remove(Collections.min(list));
            i--;
        }
        System.out.println(fromMinToMax);
        ArrayList<Integer> fromMaxToMin = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            fromMaxToMin.add(Collections.max(list));
            list.remove(Collections.max(list));
            i--;
        }
        System.out.println(fromMaxToMin);
     /*
      ---------------SECOND------------
Store into Array
2int[] arr = {1, 2, 3, 49, 6, 5};
ArrayList<Integer> list = new ArrayList();
      */

        int[] arr = {1, 2, 3, 49, 6, 5};
        int[] arr2 = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (number < arr[j]) {
                    count++;
                }
            }
            arr2[count] = arr[i];
            count = 0;
        }
        ArrayList<Integer> maxMinWithArr = new ArrayList<>();
        for (Integer each : arr2) {
            maxMinWithArr.add(each);
        }
        System.out.println(maxMinWithArr);

        int[] newarr = {1, 2, 3, 49, 6, 5};
        int[] newarr2 = new int[arr.length];
        int count2 = 0;
        for (int i = 0; i < newarr.length; i++) {
            int number = newarr [i];
            for (int j = 0; j < newarr.length; j++) {
                if (number > newarr[j]) {
                    count2++;
                }
            }
            newarr2[count2] = number;
            count2 = 0;

        }
        ArrayList<Integer> minMAxWithArr = new ArrayList<>();
        for (Integer each : newarr) {
            minMAxWithArr.add(each);
        }
        System.out.println(minMAxWithArr);


    }

}

