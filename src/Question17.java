public class Question17 {
    /*
    int  a = 10;
        int  b  = 20;

        output
      a  20
      b  10
     */
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

       a = a + b; // a = 10 + 20
       b = a - b; // b = 30 - 20 = 10
       a = a - b; // a = 30 - 10 = 20

        System.out.println(a);
        System.out.println(b);

    }
}