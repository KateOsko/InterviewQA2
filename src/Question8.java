import java.util.Arrays;

public class Question8 {
    /*
    String s="1a2b3c4f!@# ";
    int sum=0;
        String letter="";
        String digit="";
        String sign="";

   output
   10
a b c f
1 2 3 4
!@#
     */

    //public static  String method (String str) {

    // String s="1a2b3c4f!@#";
//        int sum = 0;
//        String letter = "";
//        String digit = "";
//        String sign = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char symbols = str.charAt(i);
//
//            if (symbols >= 'a' && symbols <= 'z') {
//                letter += symbols + " ";
//            } else if (symbols >= '1' && symbols <= '9') {
//                digit += symbols + " ";
//            } else {
//                sign += symbols + " ";
//            }

    //  }

//
//        System.out.println(digit);
//        System.out.println(sign);
//        return letter;

    //}


    public static void main(String[] args) {

        String letter = "";
        String digit = "";
        String sign = "";
        String str = "1a2b3Ga?gwG362*&4@#$c4f!@#";
        for (int i = 0; i < str.length(); i++) {
            char symbols = str.charAt(i);

            if (Character.isLowerCase(symbols) || Character.isUpperCase(symbols)){
                letter += symbols;
            } else if (Character.isDigit(symbols)){
                digit += symbols;
            } else {
                sign += symbols;
            }
        }
        System.out.println(Arrays.toString(digit.toCharArray()));  //store them into Array just for fun
        System.out.println(Arrays.toString(letter.toCharArray()));
        System.out.println(sign);

        int sum=0;

//        char[]arr =  digit.toCharArray();
//        int whatever = Integer.parseInt(Arrays.toString(arr));
//        for ( char each    : arr    ) {
//            sum+=each;
//
//        }

        System.out.println(sum);
    }
}
