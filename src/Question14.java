public class Question14 {
    /*
        14 Use String
        int a=5;
        if number is odd output will be odd, if number is even output will be even
     */

    public static String EvenOrOdd(int a) {

        return (a % 2 == 0) ? "even" : "odd";
    }

    public static void main(String[] args) {
        int a = 155;
        System.out.println(EvenOrOdd(a));
    }
}

