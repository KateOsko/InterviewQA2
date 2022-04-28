public class Question16 {
    /*
    //16  USE WHILE LOOP
    int num1=5;
    int num2=2;

    output
    5 devided by 2 is: 2 and remainder is 1
     */

    public static String str (int a, int b){
        int c = 0;
        int d = 0;
        while (a >0 && b>0){
           c= a/b;
           d=a%b;

           break;
        }
        String str = a +" divided by " + b + " is:  " + c + " and remainder is " +d;
        return str;
    }

    public static void main(String[] args) {

        System.out.println(str(10,5));
    }
}
