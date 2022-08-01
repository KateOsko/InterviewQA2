import java.util.Arrays;

public class Question13 {
         /*
            int arr1[]={1,2,3};
            int arr2[]={4,5,6,7};
            output
            [1, 2, 3, 4, 5, 6, 7]
         */

    public static int[] mergeArray(int[] num, int[] num2) {
        int[] nums3 = new int[num.length + num2.length];
        int count =0;

        for (int i = 0; i < num.length; i++) {
            nums3[count] = num[i];
            count++;
        }

        for (int j = 0; j < num2.length; j++) {
            nums3[count] = num2[j];
            count++;
        }


        return nums3;

    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] num2 = {5, 6, 7};

        System.out.println(num.length);

        System.out.println(Arrays.toString(mergeArray(num, num2)));


    }
}
