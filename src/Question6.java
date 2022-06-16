public class Question6 {
    /*
    String h="AAABBBCCC";
        String result = "";

output
ABC
     */
    public static void main(String[] args) {

    String str ="AAABBBCCC";
    String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            if(!uniqueChars.contains("" + str.charAt(i))){
                uniqueChars += str.charAt(i);
            }
        }
        System.out.println(uniqueChars);

}}
