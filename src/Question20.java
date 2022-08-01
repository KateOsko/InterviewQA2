import java.util.Scanner;

public class Question20 {
    /*
    //20
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is
 divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
 a concatenation of the respective words Codility, Test and Coders in this
 given order. For example, numbers divisible by both 2 and 3 should be
 replacée by CodilityTest and numbers divisible by all three numbers: 2,3
 and 5, should be replaced by CodilityTestCoders.

     */


   public static String CodilityTestCoders(int N) {
       String str="";
       for (int i = 1; i <= N; i++) {
           if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
               str+="CodilityTestCoders\n";
           }
           if (i % 2 == 0 && i % 3 == 0) {
               str+="CodilityTest\n";
           }
           if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
               str+="Codility\n";
           } else {
               str+=(i+"\n");
           }
       }
       return str;
   }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("print a number");
            int N = input.nextInt();
            System.out.println(CodilityTestCoders(N));
    }
}

