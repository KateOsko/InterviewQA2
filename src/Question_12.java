import java.util.ArrayList;

public class Question_12 {

    public static void main(String[] args) {


        int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int each:arr){
            if (each !=0){
                list.add(each);
            }
        }
        for (int each: arr){
            if (each==0){
                list.add(each);
            }
        }
        System.out.println(list);

    }
}
