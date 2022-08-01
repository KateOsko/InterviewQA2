import java.util.Arrays;

public class Question26 {

    /*
        26
        Write a method that can check if a number is Armstrong  number

        Armstrong number is a number that is equal to the sum of cubes of its digits.
        For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
        understand why 153 is an Armstrong number. Let's try to understand why 371 is an
        Armstrong number.
    */

    public static boolean armStrong(int num) {

        // int num = 153
        String num2 = String.valueOf(num); // creating a new String num2 to turn it into a String
        String[] num3 = num2.split(""); // splitting this String into each element and place it into an Array numArr

        // creating an empty Array
        int size = num3.length;
        int[] numArr = new int[size];


        // adding each String element into numArr and turning it into int elements
        for (int i = 0; i < size; i++) {
            numArr[i] += Integer.parseInt(num3[i]);
        }

        // looping through numArr and multiplying three times (to find a cube of each element) --> then add them into an int summary
        int summary = 0;
        for (int i = 0; i < numArr.length; i++) {
            summary += numArr[i] * numArr[i] * numArr[i];
        }

        // if summary==num -->Armstrong number ==true;
        if (summary == num) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(armStrong(371));
    }
}
