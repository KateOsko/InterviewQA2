import java.util.ArrayList;
import java.util.Arrays;

public class Question23 {

    /*
    int num=-1234556;
-6554321
     */
    public static void main(String[] args) {

    int num = -1234556;
    String numsAsString = String.valueOf(num);
    String num2 = "-";

        for (int i = numsAsString.length() -1; i > 0; i--) {
          num2 += numsAsString.charAt(i);
        }

     int numsReversed = Integer.parseInt(num2);
        System.out.println(numsReversed);


}}
