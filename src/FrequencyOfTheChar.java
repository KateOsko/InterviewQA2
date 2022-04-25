import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfTheChar {
    /*
    YOU WILL USE 3 WAY TO DO THAT.
    1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
    Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    // 1. Using While Loop
    public static String frequencyWhileLoop (String str) {
        String str2 = ""; //to collect the letters that been checked

        int j = 0;
        int i = 0;
        int count = 0;

        while (i < str.length()) { // this loop is to check if the letter is in the empty string (str2 ) or not , if its there then no need to check Continue.
            char x = str.charAt(i);
            if (str2.contains(x + "")) {
                i++;
                continue;
            } else {
                str2 += x;
                while (j < str.length()) {
                    if (str.charAt(j) == x) {
                        count++;
                    }
                    j++;
                }
                str2+= count;
                count = 0;
                j = 0;
            }
            i++;
        }
        return str2;
    }



    // 2. Using ForLoop
    public static String frequencyStr(String str) {
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            if (checked.contains(str.charAt(i) + "")) {
                continue;
            }
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            checked += str.charAt(i)+"" + count;
        }
        return checked;

        }


    // 3. Using Frequency
    public static String frequencyArr(String str) {
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (String each : str2) {
            int frequency = Collections.frequency(str2, each);
            if (result.contains(each)) {
                continue;
            } else {
                result += each + frequency;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "AAABBRRRRRRCDD";

        System.out.println(frequencyWhileLoop(str));
        System.out.println(frequencyStr(str));
        System.out.println(frequencyArr(str));



    }
    }





    


