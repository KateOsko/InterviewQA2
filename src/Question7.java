public class Question7 {
    /*Q7
    String h="AAABBBCCCDEF";
    String result = "";

    expected output:
  DEF

     */
    public static String unique(String str) {  // A A A B B B C C C D E F
        String unique = "";

        for (int i = 0; i < str.length(); i++) {   // i=(0)A
            int count = 0;

            for (int j = 0; j < str.length(); j++) { // j=(0)A  |  j=(1)
                if (str.charAt(i) == str.charAt(j)) {  // is A==A -> true | A==A-> true | | A==A-> true
                    count++;  // int count = 1-> 2->3
                } // if

            }//for j
            if (count == 1) {
                unique += str.charAt(i);
            } //if ==1
        } //for i
        //System.out.println(unique);
        return unique;
    } //method

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));


    }//main

}   //class

