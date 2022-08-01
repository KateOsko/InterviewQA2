import java.util.Scanner;

public class Question22 {
    /*
        22
        Numbers -- Prime Number. Prime num is a number that divided by itself and 1
        Write a method that can check if a number is prime or not

     */

    public static boolean primeNum (int num){

        for (int i = 2; i < num; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a num");
        int num = input.nextInt();

        System.out.println(primeNum(num));

    }
}


