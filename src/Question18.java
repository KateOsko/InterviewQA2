import java.util.Arrays;

public class Question18 {
    /*
    String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";

        int[] arr = new int[100];
Divisible By 15: 15 30 45 60 75 90
Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3= "";

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

       for (int each : arr){
           if(each % 15 == 0){
               divisibleBy15 += each + " ";
           }else if(each % 5 == 0){
               divisibleBy5 += each + " ";
           }else if (each % 3 == 0){
               divisibleBy3 += each + " ";
           }else{
               continue;
           }
       }
        System.out.println("Divisible By 15 : " + divisibleBy15 + "\nDivisible By 5 : " + divisibleBy5 + "\nDivisible By 3 : " + divisibleBy3);
        }



    }



