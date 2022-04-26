import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maxtomin {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        ArrayList<Integer> fromMaxToMin= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            fromMaxToMin.add(Collections.max(list));
            list.remove(Collections.max(list));
            i--;
        }

        System.out.println(fromMaxToMin);




    }
}
