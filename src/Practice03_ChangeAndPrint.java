public class Practice03_ChangeAndPrint {
    /*
    int a=5;
int b=6;
change and print
a==6;
b==5;
     */
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=a;
        a=b;
        b=c;
        System.out.println("a=="+a);
        System.out.println("b=="+b);
    }
}
