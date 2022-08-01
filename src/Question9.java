import java.util.Arrays;

public class Question9 {
    /*
     String str="DC501GCCCA098911";
     output
     CD015ACCCG011899
     */
    public static void main(String[] args) {


        String str = "DC501GCCCA098911";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }
            if (Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
            }
            if (Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                result += " ";
            }
            if (Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))) {
                result += " ";
            }
        }
        result += str.charAt(str.length() - 1);
        System.out.println(result); // DC 501 GCCCA 098911

        String str2 = "";
        String[] arr = result.split(" ");
        System.out.println(Arrays.toString(arr)); // [DC, 501, GCCCA, 098911]
        for (String each : arr) { //DC 501
            char[] c = each.toCharArray();
            Arrays.sort(c);
            for (char r : c) {
                str2 += "" + r;
            }
        }
        System.out.println(str2);
    }
}
