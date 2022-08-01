import java.util.Scanner;

public class Question21 {
    /*
         21
        Factorial Number
        5*4*3*2*1
        repeated action is to multiply numbers by one less than it
        stopping point: get to 1
     */

    public static int Factorial(int num) {
        int total = 1;

        while (num > 0) {
            total *= num; // 1+20*19*
            num--;

        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num");
        int num = input.nextInt();
        System.out.println(Factorial(num));
    }


}
