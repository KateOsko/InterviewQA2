import java.util.Arrays;

public class UseArraySort {
    /*
    use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
     */

    public static boolean sameLettersAnagram(String str, String str2) {
        boolean anagram = true;
        String[] arr = str.split(""); // split into String array
        String[] arr2 = str2.split(""); // split into String array
        Arrays.sort(arr); // these are strings, not chars which works the same way after sorting
        Arrays.sort(arr2);

        if ((arr.length == arr2.length) && (Arrays.equals(arr, arr2))) {
            return anagram;
        } else
        return anagram=false;
    }

    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";
        System.out.println(sameLettersAnagram(str, str2));
    }
}

