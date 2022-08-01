import java.util.Arrays;

public class Question34 {
    /*
    34  USE double
        Dont use sort get max  4.5
        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        output
        4.5
     */

    public static void main(String[] args) {
        String[] arr = {"1.2", "5.7", "0.3", "88.3", "4.9", "0.23", "87.1" };

        double[] doubleArr = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < doubleArr.length; j++) {
                doubleArr[i] = Double.parseDouble(arr[i]);
            }
        }

        double numMax = 0;

        System.out.println(numMax);



    }
}
