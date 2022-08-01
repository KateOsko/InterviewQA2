import java.util.ArrayList;
import java.util.Arrays;

public class Question24 {

    /*
    ArrayList -- Remove "Ahmed"
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));
     */

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Irina", "Anna"));

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Ahmed")){
                names.remove(names.get(i));
            }
        }
        System.out.println(names);

    }



}
